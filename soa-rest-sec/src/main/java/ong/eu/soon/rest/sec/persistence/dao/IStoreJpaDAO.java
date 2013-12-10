package ong.eu.soon.rest.sec.persistence.dao;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.Store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IStoreJpaDAO extends JpaRepository<Store, Long>,
JpaSpecificationExecutor<Store>, INameSupport<Store> {
	//
}
