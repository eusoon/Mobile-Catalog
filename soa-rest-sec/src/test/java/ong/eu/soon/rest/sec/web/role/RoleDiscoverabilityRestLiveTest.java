package ong.eu.soon.rest.sec.web.role;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.RoleTestRestTemplate;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.RoleEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecDiscoverabilityRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

import com.jayway.restassured.specification.RequestSpecification;

public class RoleDiscoverabilityRestLiveTest extends SecDiscoverabilityRestLiveTest<Role> {

	@Autowired
	private RoleTestRestTemplate restTemplate;
	@Autowired
	private RoleEntityOpsImpl entityOps;

	public RoleDiscoverabilityRestLiveTest() {
		super(Role.class);
	}

	// tests

	// template method

	@Override
	protected final Role createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final String getUri() {
		return getApi().getUri();
	}

	@Override
	protected void change(final Role resource) {
		resource.setName(randomAlphabetic(6));
	}

	@Override
	protected RequestSpecification givenAuthenticated() {
		return getApi().givenAuthenticated();
	}

	@Override
	protected final RoleTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Role> getEntityOps() {
		return entityOps;
	}

}
