package ong.eu.soon.rest.sec.persistence.service.impl;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import my.com.infopro.rest.common.persistence.service.AbstractServiceUnitTest;

import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.persistence.dao.IRoleJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.impl.RoleServiceImpl;
import ong.eu.soon.rest.sec.persistence.util.FixtureFactory;

import org.junit.Before;
import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.collect.Lists;

public class RoleServiceUnitTest extends AbstractServiceUnitTest<Role> {

	private RoleServiceImpl instance;

	private IRoleJpaDAO daoMock;

	// fixtures

	@Override
	@Before
	public final void before() {
		instance = new RoleServiceImpl();

		daoMock = mock(IRoleJpaDAO.class);
		when(daoMock.save(any(Role.class))).thenReturn(new Role());
		when(daoMock.findAll()).thenReturn(Lists.<Role> newArrayList());
		instance.dao = daoMock;
		super.before();
	}

	// get

	// mocking behavior

	@Override
	protected final Role configureGet(final long id) {
		final Role entity = createNewEntity();
		entity.setId(id);
		when(daoMock.findOne(id)).thenReturn(entity);
		return entity;
	}

	// template method

	@Override
	protected final RoleServiceImpl getApi() {
		return instance;
	}

	@Override
	protected final JpaRepository<Role, Long> getDAO() {
		return daoMock;
	}

	@Override
	protected final Role createNewEntity() {
		return FixtureFactory.createNewRole();
	}

	@Override
	protected void changeEntity(final Role entity) {
		entity.setName(randomAlphabetic(6));
	}

}
