package ong.eu.soon.rest.common.client.template;


import ong.eu.soon.rest.common.persistence.model.IEntity;

import org.apache.commons.lang3.tuple.Pair;

public interface ITemplateWithUri<T extends IEntity> extends IReadOnlyTemplateWithUri<T> {

    // create

    String createAsUri(final T resource, final Pair<String, String> credentials);

    String createAsUri(final T resource);

}
