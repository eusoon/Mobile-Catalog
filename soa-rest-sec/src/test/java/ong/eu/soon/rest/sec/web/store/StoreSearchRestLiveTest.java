package ong.eu.soon.rest.sec.web.store;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.StoreTestRestTemplate;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.StoreEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecSearchRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class StoreSearchRestLiveTest extends SecSearchRestLiveTest<Store> {

	@Autowired
	private StoreTestRestTemplate restTemplate;
	@Autowired
	private StoreEntityOpsImpl entityOps;

	public StoreSearchRestLiveTest() {
		super();
	}

	// tests

	// template

	@Override
	protected final StoreTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Store> getEntityOps() {
		return entityOps;
	}

}
