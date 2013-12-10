package ong.eu.soon.rest.sec.web.privilege;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.PrivilegeTestRestTemplate;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.PrivilegeEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecDiscoverabilityRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

import com.jayway.restassured.specification.RequestSpecification;

public class PrivilegeDiscoverabilityRestLiveTest extends SecDiscoverabilityRestLiveTest<Privilege> {

	@Autowired
	private PrivilegeTestRestTemplate restTemplate;
	@Autowired
	private PrivilegeEntityOpsImpl entityOps;

	public PrivilegeDiscoverabilityRestLiveTest() {
		super(Privilege.class);
	}

	// tests

	// template method

	@Override
	protected final Privilege createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final String getUri() {
		return getApi().getUri();
	}

	@Override
	protected void change(final Privilege resource) {
		resource.setName(randomAlphabetic(6));
	}

	@Override
	protected RequestSpecification givenAuthenticated() {
		return getApi().givenAuthenticated();
	}

	@Override
	protected final PrivilegeTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Privilege> getEntityOps() {
		return entityOps;
	}

}
