package ong.eu.soon.rest.sec.persistence.service.dto;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.dto.User;

public interface IUserService extends IService<User> {

	User getCurrentUser();

}
