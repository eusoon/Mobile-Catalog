package ong.eu.soon.rest.sec.client.template.test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.spring.ClientTestConfig;
import ong.eu.soon.rest.sec.spring.ContextConfig;
import ong.eu.soon.rest.sec.spring.SecCommonApiConfig;
import ong.eu.soon.rest.sec.util.SecurityConstants;
import ong.euoon.rest.sec.client.template.auth.AuthenticationRestTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ClientTestConfig.class, ContextConfig.class, SecCommonApiConfig.class }, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles({ "client", "mime_json" })
public class AuthenticationClientRestLiveTest {

	@Autowired
	private AuthenticationRestTemplate authenticationRestTemplate;

	// tests

	// GET

	@Test
	public final void whenAuthenticating_then200IsReceived() {
		// When
		final ResponseEntity<User> response = authenticationRestTemplate.authenticate(SecurityConstants.ADMIN_EMAIL, SecurityConstants.ADMIN_PASS);

		// Then
		assertThat(response.getStatusCode().value(), is(200));
	}

}
