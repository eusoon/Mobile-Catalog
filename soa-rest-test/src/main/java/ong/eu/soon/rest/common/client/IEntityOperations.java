package ong.eu.soon.rest.common.client;

import ong.eu.soon.rest.common.persistence.model.IEntity;

public interface IEntityOperations<T extends IEntity> {

    T createNewEntity();

    void invalidate(final T entity);

    void change(final T resource);

}
