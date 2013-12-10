package ong.eu.soon.rest.sec.web.user;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.client.template.UserTestRestTemplate;
import ong.eu.soon.rest.sec.model.UserEntityOpsImpl;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.test.SecSearchRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class UserSearchRestLiveTest extends SecSearchRestLiveTest<User> {

	@Autowired
	private UserTestRestTemplate restTemplate;
	@Autowired
	private UserEntityOpsImpl entityOps;

	public UserSearchRestLiveTest() {
		super();
	}

	// tests

	// template

	@Override
	protected final UserTestRestTemplate getApi() {
		return restTemplate;
	}

	@Override
	protected final IEntityOperations<User> getEntityOps() {
		return entityOps;
	}

}
