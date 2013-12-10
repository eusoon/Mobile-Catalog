package ong.eu.soon.rest.sec.persistence.service;

import java.util.List;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.MobileService;


public interface IMobileServiceService extends IService<MobileService> {


	List<MobileService> findByServiceProviderId(long sp_id);
	//
}
