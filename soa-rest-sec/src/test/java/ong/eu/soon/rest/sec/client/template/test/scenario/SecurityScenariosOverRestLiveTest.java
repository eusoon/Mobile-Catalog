package ong.eu.soon.rest.sec.client.template.test.scenario;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.RoleEntityOpsImpl;
import ong.eu.soon.rest.sec.model.UserEntityOpsImpl;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.spring.ClientTestConfig;
import ong.eu.soon.rest.sec.spring.ContextConfig;
import ong.eu.soon.rest.sec.spring.SecCommonApiConfig;
import ong.euoon.rest.sec.client.template.RoleClientRestTemplate;
import ong.euoon.rest.sec.client.template.UserClientRestTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextConfig.class, ClientTestConfig.class, SecCommonApiConfig.class }, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles({ "client", "mime_json" })
public class SecurityScenariosOverRestLiveTest {

	@Autowired
	private UserClientRestTemplate userApi;
	@Autowired
	private RoleClientRestTemplate roleApi;

	@Autowired
	private UserEntityOpsImpl userEntityOps;
	@Autowired
	private RoleEntityOpsImpl roleEntityOps;

	public SecurityScenariosOverRestLiveTest() {
		super();
	}

	// tests

	@Test
	public final void givenAsAdmin_whenAssigningRoleToUser_thenNoException() {
		// Given
		final String nameOfUser = randomAlphabetic(6);
		userApi.create(userEntityOps.createNewEntity(nameOfUser));
		final String nameOfRole = randomAlphabetic(6);
		roleApi.create(roleEntityOps.createNewEntity(nameOfRole));

		// When
		final User existingUser = userApi.findByName(nameOfUser);
		final Role existingRole = roleApi.findByName(nameOfRole);
	}

}
