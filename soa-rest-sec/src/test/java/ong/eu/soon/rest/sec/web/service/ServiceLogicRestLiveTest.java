package ong.eu.soon.rest.sec.web.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.ServiceTestRestTemplate;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceLogicRestLiveTest extends SecLogicRestLiveTest<Service> {

	@Autowired
	private ServiceTestRestTemplate api;
	@Autowired
	private ServiceEntityOpsImpl entityOps;

	public ServiceLogicRestLiveTest() {
		super(Service.class);
	}

	// tests

	// template

	@Override
	protected final ServiceTestRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Service> getEntityOps() {
		return entityOps;
	}

}
