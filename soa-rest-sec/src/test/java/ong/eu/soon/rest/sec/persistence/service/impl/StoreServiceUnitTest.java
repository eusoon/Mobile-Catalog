package ong.eu.soon.rest.sec.persistence.service.impl;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import my.com.infopro.rest.common.persistence.service.AbstractServiceUnitTest;

import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.persistence.dao.IStoreJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.impl.StoreServiceImpl;
import ong.eu.soon.rest.sec.persistence.util.FixtureFactory;

import org.junit.Before;
import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.collect.Lists;

public class StoreServiceUnitTest extends AbstractServiceUnitTest<Store> {

	StoreServiceImpl instance;

	private IStoreJpaDAO daoMock;

	// fixtures

	@Override
	@Before
	public final void before() {
		instance = new StoreServiceImpl();

		daoMock = mock(IStoreJpaDAO.class);
		when(daoMock.save(any(Store.class))).thenReturn(new Store());
		when(daoMock.findAll()).thenReturn(Lists.<Store> newArrayList());
		instance.dao = daoMock;
		super.before();
	}

	// get

	// mocking behavior

	@Override
	protected final Store configureGet(final long id) {
		final Store entity = new Store();
		entity.setId(id);
		when(daoMock.findOne(id)).thenReturn(entity);
		return entity;
	}

	// template method

	@Override
	protected final StoreServiceImpl getApi() {
		return instance;
	}

	@Override
	protected final JpaRepository<Store, Long> getDAO() {
		return daoMock;
	}

	@Override
	protected final Store createNewEntity() {
		return FixtureFactory.createNewStore();
	}

	@Override
	protected void changeEntity(final Store entity) {
		entity.setAddress(randomAlphabetic(8));
		entity.setName(randomAlphabetic(8));
	}

}
