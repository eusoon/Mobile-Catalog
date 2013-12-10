package ong.eu.soon.rest.sec.test.suite;


import ong.eu.soon.rest.common.search.ConstructQueryStringUnitTest;
import ong.eu.soon.rest.sec.persistence.service.impl.PrincipalServiceUnitTest;
import ong.eu.soon.rest.sec.persistence.service.impl.PrivilegeServiceUnitTest;
import ong.eu.soon.rest.sec.persistence.service.impl.RoleServiceUnitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PrincipalServiceUnitTest.class, RoleServiceUnitTest.class, PrivilegeServiceUnitTest.class, ConstructQueryStringUnitTest.class })
public final class UnitSuite {
    //
}
