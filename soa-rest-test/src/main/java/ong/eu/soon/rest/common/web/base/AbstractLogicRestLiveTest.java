package ong.eu.soon.rest.common.web.base;

import static ong.eu.soon.rest.common.search.ClientOperation.EQ;
import static ong.eu.soon.rest.common.search.ClientOperation.NEG_EQ;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotNull;


import ong.eu.soon.rest.common.client.IEntityOperations;
import ong.eu.soon.rest.common.client.marshall.IMarshaller;
import ong.eu.soon.rest.common.client.template.IRestTemplate;
import ong.eu.soon.rest.common.persistence.model.INameableEntity;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.common.util.IDUtil;
import ong.eu.soon.rest.common.util.SearchField;
import ong.eu.soon.rest.common.web.WebConstants;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.http.HttpHeaders;
import org.hamcrest.core.StringContains;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import com.google.common.base.Preconditions;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

@ActiveProfiles({ "client", "test", "mime_json" })
public abstract class AbstractLogicRestLiveTest<T extends INameableEntity> {

    @Autowired
    private IMarshaller marshaller;

    protected final Class<T> clazz;

    public AbstractLogicRestLiveTest(final Class<T> clazzToSet) {
        super();

        Preconditions.checkNotNull(clazzToSet);
        clazz = clazzToSet;
    }

    // tests

    // find - one

    @Test
    /*code*/public void givenResourceForIdExists_whenResourceOfThatIdIsRetrieved_then200IsRetrieved() {
        // Given
        final String uriForResourceCreation = getApi().createAsUri(createNewEntity(), null);

        // When
        final Response res = getApi().findOneByUriAsResponse(uriForResourceCreation, null);

        // Then
        assertThat(res.getStatusCode(), is(200));
    }

    @Test
    @Ignore("this was written for a neo4j persistence engine, which treats null ids differently than Hibernate")
    /*code*/public void whenResourceIsRetrievedByNegativeId_then409IsReceived() {
        final Long id = IDUtil.randomNegativeLong();

        // When
        final Response res = getApi().findOneByUriAsResponse(getUri() + WebConstants.PATH_SEP + id, null);

        // Then
        assertThat(res.getStatusCode(), is(409));
    }

    // find one - by attributes
    // note: kept as the same tests from AbstractLogicClientRestLiveTest are still ignored (bug in RestTemplate)

