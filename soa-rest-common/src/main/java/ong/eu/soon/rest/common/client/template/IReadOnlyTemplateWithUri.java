package ong.eu.soon.rest.common.client.template;

import java.util.List;


import ong.eu.soon.rest.common.persistence.model.IEntity;

import org.apache.commons.lang3.tuple.Pair;

public interface IReadOnlyTemplateWithUri<T extends IEntity> {

    // find - one

    T findOneByUri(final String uri, final Pair<String, String> credentials);

    // find - all

    List<T> findAllByUri(final String uri, final Pair<String, String> credentials);

}
