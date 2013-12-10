package ong.eu.soon.rest.sec.test;

import my.com.infopro.rest.common.web.base.AbstractReadOnlyLogicLiveTest;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;
import ong.eu.soon.rest.sec.spring.ClientTestConfig;
import ong.eu.soon.rest.sec.spring.ContextConfig;
import ong.eu.soon.rest.sec.spring.SecCommonApiConfig;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ClientTestConfig.class, ContextConfig.class, SecCommonApiConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecReadOnlyLogicRestLiveTest<T extends INameableEntity> extends AbstractReadOnlyLogicLiveTest<T> {

	public SecReadOnlyLogicRestLiveTest(final Class<T> clazzToSet) {
		super(clazzToSet);
	}

}
