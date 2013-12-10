package ong.eu.soon.rest.common.persistence.service;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;

public interface IService<T extends INameableEntity> extends IRawService<T>, INameSupport<T> {

    //

}
