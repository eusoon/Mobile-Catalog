package ong.eu.soon.rest.sec.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Service;

import org.springframework.stereotype.Component;

@Component
public final class ServiceEntityOpsImpl implements IEntityOperations<Service> {

	public ServiceEntityOpsImpl() {
		super();
	}

	// template method

	@Override
	public final Service createNewEntity() {
		return new Service(randomAlphabetic(8), randomAlphabetic(20));
	}

	@Override
	public final void invalidate(final Service entity) {
		entity.setName(null);
	}

	@Override
	public void change(final Service resource) {
		resource.setName(randomAlphabetic(8));
		resource.setDescription(randomAlphabetic(30));
	}

}
