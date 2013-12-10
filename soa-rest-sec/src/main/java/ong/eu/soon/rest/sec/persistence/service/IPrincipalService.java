package ong.eu.soon.rest.sec.persistence.service;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.Principal;

public interface IPrincipalService extends IService<Principal> {

	Principal getCurrentPrincipal();

}
