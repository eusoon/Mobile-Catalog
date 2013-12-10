package ong.eu.soon.rest.sec.client.template.test;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.ServiceClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceLogicClientRestLiveTest extends
SecLogicClientRestLiveTest<Service> {

	@Autowired
	private ServiceClientRestTemplate api;
	@Autowired
	private ServiceEntityOpsImpl entityOps;

	public ServiceLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final ServiceClientRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Service> getEntityOps() {
		return entityOps;
	}

}
