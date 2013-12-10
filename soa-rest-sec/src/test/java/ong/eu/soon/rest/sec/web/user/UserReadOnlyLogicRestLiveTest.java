package ong.eu.soon.rest.sec.web.user;


import ong.eu.soon.rest.sec.client.template.UserTestRestTemplate;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.test.SecReadOnlyLogicRestLiveTest;

import org.springframework.beans.factory.annotation.Autowired;

public class UserReadOnlyLogicRestLiveTest extends SecReadOnlyLogicRestLiveTest<User> {

	@Autowired
	private UserTestRestTemplate api;

	public UserReadOnlyLogicRestLiveTest() {
		super(User.class);
	}

	// tests

	// template method

	@Override
	protected final UserTestRestTemplate getApi() {
		return api;
	}

}
