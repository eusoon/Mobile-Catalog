package ong.eu.soon.rest.sec.persistence.dao;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IRoleJpaDAO extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role>, INameSupport<Role> {
	//
}
