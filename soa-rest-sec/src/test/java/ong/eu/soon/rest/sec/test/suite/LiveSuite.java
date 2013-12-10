package ong.eu.soon.rest.sec.test.suite;


import ong.eu.soon.rest.sec.security.SecurityRestLiveTest;
import ong.eu.soon.rest.sec.test.suite.client.LiveClientSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({// @formatter:off
	LiveDiscoverabilitySuite.class,
	LiveLogicSuite.class,
	LiveSearchSuite.class,
	SecurityRestLiveTest.class,

	LiveClientSuite.class
})
// @formatter:on
public final class LiveSuite {
	//
}
