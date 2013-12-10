package ong.eu.soon.rest.sec.persistence.dao;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IServiceJpaDAO extends JpaRepository<Service, Long>,
JpaSpecificationExecutor<Service>, INameSupport<Service> {
	//
}
