package ong.eu.soon.rest.sec.persistence.util;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import java.math.BigDecimal;

import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.dto.User;


import com.google.common.collect.Sets;

public class FixtureFactory {

	private FixtureFactory() {
		throw new AssertionError();
	}

	// user DTO

	public static User createNewUser() {
		return createNewUser(randomAlphabetic(8), randomAlphabetic(8));
	}

	public static User createNewUser(final String name, final String pass) {
		return new User(name, pass, Sets.<Role> newHashSet());
	}

	// principal

	public static Principal createNewPrincipal() {
		return createNewPrincipal(randomAlphabetic(8), randomAlphabetic(8));
	}

	public static Principal createNewPrincipal(final String name, final String pass) {
		return new Principal(name, pass, "N", Sets.<Role> newHashSet());
	}

	// role

	public static Role createNewRole() {
		return createNewRole(randomAlphabetic(8));
	}

	public static Role createNewRole(final String name) {
		return new Role(name, Sets.<Privilege> newHashSet());
	}

	// privilege

	public static Privilege createNewPrivilege() {
		return createNewPrivilege(randomAlphabetic(8));
	}

	public static Privilege createNewPrivilege(final String name) {
		return new Privilege(name);
	}

	public static Service createNewService() {
		return createNewService(randomAlphabetic(8));
	}

	public static Service createNewService(final String name) {
		return new Service(name);
	}

	public static Store createNewStore() {
		return createNewStore(randomAlphabetic(8), randomAlphabetic(15));
	}

	public static Store createNewStore(final String name, final String address) {
		return new Store(name, address, new BigDecimal(randomNumeric(2)),
				new BigDecimal(randomNumeric(2)), Sets.<Service> newHashSet());
	}
}
