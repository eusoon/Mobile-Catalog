package ong.eu.soon.rest.sec.client.template.test;


import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.RoleClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleReadOnlyLogicClientRestLiveTest extends SecReadOnlyLogicClientRestLiveTest<Role> {

	@Autowired
	private RoleClientRestTemplate api;

	public RoleReadOnlyLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final RoleClientRestTemplate getApi() {
		return api;
	}

}
