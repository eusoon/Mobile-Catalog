package ong.eu.soon.rest.sec.client.template.test;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.PrivilegeEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.PrivilegeClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeLogicClientRestLiveTest extends SecLogicClientRestLiveTest<Privilege> {

	@Autowired
	private PrivilegeClientRestTemplate api;
	@Autowired
	private PrivilegeEntityOpsImpl entityOps;

	public PrivilegeLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final PrivilegeClientRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Privilege> getEntityOps() {
		return entityOps;
	}

}
