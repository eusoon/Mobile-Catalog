package ong.eu.soon.rest.sec.persistence.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.PrivilegeEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IPrivilegeService;
import ong.eu.soon.rest.sec.test.SecServicePersistenceIntegrationTest;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

@Ignore
public class PrivilegeServicePersistenceIntegrationTest extends SecServicePersistenceIntegrationTest<Privilege> {

	@Autowired
	private IPrivilegeService privilegeService;

	@Autowired
	private PrivilegeEntityOpsImpl entityOps;

	// create

	@Test
	public void whenSaveIsPerformed_thenNoException() {
		privilegeService.create(createNewEntity());
	}

	@Test(expected = DataAccessException.class)
	@Ignore
	public void whenAUniqueConstraintIsBroken_thenSpringSpecificExceptionIsThrown() {
		final String name = randomAlphabetic(8);

		privilegeService.create(createNewEntity(name));
		privilegeService.create(createNewEntity(name));
	}

	// template method

	@Override
	protected final IService<Privilege> getApi() {
		return privilegeService;
	}

	@Override
	protected final Privilege createNewEntity() {
		return new Privilege(randomAlphabetic(8));
	}

	@Override
	protected final IEntityOperations<Privilege> getEntityOps() {
		return entityOps;
	}

	// util

	protected final Privilege createNewEntity(final String name) {
		return new Privilege(name);
	}

}
