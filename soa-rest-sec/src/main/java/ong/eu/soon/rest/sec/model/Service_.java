package ong.eu.soon.rest.sec.model;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import ong.eu.soon.rest.sec.model.Service;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Service.class)
public abstract class Service_ {

	public static volatile SingularAttribute<Service, Long> id;
	public static volatile SingularAttribute<Service, String> name;
	public static volatile SingularAttribute<Service, String> description;

}
