package ong.eu.soon.security.web.authentication;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ong.eu.soon.security.tokens.RESTAuthenticationToken;
import ong.eu.soon.security.tokens.RESTCredentials;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

public class RestAWSAuthenticationFilter extends
AbstractAuthenticationProcessingFilter {

	// private static final String SECURE_HASH_PARAMETER_NAME = "AWS";
	// private static final String API_KEY_PARAMETER_NAME = "AWSAccessKeyId";

	/**
	 * @param defaultFilterProcessesUrl
	 *            the default value for <tt>filterProcessesUrl</tt>.
	 */
	protected RestAWSAuthenticationFilter(String defaultFilterProcessesUrl) {
		super(defaultFilterProcessesUrl);
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException,
			IOException {
		String awsAccessKeyId = null;
		String hashedSecureValue = null;

		Map<String, String> headers = new HashMap<String, String>();
		while (request.getHeaderNames().hasMoreElements()) {
			String name = request.getHeaderNames().nextElement();
			String value = request.getHeader(name);
			headers.put(name, value);
		}

		String canonicalizedAmzHeaders = AWSHelper
				.getCanonicalizedAmzHeaders(headers);
		String canonicalizedResource = AWSHelper.getCanonicalizedResource(
				request.getRequestURI(),
				(request.getHeader("Host") != null ? request.getHeader("Host")
						: null));

		String contentMD5 = request.getHeader("Content-MD5") != null ? request
				.getHeader("Content-MD5") : "";
				String contentType = request.getHeader("Content-Type") != null ? request
						.getHeader("Content-Type") : "";
						String date = request.getHeader("Date");
						String method = request.getMethod();

						StringBuilder toSign = new StringBuilder();
						toSign.append(method).append("\n");
						toSign.append(contentMD5).append("\n");
						toSign.append(contentType).append("\n");
						toSign.append(date).append("\n");
						toSign.append(canonicalizedAmzHeaders);
						toSign.append(canonicalizedResource);

						String salt = toSign.toString();
						// String currentDate = request.getHeader("Date");
						try {
							String authorization = request.getHeader("Authorization");
							int delim = authorization.indexOf(":");
							// String signature = null;
							if (delim != -1) {
								String temp = authorization.substring(0, delim);
								if (temp.startsWith(AWSHelper.AWS)) {
									awsAccessKeyId = temp.substring(AWSHelper.AWS.length());
								}
								hashedSecureValue = authorization.substring(delim + 1);
							}
							if (!AWSHelper.validateSignature(toSign.toString(),
									hashedSecureValue,
									awsAccessKeyId)) {
								response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
										"REST signature failed validation.");

							}
						} catch (Exception e) {
							response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
									"The REST Security Server experienced an internal error.");

						}



						AbstractAuthenticationToken authRequest = createAuthenticationToken(
								awsAccessKeyId, new RESTCredentials(salt,
										hashedSecureValue));

						// Allow subclasses to set the "details" property
						setDetails(request, authRequest);

						return getAuthenticationManager().authenticate(authRequest);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		super.successfulAuthentication(request, response, chain, authResult);
		chain.doFilter(request, response);
	}




	/**
	 * Provided so that subclasses may configure what is put into the
	 * authentication request's details property.
	 * 
	 * @param request
	 *            that an authentication request is being created for
	 * @param authRequest
	 *            the authentication request object that should have its details
	 *            set
	 */
	protected void setDetails(HttpServletRequest request,
			AbstractAuthenticationToken authRequest) {
		authRequest.setDetails(authenticationDetailsSource
				.buildDetails(request));
	}

	private AbstractAuthenticationToken createAuthenticationToken(
			String apiKeyValue, RESTCredentials restCredentials) {
		return new RESTAuthenticationToken(apiKeyValue, restCredentials);
	}

	@Override
	/**
	 * Because we require the API client to send credentials with every request, we must authenticate on every request
	 */
	protected boolean requiresAuthentication(HttpServletRequest request,
			HttpServletResponse response) {
		return true;
	}

}
