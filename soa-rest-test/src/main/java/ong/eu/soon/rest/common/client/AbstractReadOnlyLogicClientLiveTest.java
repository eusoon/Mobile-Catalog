package ong.eu.soon.rest.common.client;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;


import ong.eu.soon.rest.common.client.template.IRawClientTemplate;
import ong.eu.soon.rest.common.persistence.model.IEntity;
import ong.eu.soon.rest.common.util.IDUtil;
import ong.eu.soon.rest.common.util.SearchField;
import ong.eu.soon.rest.common.util.order.OrderById;
import ong.eu.soon.rest.common.web.WebConstants;

import org.junit.Test;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestClientException;

@ActiveProfiles({ "client", "test", "mime_json" })
public abstract class AbstractReadOnlyLogicClientLiveTest<T extends IEntity> {

    public AbstractReadOnlyLogicClientLiveTest() {
        super();
    }

    // tests

    // find - one

    @Test(expected = RestClientException.class)
    public final void givenResourceForIdDoesNotExist_whenResourceIsRetrieved_thenException() {
        getApi().findOneByUri(getUri() + WebConstants.PATH_SEP + randomNumeric(4), null);
    }

    @Test
    /**/public final void givenResourceDoesNotExist_whenResourceIsRetrieved_thenNoResourceIsReceived() {
        // When
        final T createdResource = getApi().findOne(IDUtil.randomPositiveLong());

        // Then
        assertNull(createdResource);
    }

    // find - all

    @Test
    /**/public final void whenAllResourcesAreRetrieved_thenNoExceptions() {
        getApi().findAll();
    }

    @Test
    /**/public final void whenAllResourcesAreRetrieved_thenTheResultIsNotNull() {
        final List<T> resources = getApi().findAll();

        assertNotNull(resources);
    }

    // find - all - pagination

    @Test
    /**/public final void whenResourcesAreRetrievedPaginated_thenNoExceptions() {
        getApi().findAllPaginated(0, 1);
    }

    // find - all - sorting

    @Test
    /**/public final void whenResourcesAreRetrievedSortedDescById_thenNoExceptions() {
        getApi().findAllSorted(SearchField.id.toString(), Sort.Direction.DESC.name());
    }

    @Test
    /**/public final void whenResourcesAreRetrievedSortedAscById_thenResultsAreOrderedCorrectly() {
        final List<T> resourcesOrderedById = getApi().findAllSorted(SearchField.id.toString(), Sort.Direction.ASC.name());

        assertTrue(new OrderById<T>().isOrdered(resourcesOrderedById));
    }

    @Test
    /**/public final void whenResourcesAreRetrievedSortedDescById_thenResultsAreOrderedCorrectly() {
        final List<T> resourcesOrderedById = getApi().findAllSorted(SearchField.id.name(), Sort.Direction.DESC.name());

        assertTrue(new OrderById<T>().reverse().isOrdered(resourcesOrderedById));
    }

    // find - all - pagination and sorting

    @Test
    /**/public final void whenResourcesAreRetrievedPaginatedAndSorted_thenNoExceptions() {
        getApi().findAllPaginatedAndSorted(0, 41, SearchField.name.name(), Sort.Direction.ASC.name());
    }

    // count

    @Test
    public final void whenCountIsPerformed_thenNoExceptions() {
        getApi().count();
    }

    // template method

    protected abstract IRawClientTemplate<T> getApi();

    protected final String getUri() {
        return getApi().getUri() + WebConstants.PATH_SEP;
    }

}
