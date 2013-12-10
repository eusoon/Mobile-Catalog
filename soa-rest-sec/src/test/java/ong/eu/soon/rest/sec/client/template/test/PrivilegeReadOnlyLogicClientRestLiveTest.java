package ong.eu.soon.rest.sec.client.template.test;


import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.PrivilegeClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeReadOnlyLogicClientRestLiveTest extends SecReadOnlyLogicClientRestLiveTest<Privilege> {

	@Autowired
	private PrivilegeClientRestTemplate api;

	public PrivilegeReadOnlyLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final PrivilegeClientRestTemplate getApi() {
		return api;
	}

}
