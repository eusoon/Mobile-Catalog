package ong.eu.soon.rest.common.client.template;

import static ong.eu.soon.rest.common.search.ClientOperation.EQ;


import ong.eu.soon.rest.common.persistence.model.INameableEntity;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.common.util.SearchField;

import org.apache.commons.lang3.tuple.ImmutableTriple;

@SuppressWarnings({ "unchecked" })
public abstract class AbstractNamedClientRestTemplate<T extends INameableEntity> extends AbstractClientRestTemplate<T> implements IClientTemplate<T> {

    public AbstractNamedClientRestTemplate(final Class<T> clazzToSet) {
        super(clazzToSet);
    }

    // find one - by attributes

    @Override
    public T findByName(final String name) {
        beforeReadOperation();
        return searchOne(new ImmutableTriple<String, ClientOperation, String>(SearchField.name.name(), EQ, name));
    }

}
