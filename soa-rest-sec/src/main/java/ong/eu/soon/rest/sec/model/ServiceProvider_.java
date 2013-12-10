package ong.eu.soon.rest.sec.model;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import ong.eu.soon.rest.sec.model.MobileService;
import ong.eu.soon.rest.sec.model.ServiceProvider;


@StaticMetamodel(ServiceProvider.class)
public class ServiceProvider_ {

	public static volatile SingularAttribute<ServiceProvider, Long> id;

	public static volatile SingularAttribute<ServiceProvider, String> name;
	public static volatile SingularAttribute<ServiceProvider, String> baseUrl;
	public static volatile SingularAttribute<ServiceProvider, String> userName;
	public static volatile SingularAttribute<ServiceProvider, String> password;
	public static volatile SingularAttribute<ServiceProvider, String> type;
	public static volatile SetAttribute<ServiceProvider, MobileService> mobiles;

}
