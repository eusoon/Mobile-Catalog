package ong.eu.soon.rest.sec.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.Role;

import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

@Component
public final class PrincipalEntityOpsImpl implements IEntityOperations<Principal> {

	public PrincipalEntityOpsImpl() {
		super();
	}

	// API

	// template method

	@Override
	public final Principal createNewEntity() {
		return new Principal(randomAlphabetic(8), randomAlphabetic(8), "N",
				Sets.<Role> newHashSet());
	}

	@Override
	public final void invalidate(final Principal entity) {
		entity.setName(null);
	}

	@Override
	public final void change(final Principal resource) {
		resource.setName(randomAlphabetic(8));
	}

}
