package ong.eu.soon.rest.sec.web.user;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.UserTestRestTemplate;
import ong.eu.soon.rest.sec.model.UserEntityOpsImpl;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.test.SecDiscoverabilityRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

import com.jayway.restassured.specification.RequestSpecification;

public class UserDiscoverabilityRestLiveTest extends SecDiscoverabilityRestLiveTest<User> {

	@Autowired
	private UserTestRestTemplate restTemplate;
	@Autowired
	private UserEntityOpsImpl entityOps;

	public UserDiscoverabilityRestLiveTest() {
		super(User.class);
	}

	// tests

	// template method

	@Override
	protected final String getUri() {
		return getApi().getUri();
	}

	@Override
	protected final void change(final User resource) {
		resource.setName(randomAlphabetic(6));
	}

	@Override
	protected final User createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final RequestSpecification givenAuthenticated() {
		return getApi().givenAuthenticated();
	}

	@Override
	protected final UserTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<User> getEntityOps() {
		return entityOps;
	}

}
