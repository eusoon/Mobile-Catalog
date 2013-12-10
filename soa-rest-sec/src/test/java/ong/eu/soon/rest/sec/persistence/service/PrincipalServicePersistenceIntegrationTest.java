package ong.eu.soon.rest.sec.persistence.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.PrincipalEntityOpsImpl;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.persistence.service.IPrincipalService;
import ong.eu.soon.rest.sec.test.SecServicePersistenceIntegrationTest;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.google.common.collect.Sets;

@Ignore
public class PrincipalServicePersistenceIntegrationTest extends SecServicePersistenceIntegrationTest<Principal> {

	@Autowired
	private IPrincipalService principalService;
	@Autowired
	private PrincipalEntityOpsImpl entityOps;

	// create

	@Test
	public void whenSaveIsPerformed_thenNoException() {
		getApi().create(createNewEntity());
	}

	@Test(expected = DataAccessException.class)
	@Ignore
	public void whenAUniqueConstraintIsBroken_thenSpringSpecificExceptionIsThrown() {
		final String name = randomAlphabetic(8);

		getApi().create(createNewEntity(name));
		getApi().create(createNewEntity(name));
	}

	// template method

	@Override
	protected final IService<Principal> getApi() {
		return principalService;
	}

	@Override
	protected final Principal createNewEntity() {
		return new Principal(randomAlphabetic(8), randomAlphabetic(8), "N",
				Sets.<Role> newHashSet());
	}

	@Override
	protected final IEntityOperations<Principal> getEntityOps() {
		return entityOps;
	}

	//

	protected final Principal createNewEntity(final String name) {
		return new Principal(name, randomAlphabetic(8), "N",
				Sets.<Role> newHashSet());
	}

}
