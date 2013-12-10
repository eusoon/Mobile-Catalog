package ong.eu.soon.rest.sec.persistence.service.impl;


import ong.eu.soon.rest.common.persistence.service.AbstractService;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.persistence.dao.IPrivilegeJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.IPrivilegeService;
import ong.eu.soon.rest.sec.util.SearchUtilSec;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PrivilegeServiceImpl extends AbstractService<Privilege> implements IPrivilegeService {

	@Autowired
	IPrivilegeJpaDAO dao;

	public PrivilegeServiceImpl() {
		super(Privilege.class);
	}

	// API

	// find

	@Override
	public Privilege findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IPrivilegeJpaDAO getDao() {
		return dao;
	}

	@Override
	public Specification<Privilege> resolveConstraint(final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Privilege.class);
	}

	@Override
	protected JpaSpecificationExecutor<Privilege> getSpecificationExecutor() {
		return dao;
	}

}
