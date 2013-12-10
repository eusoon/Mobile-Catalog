package ong.eu.soon.rest.sec.persistence.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IServiceService;
import ong.eu.soon.rest.sec.test.SecSearchPersistenceIntegrationTest;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class ServiceSearchPersistenceIntegrationTest extends
SecSearchPersistenceIntegrationTest<Service> {

	@Autowired
	private IServiceService serviceService;
	@Autowired
	private ServiceEntityOpsImpl entityOps;

	// tests

	// template method

	@Override
	protected final IServiceService getApi() {
		return serviceService;
	}

	@Override
	protected final Service createNewEntity() {
		return getEntityOps().createNewEntity();
	}

	@Override
	protected final IEntityOperations<Service> getEntityOps() {
		return entityOps;
	}

}
