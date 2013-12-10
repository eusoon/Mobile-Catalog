package ong.eu.soon.rest.sec.persistence.service;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.Store;


public interface IStoreService extends IService<Store> {

	Store getCurrentStore();

}
