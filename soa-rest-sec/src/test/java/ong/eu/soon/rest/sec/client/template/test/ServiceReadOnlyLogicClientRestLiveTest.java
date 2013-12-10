package ong.eu.soon.rest.sec.client.template.test;


import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.ServiceClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceReadOnlyLogicClientRestLiveTest extends
SecReadOnlyLogicClientRestLiveTest<Service> {

	@Autowired
	private ServiceClientRestTemplate api;

	public ServiceReadOnlyLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final ServiceClientRestTemplate getApi() {
		return api;
	}

}
