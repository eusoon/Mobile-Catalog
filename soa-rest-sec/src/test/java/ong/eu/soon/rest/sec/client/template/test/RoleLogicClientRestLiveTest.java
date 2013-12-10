package ong.eu.soon.rest.sec.client.template.test;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.RoleEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.RoleClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleLogicClientRestLiveTest extends SecLogicClientRestLiveTest<Role> {

	@Autowired
	private RoleClientRestTemplate api;
	@Autowired
	private RoleEntityOpsImpl entityOps;

	public RoleLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final RoleClientRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Role> getEntityOps() {
		return entityOps;
	}
}
