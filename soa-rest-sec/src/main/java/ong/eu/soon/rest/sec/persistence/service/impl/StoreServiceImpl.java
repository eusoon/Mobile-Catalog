package ong.eu.soon.rest.sec.persistence.service.impl;


import ong.eu.soon.rest.common.persistence.service.AbstractService;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.common.security.SpringSecurityUtil;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.persistence.dao.IStoreJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.IStoreService;
import ong.eu.soon.rest.sec.util.SearchUtilSec;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StoreServiceImpl extends AbstractService<Store> implements
IStoreService {

	@Autowired
	IStoreJpaDAO dao;

	public StoreServiceImpl() {
		super(Store.class);
	}

	// API

	// get/find

	@Override
	public Store findByName(final String name) {
		return getDao().findByName(name);
	}

	// create

	@Override
	public Store create(final Store entity) {
		/*
		 * final long id = IdUtil.randomPositiveLong(); entity.setId( id );
		 */

		/*
		 * final List< Privilege > associationsTemp = Lists.newArrayList( entity.getPrivileges() ); entity.getPrivileges().clear(); for( final Privilege privilege : associationsTemp ){ entity.getPrivileges().add(
		 * associationDao.findByName( privilege.getName() ) ); }
		 */

		return super.create(entity);
	}

	// Spring

	@Override
	public Specification<Store> resolveConstraint(
			final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Store.class);
	}

	@Override
	public IStoreJpaDAO getDao() {
		return dao;
	}

	@Override
	protected JpaSpecificationExecutor<Store> getSpecificationExecutor() {
		return dao;
	}

	@Override
	public Store getCurrentStore() {
		final String storeName = SpringSecurityUtil.getNameOfCurrentStore();
		return getDao().findByName(storeName);
	}


}
