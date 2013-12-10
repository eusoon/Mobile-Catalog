package ong.eu.soon.rest.common.client.template;


import ong.eu.soon.rest.common.persistence.model.IEntity;
import ong.eu.soon.rest.common.web.WebConstants;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.google.common.base.Preconditions;

public abstract class AbstractClientRestTemplate<T extends IEntity> extends AbstractReadOnlyClientRestTemplate<T> {

    public AbstractClientRestTemplate(final Class<T> clazzToSet) {
        super(clazzToSet);
    }

    // create

    @Override
    public final T create(final T resource) {
        return create(resource, null);
    }

    @Override
    public final T create(final T resource, final Pair<String, String> credentials) {
        final String locationOfCreatedResource = createAsUri(resource, credentials);

        return findOneByUri(locationOfCreatedResource, credentials);
    }

    @Override
    public final String createAsUri(final T resource) {
        return createAsUri(resource, null);
    }

    @Override
    public final String createAsUri(final T resource, final Pair<String, String> credentials) {
        final ResponseEntity<Void> responseEntity = restTemplate.exchange(getUri(), HttpMethod.POST, new HttpEntity<T>(resource, writeHeadersWithAuth(credentials)), Void.class);

        final String locationOfCreatedResource = responseEntity.getHeaders().getLocation().toString();
        Preconditions.checkNotNull(locationOfCreatedResource);

        return locationOfCreatedResource;
    }

    // update

    @Override
    public void update(final T resource) {
        updateInternal(resource, getWriteDefaultCredentials());
    }

    protected final void updateInternal(final T resource, final Pair<String, String> credentials) {
        final ResponseEntity<T> responseEntity = restTemplate.exchange(getUri() + "/" + resource.getId(), HttpMethod.PUT, new HttpEntity<T>(resource, writeHeadersWithAuth(credentials)), clazz);
        Preconditions.checkState(responseEntity.getStatusCode().value() == 200);
    }

    // delete

    @Override
    public final void delete(final long id) {
        final ResponseEntity<Void> deleteResourceResponse = restTemplate.exchange(getUri() + WebConstants.PATH_SEP + id, HttpMethod.DELETE, new HttpEntity<Void>(writeHeadersWithAuth()), Void.class);

        Preconditions.checkState(deleteResourceResponse.getStatusCode().value() == 204);
    }

    @Override
    public final void deleteAll() {
        throw new UnsupportedOperationException();
    }

    // template method

    /**
     * - this is a hook that executes before read operations, in order to allow custom security work to happen for read operations; similar to: AbstractRestTemplate.findRequest
     */
    @Override
    protected void beforeReadOperation() {
        //
    }

}
