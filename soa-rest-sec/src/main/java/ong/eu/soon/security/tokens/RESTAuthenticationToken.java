package ong.eu.soon.security.tokens;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class RESTAuthenticationToken extends
UsernamePasswordAuthenticationToken {

	public RESTAuthenticationToken(Object principal, Object credentials) {
		super(principal, credentials);
	}

	public RESTAuthenticationToken(Object principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}
}
