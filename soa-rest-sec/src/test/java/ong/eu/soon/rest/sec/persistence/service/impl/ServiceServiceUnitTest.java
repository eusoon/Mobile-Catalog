package ong.eu.soon.rest.sec.persistence.service.impl;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import my.com.infopro.rest.common.persistence.service.AbstractServiceUnitTest;
import my.com.infopro.rest.common.util.IDUtil;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.persistence.dao.IServiceJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.impl.ServiceServiceImpl;
import ong.eu.soon.rest.sec.persistence.util.FixtureFactory;

import org.junit.Before;
import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.collect.Lists;

public class ServiceServiceUnitTest extends AbstractServiceUnitTest<Service> {

	private ServiceServiceImpl instance;

	private IServiceJpaDAO daoMock;

	// fixtures

	@Override
	@Before
	public final void before() {
		instance = new ServiceServiceImpl();

		daoMock = mock(IServiceJpaDAO.class);
		when(daoMock.save(any(Service.class))).thenReturn(new Service());
		when(daoMock.findAll()).thenReturn(Lists.<Service> newArrayList());
		instance.dao = daoMock;
		super.before();
	}

	// get

	// mocking behavior

	@Override
	protected final Service configureGet(final long id) {
		final Service entity = new Service();
		entity.setId(id);
		when(daoMock.findOne(id)).thenReturn(entity);
		return entity;
	}

	// template method

	@Override
	protected final ServiceServiceImpl getApi() {
		return instance;
	}

	@Override
	protected final JpaRepository<Service, Long> getDAO() {
		return daoMock;
	}

	@Override
	protected Service createNewEntity() {
		final Service newService = FixtureFactory.createNewService();
		newService.setId(IDUtil.randomPositiveLong());
		return newService;
	}

	@Override
	protected void changeEntity(final Service entity) {
		entity.setName(randomAlphabetic(8));
	}

}
