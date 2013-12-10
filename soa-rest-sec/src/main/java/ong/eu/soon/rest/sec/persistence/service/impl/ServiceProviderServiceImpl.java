package ong.eu.soon.rest.sec.persistence.service.impl;

import java.util.List;


import ong.eu.soon.rest.common.persistence.service.AbstractService;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.sec.model.ServiceProvider;
import ong.eu.soon.rest.sec.persistence.dao.IServiceProviderJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.IServiceProviderService;
import ong.eu.soon.rest.sec.util.SearchUtilSec;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ServiceProviderServiceImpl extends
AbstractService<ServiceProvider> implements IServiceProviderService {

	@Autowired
	IServiceProviderJpaDAO dao;

	public ServiceProviderServiceImpl() {
		super(ServiceProvider.class);
	}

	// API

	// find

	@Override
	public ServiceProvider findByName(final String name) {
		return getDao().findByName(name);
	}

	@Override
	public List<ServiceProvider> findByType(final String type) {
		return getDao().findByType(type);
	}

	// Spring

	@Override
	protected final IServiceProviderJpaDAO getDao() {
		return dao;
	}

	@Override
	public Specification<ServiceProvider> resolveConstraint(
			final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint,
				ServiceProvider.class);
	}

	@Override
	protected JpaSpecificationExecutor<ServiceProvider> getSpecificationExecutor() {
		return dao;
	}

	@Override
	public ServiceProvider create(final ServiceProvider entity) {
		/*
		 * final long id = IdUtil.randomPositiveLong(); entity.setId( id );
		 */

		/*
		 * final List< MobileService > associationsTemp = Lists.newArrayList(
		 * entity.getMobileServices() ); entity.getMobileServices().clear();
		 * for( final MobileService mobileService : associationsTemp ){
		 * entity.getMobileServices().add( associationDao.findByName(
		 * privilege.getName() ) ); }
		 */

		return super.create(entity);
	}

}
