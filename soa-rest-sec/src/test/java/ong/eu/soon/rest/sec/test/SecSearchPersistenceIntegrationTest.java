package ong.eu.soon.rest.sec.test;

import my.com.infopro.rest.common.persistence.AbstractSearchPersistenceIntegrationTest;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;
import ong.eu.soon.rest.sec.spring.ContextConfig;
import ong.eu.soon.rest.sec.spring.PersistenceJPAConfig;
import ong.eu.soon.rest.sec.spring.SecCommonApiConfig;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceJPAConfig.class, ContextConfig.class, SecCommonApiConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecSearchPersistenceIntegrationTest<T extends INameableEntity> extends AbstractSearchPersistenceIntegrationTest<T> {

	//

}
