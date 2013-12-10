package ong.eu.soon.rest.sec.web.store;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import my.com.infopro.rest.common.client.IEntityOperations;
import my.com.infopro.rest.common.test.contract.IResourceWithAssociationsIntegrationTest;

import ong.eu.soon.rest.sec.client.template.ServiceTestRestTemplate;
import ong.eu.soon.rest.sec.client.template.StoreTestRestTemplate;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceEntityOpsImpl;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.StoreEntityOpsImpl;
import ong.eu.soon.rest.sec.test.SecLogicRestLiveTest;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Sets;
import com.jayway.restassured.response.Response;

public class StoreLogicRestLiveTest extends SecLogicRestLiveTest<Store>
implements IResourceWithAssociationsIntegrationTest {

	@Autowired
	private StoreTestRestTemplate api;
	@Autowired
	private ServiceTestRestTemplate associationApi;

	@Autowired
	private StoreEntityOpsImpl entityOps;
	@Autowired
	private ServiceEntityOpsImpl associationEntityOps;

	public StoreLogicRestLiveTest() {
		super(Store.class);
	}

	// tests

	@Override
	@Test
	public final void givenResourceHasAssociations_whenResourceIsRetrieved_thenAssociationsAreAlsoRetrieved() {
		// Given
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		final Store newResource = getEntityOps().createNewEntity();
		newResource.getServices().add(existingAssociation);

		// When
		final Store existingResource = getApi().create(newResource);

		// Then
		assertThat(existingResource.getServices(), notNullValue());
		assertThat(existingResource.getServices(),
				not(Matchers.<Service> empty()));
	}

	// escaping characters

	@Test
	@Ignore("temp + move in parent")
	public final void givenWorkingWithSpecialCharacters_whtnResourcesIfRetrievedByName_thenResourceIsCorrectlyRetrieved() {
		final Store newResource = getEntityOps().createNewEntity();
		newResource.setName("Macy's,Dell, Inc.");
		getApi().createAsResponse(newResource);

		// When
		final Store retrievedResource = getApi().findByName(
				newResource.getName());
		assertEquals(newResource, retrievedResource);
	}

	// find one

	@Test
	public final void givenResourceExists_whenResourceIsRetrievedByName_thenResourceIsCorrectlyRetrieved() {
		final Store newResource = getEntityOps().createNewEntity();
		getApi().create(newResource);
		final Store existingResourceByName = getApi().findByName(
				newResource.getName());
		assertEquals(newResource, existingResourceByName);
	}

	// find all

	@Test
	@Ignore("in progress - create association first")
	public final void whenResourceIsRetrieved_thenAssociationsAreAlsoRetrieved() {
		final Store existingResource = getApi().create(
				getEntityOps().createNewEntity());
		assertThat(existingResource.getServices(),
				not(Matchers.<Service> empty()));
	}

	// create

	@Test
	public final void givenResourceHasNameWithSpace_whenResourceIsCreated_then201IsReceived() {
		final Store newResource = getEntityOps().createNewEntity();
		newResource.setName(randomAlphabetic(4) + " " + randomAlphabetic(4));

		// When
		final Response createAsResponse = getApi().createAsResponse(newResource);

		// Then
		assertThat(createAsResponse.getStatusCode(), is(201));
	}

	@Test
	@Ignore("temp")
	public final void givenExistingResourceHasNameWithSpace_whenResourcesIfRetrievedByName_thenResourceIsCorrectlyRetrieved() {
		final Store newResource = getEntityOps().createNewEntity();
		newResource.setName(randomAlphabetic(4) + " " + randomAlphabetic(4));
		getApi().createAsResponse(newResource);

		// When
		final Store retrievedResource = getApi().findByName(
				newResource.getName());
		assertEquals(newResource, retrievedResource);
	}

	@Test
	public final void whenCreatingNewResourceWithExistingAssociations_thenNewResourceIsCorrectlyCreated() {
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		final Store newResource = getEntityOps().createNewEntity();
		newResource.getServices().add(existingAssociation);
		getApi().create(newResource);

		final Store newResource2 = getEntityOps().createNewEntity();
		newResource2.getServices().add(existingAssociation);
		getApi().create(newResource2);
	}

	/**
	 * - note: this test ensures that a new User cannot automatically create new
	 * Services <br>
	 * - note: the standard way to do this is: first create the Service
	 * resource(s), then associate them with the new User resource and then
	 * create the User resource
	 */
	@Test
	public final void whenResourceIsCreatedWithNewAssociation_then409IsReceived() {
		final Store newResource = getEntityOps().createNewEntity();
		newResource.getServices().add(
				getAssociationEntityOps().createNewEntity());

		// When
		final Response response = getApi().createAsResponse(newResource);

		// Then
		assertThat(response.getStatusCode(), is(409));
	}

	@Test
	public final void whenResourceIsCreatedWithInvalidAssociation_then409IsReceived() {
		final Service invalidAssociation = getAssociationEntityOps()
				.createNewEntity();
		getAssociationEntityOps().invalidate(invalidAssociation);
		final Store newResource = getEntityOps().createNewEntity();
		newResource.getServices().add(invalidAssociation);

		// When
		final Response response = getApi().createAsResponse(newResource);

		// Then
		assertThat(response.getStatusCode(), is(409));
	}

	@Test
	public final void whenResourceIsCreatedWithExistingAssociation_then201IsReceived() {
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		final Store newResource = getEntityOps().createNewEntity();
		newResource.getServices().add(existingAssociation);

		// When
		final Response response = getApi().createAsResponse(newResource);

		// Then
		assertThat(response.getStatusCode(), is(201));
	}

	@Test
	public final void whenResourceIsCreatedWithExistingAssociation_thenAssociationIsLinkedToTheResource() {
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		final Store resourceToCreate = getEntityOps().createNewEntity();

		// When
		resourceToCreate.getServices().add(existingAssociation);
		final Store existingResource = getApi().create(resourceToCreate);

		// Then
		assertThat(existingResource.getServices(),
				hasItem(existingAssociation));
	}

	// update

	@Test
	public final void givenResourceExists_whenResourceIsUpdatedWithExistingAssociation_thenAssociationIsCorrectlyUpdated() {
		// Given
		final Store existingResource = getApi().create(
				getEntityOps().createNewEntity());
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		existingResource.setServices(Sets.newHashSet(existingAssociation));

		// When
		getApi().update(existingResource);

		// Given
		final Store updatedResource = getApi()
				.findOne(existingResource.getId());
		assertThat(updatedResource.getServices(), hasItem(existingAssociation));
	}

	@Test
	public final void givenExistingResourceAndExistingAssociation_whenUpdatingResourceWithTheAssociation_thanAssociationCorrectlyDone() {
		final Store existingResource = getApi().create(
				getEntityOps().createNewEntity());
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		existingResource.setServices(Sets.newHashSet(existingAssociation));

		getApi().update(existingResource);
		final Store updatedResource = getApi()
				.findOne(existingResource.getId());
		assertThat(updatedResource.getServices(), hasItem(existingAssociation));
	}

	// delete

	@Test
	@Ignore("TODO: fix")
	public final void givenResourceWithAssociationsExists_thenResourceCanBeDeleted() {
		// Given
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		final Store newResource = getEntityOps().createNewEntity();
		newResource.getServices().add(existingAssociation);
		final Store existingResource = getApi().create(newResource);

		// When
		getApi().delete(existingResource.getId());

		// Then
		assertNull(getApi().findOne(existingAssociation.getId()));
	}

	// complex scenarios

	@Test
	public final void whenScenarioOfWorkingWithAssociations_thenTheChangesAreCorrectlyPersisted() {
		final Service existingAssociation = getAssociationAPI().create(
				getAssociationEntityOps().createNewEntity());
		final Store resource1 = new Store(randomAlphabetic(6),
				randomAlphabetic(8), new BigDecimal(randomNumeric(2)),
				new BigDecimal(randomNumeric(2)),
				Sets.newHashSet(existingAssociation));

		final Store resource1ViewOfServerBefore = getApi().create(resource1);
		assertThat(resource1ViewOfServerBefore.getServices(),
				hasItem(existingAssociation));

		final Store resource2 = new Store(randomAlphabetic(6),
				randomAlphabetic(8), new BigDecimal(randomNumeric(2)),
				new BigDecimal(randomNumeric(2)),
				Sets.newHashSet(existingAssociation));
		getApi().create(resource2);

		final Store resource1ViewOfServerAfter = getApi().findOne(
				resource1ViewOfServerBefore.getId());
		assertThat(resource1ViewOfServerAfter.getServices(),
				hasItem(existingAssociation));
	}

	// template

	@Override
	protected final StoreTestRestTemplate getApi() {
		return api;
	}

	@Override
	protected final IEntityOperations<Store> getEntityOps() {
		return entityOps;
	}

	// util

	final ServiceTestRestTemplate getAssociationAPI() {
		return associationApi;
	}

	final IEntityOperations<Service> getAssociationEntityOps() {
		return associationEntityOps;
	}

}
