package ong.eu.soon.rest.sec.persistence.dao;

import java.util.List;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.MobileService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMobileServiceJpaDAO extends
JpaRepository<MobileService, Long>,
JpaSpecificationExecutor<MobileService>, INameSupport<MobileService> {

	String FIND_BY_SERVICE_PROVIDER_ID_QUERY = "SELECT s.mobileServices  "
			+ "FROM ServiceProvider s " + "WHERE s.id = :id";

	@Query(FIND_BY_SERVICE_PROVIDER_ID_QUERY)
	List<MobileService> findByServiceProviderId(@Param("id") long sp_id);
	//
}
