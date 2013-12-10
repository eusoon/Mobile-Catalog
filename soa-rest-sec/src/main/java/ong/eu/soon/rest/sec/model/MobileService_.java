package ong.eu.soon.rest.sec.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import ong.eu.soon.rest.sec.model.MobileService;


@StaticMetamodel(MobileService.class)
public class MobileService_ {

	public static volatile SingularAttribute<MobileService, Long> id;

	public static volatile SingularAttribute<MobileService, String> name;

	public static volatile SingularAttribute<MobileService, String> description;


}
