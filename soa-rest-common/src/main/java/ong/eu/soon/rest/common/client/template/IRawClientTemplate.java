package ong.eu.soon.rest.common.client.template;


import ong.eu.soon.rest.common.IOperations;
import ong.eu.soon.rest.common.persistence.model.IEntity;

import org.apache.commons.lang3.tuple.Pair;

public interface IRawClientTemplate<T extends IEntity> extends IOperations<T>, ITemplateWithUri<T> {

    //

    String getUri();

    // create

    T create(final T resource, final Pair<String, String> credentials);

    T findOne(final long id, final Pair<String, String> credentials);

}
