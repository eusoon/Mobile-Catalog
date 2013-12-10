package ong.eu.soon.rest.sec.persistence.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.PrivilegeEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IPrivilegeService;
import ong.eu.soon.rest.sec.test.SecSearchPersistenceIntegrationTest;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class PrivilegeSearchPersistenceIntegrationTest extends SecSearchPersistenceIntegrationTest<Privilege> {

	@Autowired
	private IPrivilegeService privilegeService;
	@Autowired
	private PrivilegeEntityOpsImpl entityOps;

	// tests

	// template method

	@Override
	protected final IPrivilegeService getApi() {
		return privilegeService;
	}

	@Override
	protected final Privilege createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final IEntityOperations<Privilege> getEntityOps() {
		return entityOps;
	}

}
