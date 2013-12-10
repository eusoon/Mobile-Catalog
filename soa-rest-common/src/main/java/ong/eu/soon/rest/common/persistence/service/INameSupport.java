package ong.eu.soon.rest.common.persistence.service;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;

public interface INameSupport<T extends INameableEntity> {

    T findByName(final String name);

}
