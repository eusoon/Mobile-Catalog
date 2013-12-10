package ong.eu.soon.rest.sec.persistence.service.impl;

import java.util.List;


import ong.eu.soon.rest.common.persistence.service.AbstractService;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.sec.model.MobileService;
import ong.eu.soon.rest.sec.persistence.dao.IMobileServiceJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.IMobileServiceService;
import ong.eu.soon.rest.sec.util.SearchUtilSec;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class MobileServiceServiceImpl extends AbstractService<MobileService>
implements IMobileServiceService {

	@Autowired
	IMobileServiceJpaDAO dao;

	public MobileServiceServiceImpl() {
		super(MobileService.class);
	}

	// API

	// find

	@Override
	public MobileService findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IMobileServiceJpaDAO getDao() {
		return dao;
	}

	@Override
	public Specification<MobileService> resolveConstraint(
			final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, MobileService.class);
	}

	@Override
	protected JpaSpecificationExecutor<MobileService> getSpecificationExecutor() {
		return dao;
	}

	@Override
	public List<MobileService> findByServiceProviderId(long sp_id) {
		return getDao().findByServiceProviderId(sp_id);
	}

}
