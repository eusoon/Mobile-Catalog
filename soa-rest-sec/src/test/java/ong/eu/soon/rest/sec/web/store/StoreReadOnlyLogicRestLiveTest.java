package ong.eu.soon.rest.sec.web.store;


import ong.eu.soon.rest.sec.client.template.ServiceTestRestTemplate;
import ong.eu.soon.rest.sec.client.template.StoreTestRestTemplate;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class StoreReadOnlyLogicRestLiveTest extends
SecReadOnlyLogicRestLiveTest<Store> {

	@Autowired
	private StoreTestRestTemplate api;
	@Autowired
	private ServiceTestRestTemplate associationApi;

	public StoreReadOnlyLogicRestLiveTest() {
		super(Store.class);
	}

	// tests

	// template

	@Override
	protected final StoreTestRestTemplate getApi() {
		return api;
	}

	// util

	final ServiceTestRestTemplate getAssociationAPI() {
		return associationApi;
	}

}
