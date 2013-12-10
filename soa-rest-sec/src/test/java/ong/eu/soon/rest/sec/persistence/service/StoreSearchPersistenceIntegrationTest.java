package ong.eu.soon.rest.sec.persistence.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.StoreEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IStoreService;
import ong.eu.soon.rest.sec.test.SecSearchPersistenceIntegrationTest;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class StoreSearchPersistenceIntegrationTest extends
SecSearchPersistenceIntegrationTest<Store> {

	@Autowired
	private IStoreService storeService;
	@Autowired
	private StoreEntityOpsImpl entityOps;

	// tests

	// template method

	@Override
	protected final IStoreService getApi() {
		return storeService;
	}

	@Override
	protected final Store createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final IEntityOperations<Store> getEntityOps() {
		return entityOps;
	}

}
