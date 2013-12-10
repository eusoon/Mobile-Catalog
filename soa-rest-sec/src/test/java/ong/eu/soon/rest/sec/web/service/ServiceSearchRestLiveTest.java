package ong.eu.soon.rest.sec.web.service;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.ServiceTestRestTemplate;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecSearchRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceSearchRestLiveTest extends SecSearchRestLiveTest<Service> {

	@Autowired
	private ServiceTestRestTemplate restTemplate;
	@Autowired
	private ServiceEntityOpsImpl entityOps;

	public ServiceSearchRestLiveTest() {
		super();
	}

	// tests

	// template

	@Override
	protected final ServiceTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Service> getEntityOps() {
		return entityOps;
	}

}
