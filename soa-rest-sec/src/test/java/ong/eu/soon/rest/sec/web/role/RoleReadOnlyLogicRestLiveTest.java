package ong.eu.soon.rest.sec.web.role;


import ong.eu.soon.rest.sec.client.template.PrivilegeTestRestTemplate;
import ong.eu.soon.rest.sec.client.template.RoleTestRestTemplate;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleReadOnlyLogicRestLiveTest extends SecReadOnlyLogicRestLiveTest<Role> {

	@Autowired
	private RoleTestRestTemplate api;
	@Autowired
	private PrivilegeTestRestTemplate associationApi;

	public RoleReadOnlyLogicRestLiveTest() {
		super(Role.class);
	}

	// tests

	// template

	@Override
	protected final RoleTestRestTemplate getApi() {
		return api;
	}

	// util

	final PrivilegeTestRestTemplate getAssociationAPI() {
		return associationApi;
	}

}
