package ong.eu.soon.rest.sec.persistence.dao;

import java.util.List;


import ong.eu.soon.rest.common.persistence.service.INameSupport;
import ong.eu.soon.rest.sec.model.ServiceProvider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IServiceProviderJpaDAO extends
JpaRepository<ServiceProvider, Long>,
JpaSpecificationExecutor<ServiceProvider>,
INameSupport<ServiceProvider> {

	public final static String FIND_BY_TYPE_QUERY = "SELECT s "
			+ "FROM ServiceProvider s " + "WHERE s.type = :type";
	//
	@Query(FIND_BY_TYPE_QUERY)
	public List<ServiceProvider> findByType(@Param("type") String type);

}
