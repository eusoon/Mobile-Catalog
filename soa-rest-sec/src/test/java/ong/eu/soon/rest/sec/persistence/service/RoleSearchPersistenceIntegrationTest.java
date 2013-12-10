package ong.eu.soon.rest.sec.persistence.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.RoleEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IRoleService;
import ong.eu.soon.rest.sec.test.SecSearchPersistenceIntegrationTest;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class RoleSearchPersistenceIntegrationTest extends SecSearchPersistenceIntegrationTest<Role> {

	@Autowired
	private IRoleService roleService;
	@Autowired
	private RoleEntityOpsImpl entityOps;

	// tests

	// template method

	@Override
	protected final IRoleService getApi() {
		return roleService;
	}

	@Override
	protected final Role createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final IEntityOperations<Role> getEntityOps() {
		return entityOps;
	}

}
