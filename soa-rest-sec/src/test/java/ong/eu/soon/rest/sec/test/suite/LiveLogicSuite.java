package ong.eu.soon.rest.sec.test.suite;


import ong.eu.soon.rest.sec.security.AuthenticationRestLiveTest;
import ong.eu.soon.rest.sec.web.privilege.PrivilegeLogicRestLiveTest;
import ong.eu.soon.rest.sec.web.role.RoleLogicRestLiveTest;
import ong.eu.soon.rest.sec.web.user.UserLogicRestLiveTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({// @formatter:off
	UserLogicRestLiveTest.class,
	RoleLogicRestLiveTest.class,
	PrivilegeLogicRestLiveTest.class,

	AuthenticationRestLiveTest.class
})
// @formatter:off
public final class LiveLogicSuite {
	//
}
