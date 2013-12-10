package ong.eu.soon.rest.sec.web.store;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.StoreTestRestTemplate;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.StoreEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecDiscoverabilityRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

import com.jayway.restassured.specification.RequestSpecification;

public class StoreDiscoverabilityRestLiveTest extends
SecDiscoverabilityRestLiveTest<Store> {

	@Autowired
	private StoreTestRestTemplate restTemplate;
	@Autowired
	private StoreEntityOpsImpl entityOps;

	public StoreDiscoverabilityRestLiveTest() {
		super(Store.class);
	}

	// tests

	// template method

	@Override
	protected final Store createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final String getUri() {
		return getApi().getUri();
	}

	@Override
	protected void change(final Store resource) {
		resource.setName(randomAlphabetic(6));
	}

	@Override
	protected RequestSpecification givenAuthenticated() {
		return getApi().givenAuthenticated();
	}

	@Override
	protected final StoreTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Store> getEntityOps() {
		return entityOps;
	}

}
