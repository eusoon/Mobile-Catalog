package ong.eu.soon.rest.sec.client.template.test;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.UserEntityOpsImpl;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.test.SecLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.UserClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class UserLogicClientRestLiveTest extends SecLogicClientRestLiveTest<User> {

	@Autowired
	private UserClientRestTemplate api;
	@Autowired
	private UserEntityOpsImpl entityOps;

	public UserLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final UserClientRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<User> getEntityOps() {
		return entityOps;
	}

}