    @Test
    /**/public final void givenResourceExists_whenResourceIsSearchedByNameAttribute_thenNoExceptions() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        final ImmutableTriple<String, ClientOperation, String> nameConstraint = new ImmutableTriple<String, ClientOperation, String>(SearchField.name.name(), EQ, existingResource.getName());
        getApi().searchOne(nameConstraint);
    }

    @Test
    /**/public final void givenResourceExists_whenResourceIsSearchedByNameAttribute_thenResourceIsFound() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        final ImmutableTriple<String, ClientOperation, String> nameConstraint = new ImmutableTriple<String, ClientOperation, String>(SearchField.name.name(), EQ, existingResource.getName());
        final T resourceByName = getApi().searchOne(nameConstraint);

        // Then
        assertNotNull(resourceByName);
    }

    @Test
    /**/public final void givenResourceExists_whenResourceIsSearchedByNameAttribute_thenFoundResourceIsCorrect() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        final ImmutableTriple<String, ClientOperation, String> nameConstraint = new ImmutableTriple<String, ClientOperation, String>(SearchField.name.name(), EQ, existingResource.getName());
        final T resourceByName = getApi().searchOne(nameConstraint);

        // Then
        assertThat(existingResource, equalTo(resourceByName));
    }

    @Test
    /**/public final void givenResourceExists_whenResourceIsSearchedByNagatedNameAttribute_thenNoExceptions() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        final ImmutableTriple<String, ClientOperation, String> nameConstraint = new ImmutableTriple<String, ClientOperation, String>(SearchField.name.name(), NEG_EQ, existingResource.getName());
        getApi().searchAll(nameConstraint);

        // Then
    }

    // create

    @Test
    /*code*/public void whenResourceIsCreated_then201IsReceived() {
        // When
        final Response response = getApi().createAsResponse(createNewEntity());

        // Then
        assertThat(response.getStatusCode(), is(201));
    }

    @Test
    /*code*/public void whenNullResourceIsCreated_then415IsReceived() {
        // When
        final Response response = givenAuthenticated().contentType(getApi().getMarshaller().getMime()).post(getUri());

        // Then
        assertThat(response.getStatusCode(), is(415));
    }

    @Test
    /*code*/public void whenResourceIsCreatedWithNonNullId_then409IsReceived() {
        final T resourceWithId = createNewEntity();
        resourceWithId.setId(5l);

        // When
        final Response response = getApi().createAsResponse(resourceWithId);

        // Then
        assertThat(response.getStatusCode(), is(409));
    }

    @Test
    /*low level*/public void whenResourceIsCreated_thenALocationIsReturnedToTheClient() {
        // When
        final Response response = getApi().createAsResponse(createNewEntity());

        // Then
        assertNotNull(response.getHeader(HttpHeaders.LOCATION));
    }

    @Test
    @Ignore("this will not always pass at this time")
    /*code*/public void givenResourceExists_whenResourceWithSameAttributesIsCreated_then409IsReceived() {
        // Given
        final T newEntity = createNewEntity();
        getApi().createAsUri(newEntity, null);

        // When
        final Response response = getApi().createAsResponse(newEntity);

        // Then
        assertThat(response.getStatusCode(), is(409));
    }

    // update

    @Test
    /*code*/public void givenInvalidResource_whenResourceIsUpdated_then409ConflictIsReceived() {
        // Given
        final T existingResource = getApi().create(createNewEntity());
        getEntityOps().invalidate(existingResource);

        // When
        final Response response = getApi().updateAsResponse(existingResource);

        // Then
        assertThat(response.getStatusCode(), is(409));
    }

    @Test
    /*code*/public void whenResourceIsUpdatedWithNullId_then400IsReceived() {
        // When
        final Response response = getApi().updateAsResponse(createNewEntity());

        // Then
        assertThat(response.getStatusCode(), is(400));
    }

    @Test
    /*code*/public void givenResourceExists_whenResourceIsUpdated_then200IsReceived() {
        // Given
        final T existingResource = getApi().create(createNewEntity());

        // When
        final Response response = getApi().updateAsResponse(existingResource);

        // Then
        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    /*code*/public void whenNullResourceIsUpdated_then400IsReceived() {
        // Given
        // When
        final Response response = givenAuthenticated().contentType(getApi().getMarshaller().getMime()).put(getUri() + "/" + randomAlphanumeric(4));

        // Then
        assertThat(response.getStatusCode(), is(400));
    }

    @Test
    /*code*/public void givenResourceDoesNotExist_whenResourceIsUpdated_then404IsReceived() {
        // Given
        final T unpersistedEntity = createNewEntity();
        unpersistedEntity.setId(IDUtil.randomPositiveLong());

        // When
        final Response response = getApi().updateAsResponse(unpersistedEntity);

        // Then
        assertThat(response.getStatusCode(), is(404));
    }

    // delete

    @Test
    /*code*/public void whenResourceIsDeletedByIncorrectNonNumericId_then400IsReceived() {
        // When
        final Response response = getApi().deleteAsResponse(getUri() + randomAlphabetic(6));

        // Then
        assertThat(response.getStatusCode(), is(400));
    }

    @Test
    /*code*/public void givenResourceDoesNotExist_whenResourceIsDeleted_then404IsReceived() {
        // When
        final Response response = getApi().deleteAsResponse(getUri() + randomNumeric(6));

        // Then
        assertThat(response.getStatusCode(), is(404));
    }

    @Test
    /*code*/public void givenResourceExists_whenResourceIsDeleted_then204IsReceived() {
        // Given
        final String uriForResourceCreation = getApi().createAsUri(createNewEntity(), null);

        // When
        final Response response = getApi().deleteAsResponse(uriForResourceCreation);

        // Then
        assertThat(response.getStatusCode(), is(204));
    }

    @Test
    /*code*/public void givenResourceExistedAndWasDeleted_whenRetrievingResource_then404IsReceived() {
        // Given
        final String uriOfResource = getApi().createAsUri(createNewEntity(), null);
        getApi().deleteAsResponse(uriOfResource);

        // When
        final Response getResponse = getApi().findOneByUriAsResponse(uriOfResource, null);

        // Then
        assertThat(getResponse.getStatusCode(), is(404));
    }

    // mime

    @Test
    public final void givenRequestAcceptsMime_whenResourceIsRetrievedById__thenResponseContentTypeIsMime() {
        // Given
        final String uriForResourceCreation = getApi().createAsUri(createNewEntity(), null);

        // When
        final Response res = getApi().findOneByUriAsResponse(uriForResourceCreation, null);

        // Then
        assertThat(res.getContentType(), StringContains.containsString(marshaller.getMime()));
    }

    // template method

    protected abstract IRestTemplate<T> getApi();

    protected abstract IEntityOperations<T> getEntityOps();

    protected T createNewEntity() {
        return getEntityOps().createNewEntity();
    }

    protected final String getUri() {
        return getApi().getUri() + WebConstants.PATH_SEP;
    }

    protected final RequestSpecification givenAuthenticated() {
        return getApi().givenAuthenticated();
    }

}
