package ong.eu.soon.rest.sec.web.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.ServiceTestRestTemplate;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecDiscoverabilityRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

import com.jayway.restassured.specification.RequestSpecification;

public class ServiceDiscoverabilityRestLiveTest extends
SecDiscoverabilityRestLiveTest<Service> {

	@Autowired
	private ServiceTestRestTemplate restTemplate;
	@Autowired
	private ServiceEntityOpsImpl entityOps;

	public ServiceDiscoverabilityRestLiveTest() {
		super(Service.class);
	}

	// tests

	// template method

	@Override
	protected final Service createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final String getUri() {
		return getApi().getUri();
	}

	@Override
	protected void change(final Service resource) {
		resource.setName(randomAlphabetic(6));
	}

	@Override
	protected RequestSpecification givenAuthenticated() {
		return getApi().givenAuthenticated();
	}

	@Override
	protected final ServiceTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Service> getEntityOps() {
		return entityOps;
	}

}
