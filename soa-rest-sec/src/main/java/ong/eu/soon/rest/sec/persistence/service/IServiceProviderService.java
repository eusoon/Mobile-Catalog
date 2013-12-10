package ong.eu.soon.rest.sec.persistence.service;

import java.util.List;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.ServiceProvider;


public interface IServiceProviderService extends IService<ServiceProvider> {
	//
	public List<ServiceProvider> findByType(final String type);
}