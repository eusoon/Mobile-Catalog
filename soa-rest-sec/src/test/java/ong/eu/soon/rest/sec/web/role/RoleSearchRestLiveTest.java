package ong.eu.soon.rest.sec.web.role;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.RoleTestRestTemplate;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.RoleEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecSearchRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleSearchRestLiveTest extends SecSearchRestLiveTest<Role> {

	@Autowired
	private RoleTestRestTemplate restTemplate;
	@Autowired
	private RoleEntityOpsImpl entityOps;

	public RoleSearchRestLiveTest() {
		super();
	}

	// tests

	// template

	@Override
	protected final RoleTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<Role> getEntityOps() {
		return entityOps;
	}

}
