package ong.eu.soon.rest.sec.web.service;


import ong.eu.soon.rest.sec.client.template.ServiceTestRestTemplate;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceReadOnlyLogicRestLiveTest extends
SecReadOnlyLogicRestLiveTest<Service> {

	@Autowired
	private ServiceTestRestTemplate api;

	public ServiceReadOnlyLogicRestLiveTest() {
		super(Service.class);
	}

	// tests

	// template

	@Override
	protected final ServiceTestRestTemplate getApi() {
		return api;
	}

}
