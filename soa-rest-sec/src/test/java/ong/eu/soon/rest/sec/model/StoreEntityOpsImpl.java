package ong.eu.soon.rest.sec.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import java.math.BigDecimal;

import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.Store;

import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

@Component
public final class StoreEntityOpsImpl implements IEntityOperations<Store> {

	public StoreEntityOpsImpl() {
		super();
	}

	// API

	// template method

	@Override
	public final Store createNewEntity() {
		return new Store(randomAlphabetic(8), randomAlphabetic(15),
				randomAlphabetic(10), new BigDecimal(randomNumeric(2)),
				new BigDecimal(randomNumeric(2)), randomAlphabetic(15),
				randomAlphabetic(15), randomAlphabetic(15),
				Sets.<Service> newHashSet());
	}

	@Override
	public final void invalidate(final Store entity) {
		entity.setName(null);
	}

	@Override
	public final void change(final Store resource) {
		resource.setName(randomAlphabetic(8));
	}

}
