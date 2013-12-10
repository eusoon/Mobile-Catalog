package ong.eu.soon.rest.sec.persistence.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.PrincipalEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IPrincipalService;
import ong.eu.soon.rest.sec.test.SecSearchPersistenceIntegrationTest;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class PrincipalSearchPersistenceIntegrationTest extends SecSearchPersistenceIntegrationTest<Principal> {

	@Autowired
	private IPrincipalService principalService;
	@Autowired
	private PrincipalEntityOpsImpl entityOps;

	// tests

	// template method

	@Override
	protected final IPrincipalService getApi() {
		return principalService;
	}

	@Override
	protected final Principal createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final IEntityOperations<Principal> getEntityOps() {
		return entityOps;
	}

}
