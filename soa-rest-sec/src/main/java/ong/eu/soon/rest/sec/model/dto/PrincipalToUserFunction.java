package ong.eu.soon.rest.sec.model.dto;

import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.dto.User;

import com.google.common.base.Function;

public final class PrincipalToUserFunction implements Function<Principal, User> {

	@Override
	public final User apply(final Principal principal) {
		return new User(principal);
	}

}
