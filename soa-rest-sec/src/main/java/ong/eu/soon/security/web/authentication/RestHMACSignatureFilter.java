package ong.eu.soon.security.web.authentication;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class RestHMACSignatureFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
					throws ServletException, IOException {

		String url = request.getHeader("url");
		String hmac = request.getHeader("hmac");
		String contentMD5 = request.getHeader("Content-Md5");

		String apikey = request.getHeader(HMACHelper.APIKEY_HEADER);
		String currentDate = request.getHeader("Date");
		try {
			String verb = "POST";
			String toSign = verb + "\n" + contentMD5 + "\n"
					+ "application/json" + "\n" + currentDate + "\n" + url;
			if (!HMACHelper.validateSignature(toSign, hmac, apikey)) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
						"REST signature failed validation.");
				return;
			}
		} catch (Exception e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
					"The REST Security Server experienced an internal error.");
			return;
		}

		filterChain.doFilter(request, response);
	}
}
