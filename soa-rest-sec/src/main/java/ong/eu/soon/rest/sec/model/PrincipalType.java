/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package ong.eu.soon.rest.sec.model;

import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.utils.StringValuedEnum;


/**
 * A principal type
 * 
 * @author luis
 */
public class PrincipalType {

	public static enum Principal implements StringValuedEnum {
		/** By username */
		USER("U", "login.username"),

		/** By e-mail */
		EMAIL("E", "member.email"),

		/** By card number */
		CARD("C", "card.card"),

		/** By custom field */
		CUSTOM_FIELD("F", null); // The custom field's name is what should be
		// used to display

		private final String value;
		private final String key;

		private Principal(final String value1, final String key1) {
			value = value1;
			key = key1;
		}

		public String getKey() {
			return key;
		}

		@Override
		public String getValue() {
			return value;
		}

		public boolean isNumeric() {
			return this == CARD;
		}

	}

	public static enum Credentials implements StringValuedEnum {

		/**
		 * The default 2 passwords style: login with login password and perform
		 * payments with transaction password
		 */
		DEFAULT("D"),

		/** The login password only */
		LOGIN_PASSWORD("L"),

		/** The transaction password only */
		TRANSACTION_PASSWORD("T"),

		/** The external pin only */
		PIN("P"),

		/** The card security code */
		CARD_SECURITY_CODE("C");

		private final String value;

		private Credentials(final String value1) {
			value = value1;
		}

		@Override
		public String getValue() {
			return value;
		}
	}
	private Principal principal;
	private User user;

	// private MemberCustomField customField;

	// public PrincipalType(final MemberCustomField customField) {
	// this(Principal.CUSTOM_FIELD);
	// this.customField = customField;
	// }

	public PrincipalType(final Principal principal1) {
		principal = principal1;
	}

	@Override
	public boolean equals(final Object obj) {
		if (!(obj instanceof PrincipalType)) {
			return false;
		}
		final PrincipalType type = (PrincipalType) obj;
		if (principal.equals(type.principal)) {
			// if (principal == Principal.CUSTOM_FIELD) {
			// return customField.equals(type.getCustomField());
			// }
			return true;
		}
		return false;
	}

	// public MemberCustomField getCustomField() {
	// return customField;
	// }

	public Principal getPrincipal() {
		return principal;
	}

	@Override
	public int hashCode() {
		// if (principal == Principal.CUSTOM_FIELD) {
		// return customField.hashCode();
		// }
		return principal.hashCode();
	}

	@Override
	public String toString() {
		/*
		 * if (principal == Principal.CUSTOM_FIELD) { return customField == null
		 * ? "<null custom field>" : customField .getInternalName(); }
		 */
		if (principal == null) {
			return "<null principal>";
		}
		return principal.name();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user1) {
		user = user1;
	}
}
