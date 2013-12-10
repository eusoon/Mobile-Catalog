package ong.eu.soon.rest.sec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;


/**
 * 
 * <p>
 * Title: MobileService
 * </p>
 * 
 * <p>
 * Description: Domain Object describing a MobileService entity
 * </p>
 * 
 */
@Entity(name = "MobileService")
@Table(name = "MOBILE_SERVICE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ong.eu.soon.rest.sec.model", name = "MobileService")
@XmlRootElement(namespace = "ong.eu.soon.rest.sec.model")
public class MobileService implements INameableEntity {

	@SequenceGenerator(name = "MOBILESERVICESEQ", sequenceName = "mobileServiceSEQ", allocationSize = 1)
	@Id
	@Column(name = "MOBILE_SERVICE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOBILESERVICESEQ")
	@XmlElement
	private Long id;

	@Column(name = "NAME", length = 50, nullable = false, unique = false)
	@XmlElement
	private String name;

	@Column(name = "DESCRIPTION", length = 255, nullable = true, unique = false)
	@XmlElement
	private String description;

	/**
	 * Default constructor
	 */
	public MobileService() {
	}

	/**
	 * All field constructor
	 */
	public MobileService(final Long id1, final String name1,
			final String description1) {
		// primary keys
		setId(id1);
		// attributes
		setName(name1);

		setDescription(description1);
		// parents
	}

	public MobileService flat() {
		return new MobileService(getId(), getName(), getDescription());
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(final Long id1) {
		id = id1;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(final String name1) {
		name = name1;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description1) {
		description = description1;
	}

}
