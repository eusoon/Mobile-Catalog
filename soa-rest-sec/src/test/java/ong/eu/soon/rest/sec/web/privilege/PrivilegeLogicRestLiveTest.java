package ong.eu.soon.rest.sec.web.privilege;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.PrivilegeTestRestTemplate;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.PrivilegeEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeLogicRestLiveTest extends SecLogicRestLiveTest<Privilege> {

	@Autowired
	private PrivilegeTestRestTemplate api;
	@Autowired
	private PrivilegeEntityOpsImpl entityOps;

	public PrivilegeLogicRestLiveTest() {
		super(Privilege.class);
	}

	// tests

	// template

	@Override
	protected final PrivilegeTestRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Privilege> getEntityOps() {
		return entityOps;
	}

}
