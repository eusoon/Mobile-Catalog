package ong.eu.soon.rest.sec.persistence.dao;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.Privilege;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPrivilegeJpaDAO extends JpaRepository<Privilege, Long>, JpaSpecificationExecutor<Privilege>, INameSupport<Privilege> {
	//
}
