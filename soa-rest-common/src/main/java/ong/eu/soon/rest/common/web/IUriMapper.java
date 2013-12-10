package ong.eu.soon.rest.common.web;

import ong.eu.soon.rest.common.persistence.model.IEntity;

public interface IUriMapper {

    <T extends IEntity> String getUriBase(final Class<T> clazz);

}
