package ong.eu.soon.rest.sec.client.template.test;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.StoreEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.StoreClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class StoreLogicClientRestLiveTest extends
SecLogicClientRestLiveTest<Store> {

	@Autowired
	private StoreClientRestTemplate api;
	@Autowired
	private StoreEntityOpsImpl entityOps;

	public StoreLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final StoreClientRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Store> getEntityOps() {
		return entityOps;
	}
}
