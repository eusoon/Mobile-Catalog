package ong.eu.soon.rest.sec.test.suite;


import ong.eu.soon.rest.sec.web.privilege.PrivilegeSearchRestLiveTest;
import ong.eu.soon.rest.sec.web.role.RoleSearchRestLiveTest;
import ong.eu.soon.rest.sec.web.user.UserSearchRestLiveTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({// @formatter:off
	UserSearchRestLiveTest.class,
	RoleSearchRestLiveTest.class,
	PrivilegeSearchRestLiveTest.class
})
// @formatter:off
public final class LiveSearchSuite {
	//
}
