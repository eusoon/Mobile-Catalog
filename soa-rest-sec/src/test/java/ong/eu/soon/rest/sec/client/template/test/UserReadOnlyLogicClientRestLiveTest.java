package ong.eu.soon.rest.sec.client.template.test;


import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicClientRestLiveTest;
import ong.euoon.rest.sec.client.template.UserClientRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class UserReadOnlyLogicClientRestLiveTest extends SecReadOnlyLogicClientRestLiveTest<User> {

	@Autowired
	private UserClientRestTemplate api;

	public UserReadOnlyLogicClientRestLiveTest() {
		super();
	}

	// tests

	// template method

	@Override
	protected final UserClientRestTemplate getApi() {
		return api;
	}

}
