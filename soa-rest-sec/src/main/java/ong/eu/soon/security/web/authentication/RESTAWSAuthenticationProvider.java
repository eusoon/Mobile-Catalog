package ong.eu.soon.security.web.authentication;

import java.security.InvalidKeyException;
import java.text.MessageFormat;


import ong.eu.soon.security.tokens.RESTAuthenticationToken;
import ong.eu.soon.security.tokens.RESTCredentials;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class RESTAWSAuthenticationProvider extends
AbstractUserDetailsAuthenticationProvider {

	UserDetailsService userDetailsService;

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
					throws AuthenticationException {
		// Get Credentials out of the Token...
		RESTAuthenticationToken token = (RESTAuthenticationToken) authentication;
		if (token != null) {
			if (authentication.getCredentials() == null) {
				logger.debug("Authentication failed: no credentials provided");

				throw new BadCredentialsException(
						messages.getMessage(
								"AbstractUserDetailsAuthenticationProvider.badCredentials",
								"Bad credentials"));
			}

			RESTCredentials restCredentials = (RESTCredentials) authentication
					.getCredentials();
			String awsAccessKeyId = (String) token.getPrincipal();
			String signature = restCredentials.getSecureHash();
			String toSign = restCredentials.getRequestSalt();
			try {
				if (!AWSHelper.validateSignature(toSign, signature,
						awsAccessKeyId)) {
					throw new BadCredentialsException(
							messages.getMessage(
									"AbstractUserDetailsAuthenticationProvider.badCredentials",
									"Bad credentials"));
				}
			} catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			throw new AuthenticationCredentialsNotFoundException(
					MessageFormat
					.format("Expected Authentication Token object of type {0}, but instead received {1}",
							RESTAuthenticationToken.class
							.getSimpleName(), authentication
							.getClass().getSimpleName()));
		}

	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication)
					throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDetailsService getUserDetailsService() {
		return userDetailsService;
	}

	public void setUserDetailsService(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

}
