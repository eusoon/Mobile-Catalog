package ong.eu.soon.rest.sec.util;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;


import ong.eu.soon.rest.common.persistence.model.IEntity;
import ong.eu.soon.rest.common.search.ClientOperation;
import ong.eu.soon.rest.common.util.QueryConstants;
import ong.eu.soon.rest.sec.model.MobileService;
import ong.eu.soon.rest.sec.model.MobileService_;
import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.Principal_;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Privilege_;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.Role_;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceProvider;
import ong.eu.soon.rest.sec.model.ServiceProvider_;
import ong.eu.soon.rest.sec.model.Service_;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.Store_;

import org.springframework.data.jpa.domain.Specification;

/**
 * The query specifications are built manually here; this is a limitation and
 * should be contained to this only class
 */
@SuppressWarnings("unchecked")
public final class QuerySpecificationSec {

	private QuerySpecificationSec() {
		throw new UnsupportedOperationException();
	}

	// API - retrieve specifications for all OPs and all supported classes

	public static <T extends IEntity> Specification<T> getByNameSpecification(
			final Class<T> clazz, final ClientOperation op, final String name,
			final boolean negated) {
		switch (op) {
		case EQ:
			return getByNameSpecificationEq(clazz, name, negated);
		case NEG_EQ:
			return getByNameSpecificationEq(clazz, name, negated);

		case CONTAINS:
			return getByNameSpecificationContains(clazz, name, negated);
		case STARTS_WITH:
			return getByNameSpecificationStartsWith(clazz, name, negated);
		case ENDS_WITH:
			return getByNameSpecificationEndsWith(clazz, name, negated);

		case NEG_CONTAINS:
			return getByNameSpecificationContains(clazz, name, negated);
		case NEG_STARTS_WITH:
			return getByNameSpecificationStartsWith(clazz, name, negated);
		case NEG_ENDS_WITH:
			return getByNameSpecificationEndsWith(clazz, name, negated);

		default:
			break;
		}

		throw new UnsupportedOperationException("Received invalid operator: "
				+ op);
	}

	// in between

	// id

	public static <T extends IEntity> Specification<T> getByIdSpecification(
			final Class<T> clazz, final Long id, final boolean negated) {
		if (clazz.equals(Role.class)) {
			return (Specification<T>) roleByIdEq(id, negated);
		}
		if (clazz.equals(Principal.class)) {
			return (Specification<T>) userByIdEq(id, negated);
		}
		if (clazz.equals(Privilege.class)) {
			return (Specification<T>) privilegeByIdEq(id, negated);
		}
		if (clazz.equals(Store.class)) {
			return (Specification<T>) storeByIdEq(id, negated);
		}
		if (clazz.equals(Service.class)) {
			return (Specification<T>) serviceByIdEq(id, negated);
		}
		if (clazz.equals(MobileService.class)) {
			return (Specification<T>) mobileServiceByIdEq(id, negated);
		}
		if (clazz.equals(ServiceProvider.class)) {
			return (Specification<T>) serviceProviderByIdEq(id, negated);
		}
		return null;
	}


	// name

	static <T extends IEntity> Specification<T> getByNameSpecificationEq(
			final Class<T> clazz, final String name, final boolean negated) {
		if (clazz.equals(Role.class)) {
			return (Specification<T>) roleByNameEq(name, negated);
		}
		if (clazz.equals(Principal.class)) {
			return (Specification<T>) userByNameEq(name, negated);
		}
		if (clazz.equals(Privilege.class)) {
			return (Specification<T>) privilegeByNameEq(name, negated);
		}
		if (clazz.equals(Store.class)) {
			return (Specification<T>) storeByNameEq(name, negated);
		}
		if (clazz.equals(Service.class)) {
			return (Specification<T>) serviceByNameEq(name, negated);
		}
		if (clazz.equals(MobileService.class)) {
			return (Specification<T>) mobileServiceByNameEq(name, negated);
		}
		if (clazz.equals(ServiceProvider.class)) {
			return (Specification<T>) serviceProviderByNameEq(name, negated);
		}
		return null;
	}

