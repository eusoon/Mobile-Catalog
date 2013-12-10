package ong.eu.soon.rest.sec.web.privilege;


import ong.eu.soon.rest.sec.client.template.PrivilegeTestRestTemplate;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeReadOnlyLogicRestLiveTest extends SecReadOnlyLogicRestLiveTest<Privilege> {

	@Autowired
	private PrivilegeTestRestTemplate api;

	public PrivilegeReadOnlyLogicRestLiveTest() {
		super(Privilege.class);
	}

	// tests

	// template

	@Override
	protected final PrivilegeTestRestTemplate getApi() {
		return api;
	}

}
