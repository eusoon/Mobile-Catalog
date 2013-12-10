package ong.eu.soon.rest.sec.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.Store;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Store.class)
public class Store_ {

	public static volatile SingularAttribute<Store, Long> id;
	public static volatile SingularAttribute<Store, String> address;
	public static volatile SingularAttribute<Store, String> city;
	public static volatile SingularAttribute<Store, String> country;
	public static volatile SingularAttribute<Store, java.math.BigDecimal> latitude;
	public static volatile SingularAttribute<Store, java.math.BigDecimal> logititude;
	public static volatile SingularAttribute<Store, String> name;
	public static volatile SingularAttribute<Store, String> phone;
	public static volatile SingularAttribute<Store, String> state;

	public static volatile SetAttribute<Store, Service> services;

}
