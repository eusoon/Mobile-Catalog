package ong.eu.soon.rest.sec.web.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.PrivilegedActionException;
import java.sql.Timestamp;
import java.util.Collection;

import javax.security.auth.login.LoginException;

import net.sourceforge.spnego.SpnegoHttpURLConnection;

import ong.eu.soon.rest.common.security.SpringSecurityUtil;
import ong.eu.soon.rest.sec.model.AuthenticationResponse;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;

import org.apache.commons.codec.binary.Hex;
import org.ietf.jgss.GSSException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;
/**
 * - note: this controller will start working with the User model and, if
 * necessary, will move to a Authentication resource (which is the way it should
 * work)
 */
@Controller
public class AuthenticationController {

	private static final int PORT = 4567;

	public AuthenticationController() {
		super();
	}

	// API

	@RequestMapping(method = RequestMethod.GET, value = UriMappingConstants.AUTHENTICATION)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public AuthenticationResponse createAuthentication() {
		final Authentication authenticationInSpring = SpringSecurityUtil
				.getCurrentAuthentication();

		final Function<GrantedAuthority, Privilege> springAuthorityToPrivilegeFunction = new Function<GrantedAuthority, Privilege>() {
			@Override
			public final Privilege apply(final GrantedAuthority springAuthority) {
				return new Privilege(springAuthority.getAuthority());
			}
		};
		final Collection<Privilege> privileges = Collections2.transform(
				authenticationInSpring.getAuthorities(),
				springAuthorityToPrivilegeFunction);
		final Role defaultRole = new Role("defaultRole",
				Sets.<Privilege> newHashSet(privileges));

		final User authenticationResource = new User(
				authenticationInSpring.getName(),
				(String) authenticationInSpring.getCredentials(),
				Sets.<Role> newHashSet(defaultRole));

		AuthenticationResponse response = new AuthenticationResponse();
		response.setUser(authenticationResource);
		response.setStatusCode(AuthenticationResponse.SUCCESS_CODE);
		response.setServerTimeStamp(new Timestamp(System.currentTimeMillis())
		.toString());

		return response;
	}

	@RequestMapping(method = RequestMethod.GET, value = UriMappingConstants.KERBEROS)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String getKerberosToken(
			@RequestParam("servicePrincipalName") String servicePrincipalName,
			@RequestParam("oid") String oid,
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		System.setProperty("java.security.krb5.conf", "krb5.conf");
		System.setProperty("sun.security.krb5.debug", "true");
		System.setProperty("java.security.auth.login.config", "login.conf");

		SpnegoHttpURLConnection spnego = null;
		try {
			spnego = new SpnegoHttpURLConnection("custom-client", username,
					password);
			spnego.connect(new URL(servicePrincipalName));

			System.out.println(spnego.getResponseCode());
			return Hex.encodeHexString(spnego.getToken());

		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GSSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrivilegedActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != spnego) {
				spnego.disconnect();
			}
		}
		return null;

	}

}