	static <T extends IEntity> Specification<T> getByNameSpecificationContains(
			final Class<T> clazz, final String name, final boolean negated) {
		if (clazz.equals(Role.class)) {
			return (Specification<T>) roleByNameContains(name, negated);
		}
		if (clazz.equals(Principal.class)) {
			return (Specification<T>) userByNameContains(name, negated);
		}
		if (clazz.equals(Privilege.class)) {
			return (Specification<T>) privilegeByNameContains(name, negated);
		}
		if (clazz.equals(Store.class)) {
			return (Specification<T>) storeByNameContains(name, negated);
		}
		if (clazz.equals(Service.class)) {
			return (Specification<T>) serviceByNameContains(name, negated);
		}
		if (clazz.equals(MobileService.class)) {
			return (Specification<T>) mobileServiceByNameContains(name, negated);
		}
		if (clazz.equals(ServiceProvider.class)) {
			return (Specification<T>) serviceProviderByNameContains(name,
					negated);
		}
		return null;
	}

	static <T extends IEntity> Specification<T> getByNameSpecificationStartsWith(
			final Class<T> clazz, final String name, final boolean negated) {
		if (clazz.equals(Role.class)) {
			return (Specification<T>) roleByNameStartsWith(name, negated);
		}
		if (clazz.equals(Principal.class)) {
			return (Specification<T>) userByNameStartsWith(name, negated);
		}
		if (clazz.equals(Privilege.class)) {
			return (Specification<T>) privilegeByNameStartsWith(name, negated);
		}
		if (clazz.equals(Store.class)) {
			return (Specification<T>) storeByNameStartsWith(name, negated);
		}
		if (clazz.equals(Service.class)) {
			return (Specification<T>) serviceByNameStartsWith(name, negated);
		}
		if (clazz.equals(MobileService.class)) {
			return (Specification<T>) mobileServiceByNameStartsWith(name,
					negated);
		}
		if (clazz.equals(ServiceProvider.class)) {
			return (Specification<T>) serviceProviderByNameStartsWith(name,
					negated);
		}
		return null;
	}

	static <T extends IEntity> Specification<T> getByNameSpecificationEndsWith(
			final Class<T> clazz, final String name, final boolean negated) {
		if (clazz.equals(Role.class)) {
			return (Specification<T>) roleByNameEndsWith(name, negated);
		}
		if (clazz.equals(Principal.class)) {
			return (Specification<T>) userByNameEndsWith(name, negated);
		}
		if (clazz.equals(Privilege.class)) {
			return (Specification<T>) privilegeByNameEndsWith(name, negated);
		}
		if (clazz.equals(Store.class)) {
			return (Specification<T>) storeByNameEndsWith(name, negated);
		}
		if (clazz.equals(Service.class)) {
			return (Specification<T>) serviceByNameEndsWith(name, negated);
		}
		if (clazz.equals(MobileService.class)) {
			return (Specification<T>) mobileServiceByNameEndsWith(name, negated);
		}
		if (clazz.equals(ServiceProvider.class)) {
			return (Specification<T>) serviceProviderByNameEndsWith(name,
					negated);
		}
		return null;
	}

	// individual specifications

	// user

