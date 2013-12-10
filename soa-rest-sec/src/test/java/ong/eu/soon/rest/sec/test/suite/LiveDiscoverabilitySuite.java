package ong.eu.soon.rest.sec.test.suite;


import ong.eu.soon.rest.common.web.root.RootDiscoverabilityRestLiveTest;
import ong.eu.soon.rest.sec.web.privilege.PrivilegeDiscoverabilityRestLiveTest;
import ong.eu.soon.rest.sec.web.role.RoleDiscoverabilityRestLiveTest;
import ong.eu.soon.rest.sec.web.user.UserDiscoverabilityRestLiveTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UserDiscoverabilityRestLiveTest.class, RoleDiscoverabilityRestLiveTest.class, PrivilegeDiscoverabilityRestLiveTest.class, RootDiscoverabilityRestLiveTest.class })
public final class LiveDiscoverabilitySuite {
	//
}
