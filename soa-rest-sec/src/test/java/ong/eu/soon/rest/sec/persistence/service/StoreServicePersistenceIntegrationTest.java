package ong.eu.soon.rest.sec.persistence.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.common.persistence.service.IService;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.StoreEntityOpsImpl;
import ong.eu.soon.rest.sec.persistence.service.IServiceService;
import ong.eu.soon.rest.sec.persistence.service.IStoreService;
import ong.eu.soon.rest.sec.test.SecServicePersistenceIntegrationTest;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.google.common.collect.Sets;

@Ignore
public class StoreServicePersistenceIntegrationTest extends
SecServicePersistenceIntegrationTest<Store> {

	@Autowired
	private IServiceService serviceService;
	@Autowired
	private IStoreService storeService;

	@Autowired
	private StoreEntityOpsImpl entityOps;

	// create

	@Test
	public void whenSaveIsPerformed_thenNoException() {
		storeService.create(createNewEntity());
	}

	@Test(expected = DataAccessException.class)
	@Ignore
	public void whenAUniqueConstraintIsBroken_thenSpringSpecificExceptionIsThrown() {
		final String name = randomAlphabetic(8);

		storeService.create(createNewEntity(name));
		storeService.create(createNewEntity(name));
	}

	// scenario



	@Test
	public final void whenCreatingNewResourceWithExistingAssociations_thenNewResourceIsCorrectlyCreated() {
		final Service existingAssociation = getAssociationService().create(
				new Service(randomAlphabetic(6)));
		final Store newResource = createNewEntity();
		newResource.getServices().add(existingAssociation);
		getApi().create(newResource);

		final Store newResource2 = createNewEntity();
		newResource2.getServices().add(existingAssociation);
		getApi().create(newResource2);
	}

	@Test
	public final void whenScenarioOfWorkingWithAssociations_thenTheChangesAreCorrectlyPersisted() {
		final Service existingAssociation = getAssociationService().create(
				new Service(randomAlphabetic(6)));
		final Store resource1 = new Store(randomAlphabetic(6),
				randomAlphabetic(6), new BigDecimal(randomNumeric(2)),
				new BigDecimal(randomNumeric(2)),
				Sets.newHashSet(existingAssociation));

		final Store resource1ViewOfServerBefore = getApi().create(resource1);
		assertThat(resource1ViewOfServerBefore.getServices(),
				hasItem(existingAssociation));

		final Store resource2 = new Store(randomAlphabetic(6),
				randomAlphabetic(6), new BigDecimal(randomNumeric(2)),
				new BigDecimal(randomNumeric(2)),
				Sets.newHashSet(existingAssociation));
		getApi().create(resource2);

		final Store resource1ViewOfServerAfter = getApi().findOne(
				resource1ViewOfServerBefore.getId());
		assertThat(resource1ViewOfServerAfter.getServices(),
				hasItem(existingAssociation));
	}

	// template method

	@Override
	protected final IService<Store> getApi() {
		return storeService;
	}

	@Override
	protected final Store createNewEntity() {
		return createNewEntity(randomAlphabetic(8));
	}

	@Override
	protected final IEntityOperations<Store> getEntityOps() {
		return entityOps;
	}

	// util

	protected final Store createNewEntity(final String name) {
		return new Store(name, randomAlphabetic(6), new BigDecimal(
				randomNumeric(2)), new BigDecimal(randomNumeric(2)),
				Sets.<Service> newHashSet());
	}

	final IServiceService getAssociationService() {
		return serviceService;
	}

}