	private static Specification<Principal> userByIdEq(final Long id,
			final boolean negated) {
		return new Specification<Principal>() {
			@Override
			public final Predicate toPredicate(final Root<Principal> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(Principal_.id), id);
				}
				return builder.equal(root.get(Principal_.id), id);
			}
		};
	}

	private static Specification<Principal> userByNameEq(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Principal> entityByKeyEq(name, negated,
				Principal_.name);
	}

	private static Specification<Principal> userByNameContains(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Principal> entityByKeyContains(name,
				negated, Principal_.name);
	}

	private static Specification<Principal> userByNameStartsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Principal> entityByKeyStartsWith(name,
				negated, Principal_.name);
	}

	private static Specification<Principal> userByNameEndsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Principal> entityByKeyEndsWith(name,
				negated, Principal_.name);
	}

	// role

	private static Specification<Role> roleByIdEq(final Long id,
			final boolean negated) {
		return new Specification<Role>() {
			@Override
			public final Predicate toPredicate(final Root<Role> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(Role_.id), id);
				}
				return builder.equal(root.get(Role_.id), id);
			}
		};
	}

	private static Specification<Role> roleByNameEq(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Role> entityByKeyEq(name, negated,
				Role_.name);
	}

	private static Specification<Role> roleByNameContains(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Role> entityByKeyContains(name, negated,
				Role_.name);
	}

	private static Specification<Role> roleByNameEndsWith(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Role> entityByKeyEndsWith(name, negated,
				Role_.name);
	}

	private static Specification<Role> roleByNameStartsWith(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Role> entityByKeyStartsWith(name,
				negated, Role_.name);
	}

	// privilege

	private static Specification<Privilege> privilegeByIdEq(final Long id,
			final boolean negated) {
		return new Specification<Privilege>() {
			@Override
			public final Predicate toPredicate(final Root<Privilege> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(Privilege_.id), id);
				}
				return builder.equal(root.get(Privilege_.id), id);
			}
		};
	}

	private static Specification<Privilege> privilegeByNameEq(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyEq(name, negated,
				Privilege_.name);
	}

	private static Specification<Privilege> privilegeByNameContains(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyContains(name,
				negated, Privilege_.name);
	}

	private static Specification<Privilege> privilegeByNameStartsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyStartsWith(name,
				negated, Privilege_.name);
	}

	private static Specification<Privilege> privilegeByNameEndsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyEndsWith(name,
				negated, Privilege_.name);
	}

	private static Specification<Privilege> privilegeByDescriptionEq(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyEq(description,
				negated, Privilege_.description);
	}

	private static Specification<Privilege> privilegeByDescriptionContains(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyContains(
				description, negated, Privilege_.description);
	}

	private static Specification<Privilege> privilegeByDescriptionStartsWith(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyStartsWith(
				description, negated, Privilege_.description);
	}

	private static Specification<Privilege> privilegeByDescriptionEndsWith(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Privilege> entityByKeyEndsWith(
				description, negated, Privilege_.description);
	}

	private static Specification<Store> storeByIdEq(final Long id,
			final boolean negated) {
		return new Specification<Store>() {
			@Override
			public final Predicate toPredicate(final Root<Store> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(Store_.id), id);
				}
				return builder.equal(root.get(Store_.id), id);
			}
		};
	}

	private static Specification<Store> storeByNameEq(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Store> entityByKeyEq(name, negated,
				Store_.name);
	}

	private static Specification<Store> storeByNameContains(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Store> entityByKeyContains(name, negated,
				Store_.name);
	}

	private static Specification<Store> storeByNameStartsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Store> entityByKeyStartsWith(name,
				negated, Store_.name);
	}

	private static Specification<Store> storeByNameEndsWith(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Store> entityByKeyEndsWith(name, negated,
				Store_.name);
	}

	private static Specification<Service> serviceByIdEq(final Long id,
			final boolean negated) {
		return new Specification<Service>() {
			@Override
			public final Predicate toPredicate(final Root<Service> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(Service_.id), id);
				}
				return builder.equal(root.get(Service_.id), id);
			}
		};
	}

	private static Specification<Service> serviceByNameEq(final String name,
			final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyEq(name, negated,
				Service_.name);
	}

	private static Specification<Service> serviceByNameContains(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyContains(name,
				negated, Service_.name);
	}

	private static Specification<Service> serviceByNameStartsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyStartsWith(name,
				negated, Service_.name);
	}

	private static Specification<Service> serviceByNameEndsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyEndsWith(name,
				negated, Service_.name);
	}

	private static Specification<Service> serviceByDescriptionEq(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyEq(description,
				negated, Service_.description);
	}

	private static Specification<Service> serviceByDescriptionContains(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyContains(description,
				negated, Service_.description);
	}

	private static Specification<Service> serviceByDescriptionStartsWith(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyStartsWith(
				description, negated, Service_.description);
	}

	private static Specification<Service> serviceByDescriptionEndsWith(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<Service> entityByKeyEndsWith(description,
				negated, Service_.description);
	}

	private static Specification<MobileService> mobileServiceByIdEq(
			final Long id, final boolean negated) {
		return new Specification<MobileService>() {
			@Override
			public final Predicate toPredicate(final Root<MobileService> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(MobileService_.id), id);
				}
				return builder.equal(root.get(MobileService_.id), id);
			}
		};
	}

	private static Specification<MobileService> mobileServiceByNameEq(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyEq(name,
				negated, MobileService_.name);
	}

	private static Specification<MobileService> mobileServiceByNameContains(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyContains(name,
				negated, MobileService_.name);
	}

	private static Specification<MobileService> mobileServiceByNameStartsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyStartsWith(
				name, negated, MobileService_.name);
	}

	private static Specification<MobileService> mobileServiceByNameEndsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyEndsWith(name,
				negated, MobileService_.name);
	}

	private static Specification<MobileService> mobileServiceByDescriptionEq(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyEq(description,
				negated, MobileService_.description);
	}

	private static Specification<MobileService> mobileServiceByDescriptionContains(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyContains(
				description, negated, MobileService_.description);
	}

	private static Specification<MobileService> mobileServiceByDescriptionStartsWith(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyStartsWith(
				description, negated, MobileService_.description);
	}

	private static Specification<MobileService> mobileServiceByDescriptionEndsWith(
			final String description, final boolean negated) {
		return QuerySpecificationSec.<MobileService> entityByKeyEndsWith(
				description, negated, MobileService_.description);
	}

	private static Specification<ServiceProvider> serviceProviderByIdEq(
			final Long id, final boolean negated) {
		return new Specification<ServiceProvider>() {
			@Override
			public final Predicate toPredicate(
					final Root<ServiceProvider> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(root.get(ServiceProvider_.id), id);
				}
				return builder.equal(root.get(ServiceProvider_.id), id);
			}
		};
	}



	private static Specification<ServiceProvider> serviceProviderByNameEq(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<ServiceProvider> entityByKeyEq(name,
				negated, ServiceProvider_.name);
	}

	private static Specification<ServiceProvider> serviceProviderByNameContains(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<ServiceProvider> entityByKeyContains(
				name, negated, ServiceProvider_.name);
	}

	private static Specification<ServiceProvider> serviceProviderByNameStartsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<ServiceProvider> entityByKeyStartsWith(
				name, negated, ServiceProvider_.name);
	}

	private static Specification<ServiceProvider> serviceProviderByNameEndsWith(
			final String name, final boolean negated) {
		return QuerySpecificationSec.<ServiceProvider> entityByKeyEndsWith(
				name, negated, ServiceProvider_.name);
	}

	// generic

	private static <T extends IEntity> Specification<T> entityByKeyEndsWith(
			final String value, final boolean negated,
			final SingularAttribute<T, String> metaField) {
		return new Specification<T>() {
			@Override
			public final Predicate toPredicate(final Root<T> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notLike(builder.lower(root.get(metaField)),
							QueryConstants.ANY_SERVER + value.toLowerCase());
				}
				return builder.like(builder.lower(root.get(metaField)),
						QueryConstants.ANY_SERVER + value.toLowerCase());
			}
		};
	}

	private static <T extends IEntity> Specification<T> entityByKeyStartsWith(
			final String value, final boolean negated,
			final SingularAttribute<T, String> metaField) {
		return new Specification<T>() {
			@Override
			public final Predicate toPredicate(final Root<T> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notLike(builder.lower(root.get(metaField)),
							value.toLowerCase() + QueryConstants.ANY_SERVER);
				}
				return builder.like(builder.lower(root.get(metaField)),
						value.toLowerCase() + QueryConstants.ANY_SERVER);
			}
		};
	}

	private static <T extends IEntity> Specification<T> entityByKeyContains(
			final String value, final boolean negated,
			final SingularAttribute<T, String> metaField) {
		return new Specification<T>() {
			@Override
			public final Predicate toPredicate(final Root<T> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notLike(builder.lower(root.get(metaField)),
							QueryConstants.ANY_SERVER + value.toLowerCase()
							+ QueryConstants.ANY_SERVER);
				}
				return builder.like(builder.lower(root.get(metaField)),
						QueryConstants.ANY_SERVER + value.toLowerCase()
						+ QueryConstants.ANY_SERVER);
			}
		};
	}

	private static <T extends IEntity> Specification<T> entityByKeyEq(
			final String value, final boolean negated,
			final SingularAttribute<T, String> metaField) {
		return new Specification<T>() {
			@Override
			public final Predicate toPredicate(final Root<T> root,
					final CriteriaQuery<?> query, final CriteriaBuilder builder) {
				if (negated) {
					return builder.notEqual(builder.lower(root.get(metaField)),
							value.toLowerCase());
				}
				return builder.equal(builder.lower(root.get(metaField)),
						value.toLowerCase());
			}
		};
	}

}
