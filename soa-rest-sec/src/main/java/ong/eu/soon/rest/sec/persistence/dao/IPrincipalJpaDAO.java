package ong.eu.soon.rest.sec.persistence.dao;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.Principal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPrincipalJpaDAO extends JpaRepository<Principal, Long>, JpaSpecificationExecutor<Principal>, INameSupport<Principal> {
	//
}
