package ong.eu.soon.rest.sec.persistence.service.impl;


import ong.eu.soon.rest.common.persistence.service.AbstractService;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.persistence.dao.IServiceJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.IServiceService;
import ong.eu.soon.rest.sec.util.SearchUtilSec;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ServiceServiceImpl extends AbstractService<Service> implements
IServiceService {

	@Autowired
	IServiceJpaDAO dao;

	public ServiceServiceImpl() {
		super(Service.class);
	}

	// API

	// find

	@Override
	public Service findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IServiceJpaDAO getDao() {
		return dao;
	}

	@Override
	public Specification<Service> resolveConstraint(
			final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint,
				Service.class);
	}

	@Override
	protected JpaSpecificationExecutor<Service> getSpecificationExecutor() {
		return dao;
	}


}
