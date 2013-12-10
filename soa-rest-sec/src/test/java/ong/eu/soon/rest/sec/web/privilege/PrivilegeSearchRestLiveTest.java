package ong.eu.soon.rest.sec.web.privilege;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.PrivilegeTestRestTemplate;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.PrivilegeEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecSearchRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeSearchRestLiveTest extends SecSearchRestLiveTest<Privilege> {

	@Autowired
	private PrivilegeTestRestTemplate restTemplate;
	@Autowired
	private PrivilegeEntityOpsImpl entityOps;

	public PrivilegeSearchRestLiveTest() {
		super();
	}

	// tests

	// template

	@Override
	protected final PrivilegeTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Privilege> getEntityOps() {
		return entityOps;
	}

}
