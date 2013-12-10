package ong.eu.soon.rest.sec.persistence.service.impl;


import ong.eu.soon.rest.common.persistence.service.AbstractService;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.common.security.SpringSecurityUtil;
import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.persistence.dao.IPrincipalJpaDAO;
import ong.eu.soon.rest.sec.persistence.service.IPrincipalService;
import ong.eu.soon.rest.sec.util.SearchUtilSec;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PrincipalServiceImpl extends AbstractService<Principal> implements IPrincipalService {

	@Autowired
	IPrincipalJpaDAO dao;

	public PrincipalServiceImpl() {
		super(Principal.class);
	}

	// API

	// find

	@Override
	@Transactional(readOnly = true)
	public Principal findByName(final String name) {
		return dao.findByName(name);
	}

	// other

	@Override
	@Transactional(readOnly = true)
	public Principal getCurrentPrincipal() {
		final String principalName = SpringSecurityUtil.getNameOfCurrentPrincipal();
		return getDao().findByName(principalName);
	}

	// Spring

	@Override
	protected final IPrincipalJpaDAO getDao() {
		return dao;
	}

	@Override
	public Specification<Principal> resolveConstraint(final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Principal.class);
	}

	@Override
	protected JpaSpecificationExecutor<Principal> getSpecificationExecutor() {
		return dao;
	}

}
