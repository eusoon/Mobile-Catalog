package ong.eu.soon.rest.sec.test.suite.client;


import ong.eu.soon.rest.sec.client.template.test.AuthenticationClientRestLiveTest;
import ong.eu.soon.rest.sec.client.template.test.PrivilegeLogicClientRestLiveTest;
import ong.eu.soon.rest.sec.client.template.test.PrivilegeReadOnlyLogicClientRestLiveTest;
import ong.eu.soon.rest.sec.client.template.test.RoleLogicClientRestLiveTest;
import ong.eu.soon.rest.sec.client.template.test.RoleReadOnlyLogicClientRestLiveTest;
import ong.eu.soon.rest.sec.client.template.test.UserLogicClientRestLiveTest;
import ong.eu.soon.rest.sec.client.template.test.UserReadOnlyLogicClientRestLiveTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({//@formatter:off
	UserLogicClientRestLiveTest.class,
	RoleLogicClientRestLiveTest.class,
	PrivilegeLogicClientRestLiveTest.class,

	UserReadOnlyLogicClientRestLiveTest.class,
	RoleReadOnlyLogicClientRestLiveTest.class,
	PrivilegeReadOnlyLogicClientRestLiveTest.class,

	AuthenticationClientRestLiveTest.class
})// @formatter:on
public final class LiveClientLogicSuite {
	//
}
