package ong.eu.soon.rest.common.client;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;


import ong.eu.soon.rest.common.client.template.IRawClientTemplate;
import ong.eu.soon.rest.common.persistence.model.IEntity;
import ong.eu.soon.rest.common.web.WebConstants;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({ "client", "test", "mime_json" })
public abstract class AbstractRawLogicClientRestLiveTest<T extends IEntity> {

    public AbstractRawLogicClientRestLiveTest() {
        super();
    }

    // tests

    // find - one

    @Test
    public final void givenResourceExists_whenResourceIsRetrieved_thenResourceHasId() {
        // Given
        final T newResource = createNewEntity();
        final String uriOfExistingResource = getApi().createAsUri(newResource, null);

        // When
        final T createdResource = getApi().findOneByUri(uriOfExistingResource, null);

        // Then
        assertThat(createdResource.getId(), notNullValue());
    }

    @Test
    public final void givenResourceExists_whenResourceIsRetrieved_thenResourceIsCorrectlyRetrieved() {
        // Given
        final T newResource = createNewEntity();
        final String uriOfExistingResource = getApi().createAsUri(newResource, null);

        // When
        final T createdResource = getApi().findOneByUri(uriOfExistingResource, null);

        // Then
        assertEquals(createdResource, newResource);
    }

    // find - all

    @Test
    /**/public void givenAtLeastOneResourceExists_whenAllResourcesAreRetrieved_thenRetrievedResourcesAreNotEmpty() {
        // Given
        ensureOneResourceExists();

        // When
        final List<T> allResources = getApi().findAll();

        // Then
        assertThat(allResources, not(Matchers.<T> empty()));
    }

    @Test
    /**/public void givenAnResourceExists_whenAllResourcesAreRetrieved_thenTheExistingResourceIsIndeedAmongThem() {
        final T existingResource = getApi().create(createNewEntity());

        final List<T> resources = getApi().findAll();

        assertThat(resources, hasItem(existingResource));
    }

    @Test
    /**/public void whenAllResourcesAreRetrieved_thenResourcesHaveIds() {
        ensureOneResourceExists();

        // When
        final List<T> allResources = getApi().findAll();

        // Then
        for (final T resource : allResources) {
            assertNotNull(resource.getId());
        }
    }

    // find - all - pagination

    @Test
    /**/public final void whenFirstPageOfResourcesAreRetrieved_thenResourcesPageIsReturned() {
        getApi().createAsUri(createNewEntity(), null);

        // When
        final List<T> allPaginated = getApi().findAllPaginated(0, 1);

        // Then
        assertFalse(allPaginated.isEmpty());
    }

    // create

    @Test(expected = RuntimeException.class)
    /**/public void whenNullResourceIsCreated_thenException() {
        getApi().create(null);
    }

    @Test
    /**/public void whenResourceIsCreated_thenNoExceptions() {
        getApi().createAsUri(createNewEntity(), null);
    }

    @Test
    /**/public void whenResourceIsCreated_thenResourceIsRetrievable() {
        final T existingResource = getApi().create(createNewEntity());

        assertNotNull(getApi().findOne(existingResource.getId()));
    }

    @Test
    /**/public void whenResourceIsCreated_thenSavedResourceIsEqualToOriginalResource() {
        final T originalResource = createNewEntity();
        final T savedResource = getApi().create(originalResource);

        assertEquals(originalResource, savedResource);
    }

    // update

    @Test(expected = RuntimeException.class)
    /**/public void whenNullResourceIsUpdated_thenException() {
        getApi().update(null);
    }

    @Test
    public void givenResourceExists_whenResourceIsUpdated_thenNoExceptions() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        getApi().update(existingResource);
    }

    @Test
    public void givenResourceExists_whenResourceIsUpdated_thenUpdatesArePersisted() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        getEntityOps().change(existingResource);
        getApi().update(existingResource);

        final T updatedResourceFromServer = getApi().findOne(existingResource.getId());

        // Then
        assertEquals(existingResource, updatedResourceFromServer);
    }

    // delete

    @Test
    public final void givenResourceExists_whenResourceIsDeleted_thenResourceNoLongerExists() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        getApi().delete(existingResource.getId());

        // Then
        assertNull(getApi().findOne(existingResource.getId()));
    }

    // count

    @Test
    public final void givenAtLeastOneResourceExists_whenCountIsPerformed_thenCountIsNotZero() {
        ensureOneResourceExists();

        assertTrue(getApi().count() > 0);
    }

    // template method

    protected abstract IEntityOperations<T> getEntityOps();

    protected T createNewEntity() {
        return getEntityOps().createNewEntity();
    }

    protected void ensureOneResourceExists() {
        getApi().createAsUri(createNewEntity(), null);
    }

    protected abstract IRawClientTemplate<T> getApi();

    protected final String getUri() {
        return getApi().getUri() + WebConstants.PATH_SEP;
    }

}
