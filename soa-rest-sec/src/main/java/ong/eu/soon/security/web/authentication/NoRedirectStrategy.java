package ong.eu.soon.security.web.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.RedirectStrategy;

public class NoRedirectStrategy implements RedirectStrategy {

	@Override
	public void sendRedirect(HttpServletRequest request,
			HttpServletResponse response, String url) {
		// Forget about redirecting, there is no need!
	}
}