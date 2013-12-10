package ong.eu.soon.rest.sec.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.com.infopro.rest.common.client.IEntityOperations;

import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.dto.User;

import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

@Component
public final class UserEntityOpsImpl implements IEntityOperations<User> {

	public UserEntityOpsImpl() {
		super();
	}

	// API

	public final User createNewEntity(final String name) {
		return new User(name, randomAlphabetic(8), Sets.<Role> newHashSet());
	}

	// template method

	@Override
	public final User createNewEntity() {
		return new User(randomAlphabetic(8), randomAlphabetic(8), Sets.<Role> newHashSet());
	}

	@Override
	public final void invalidate(final User entity) {
		entity.setName(null);
	}

	@Override
	public final void change(final User resource) {
		resource.setName(randomAlphabetic(8));
	}

}
