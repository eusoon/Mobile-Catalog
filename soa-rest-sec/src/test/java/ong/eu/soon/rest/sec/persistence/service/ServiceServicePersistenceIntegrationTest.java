package ong.eu.soon.rest.sec.persistence.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IServiceService;
import ong.eu.soon.rest.sec.test.SecServicePersistenceIntegrationTest;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

@Ignore
public class ServiceServicePersistenceIntegrationTest extends
SecServicePersistenceIntegrationTest<Service> {

	@Autowired
	private IServiceService serviceService;

	@Autowired
	private ServiceEntityOpsImpl entityOps;

	// create

	@Test
	public void whenSaveIsPerformed_thenNoException() {
		serviceService.create(createNewEntity());
	}

	@Test(expected = DataAccessException.class)
	@Ignore
	public void whenAUniqueConstraintIsBroken_thenSpringSpecificExceptionIsThrown() {
		final String name = randomAlphabetic(8);

		serviceService.create(createNewEntity(name));
		serviceService.create(createNewEntity(name));
	}

	// template method

	@Override
	protected final IService<Service> getApi() {
		return serviceService;
	}

	@Override
	protected final Service createNewEntity() {
		return new Service(randomAlphabetic(8));
	}

	@Override
	protected final IEntityOperations<Service> getEntityOps() {
		return entityOps;
	}

	// util

	protected final Service createNewEntity(final String name) {
		return new Service(name);
	}

}
