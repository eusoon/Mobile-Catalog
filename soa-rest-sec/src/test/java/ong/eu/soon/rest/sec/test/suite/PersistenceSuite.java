package ong.eu.soon.rest.sec.test.suite;


import ong.eu.soon.rest.sec.persistence.service.PrincipalSearchPersistenceIntegrationTest;
import ong.eu.soon.rest.sec.persistence.service.PrincipalServicePersistenceIntegrationTest;
import ong.eu.soon.rest.sec.persistence.service.PrivilegeSearchPersistenceIntegrationTest;
import ong.eu.soon.rest.sec.persistence.service.PrivilegeServicePersistenceIntegrationTest;
import ong.eu.soon.rest.sec.persistence.service.RoleSearchPersistenceIntegrationTest;
import ong.eu.soon.rest.sec.persistence.service.RoleServicePersistenceIntegrationTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({// @formatter:off
    PrincipalSearchPersistenceIntegrationTest.class, PrincipalServicePersistenceIntegrationTest.class,
    PrivilegeSearchPersistenceIntegrationTest.class, PrivilegeServicePersistenceIntegrationTest.class,
    RoleSearchPersistenceIntegrationTest.class, RoleServicePersistenceIntegrationTest.class
})
// @formatter:on
public final class PersistenceSuite {
    //
}
