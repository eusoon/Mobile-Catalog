package ong.eu.soon.rest.sec.client.template.test;


import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.StoreClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class StoreReadOnlyLogicClientRestLiveTest extends
SecReadOnlyLogicClientRestLiveTest<Store> {

	@Autowired
	private StoreClientRestTemplate api;

	public StoreReadOnlyLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final StoreClientRestTemplate getApi() {
		return api;
	}

}
