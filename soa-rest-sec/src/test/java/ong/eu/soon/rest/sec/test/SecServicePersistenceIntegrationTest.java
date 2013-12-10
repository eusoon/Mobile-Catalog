package ong.eu.soon.rest.sec.test;

import my.com.infopro.rest.common.persistence.AbstractServicePersistenceIntegrationTest;

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
public abstract class SecServicePersistenceIntegrationTest<T extends INameableEntity> extends AbstractServicePersistenceIntegrationTest<T> {

	//

}
