package ong.eu.soon.rest.sec.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;


/**
 * 
 * <p>
 * Title: ServiceProvider
 * </p>
 * 
 * <p>
 * Description: Domain Object describing a ServiceProvider entity
 * </p>
 * 
 */
@Entity(name = "ServiceProvider")
@Table(name = "SERVICE_PROVIDER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ong.eu.soon.rest.sec.model", name = "ServiceProvider")
@XmlRootElement(namespace = "ong.eu.soon.rest.sec.model")
public class ServiceProvider implements INameableEntity {

	@SequenceGenerator(name = "SERVICEPROVIDERSEQ", sequenceName = "serviceProviderSEQ", allocationSize = 1)
	@Id
	@Column(name = "SERVICE_PROVIDER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERVICEPROVIDERSEQ")
	@XmlElement
	private Long id;

	@Column(name = "NAME", length = 50, nullable = false, unique = false)
	@XmlElement
	private String name;

	@Column(name = "BASE_URL", length = 250, nullable = false, unique = false)
	@XmlElement
	private String baseUrl;

	@Column(name = "USER_NAME", length = 50, nullable = false, unique = false)
	@XmlElement
	private String userName;

	@Column(name = "PASSWORD", length = 100, nullable = false, unique = false)
	@XmlElement
	private String password;

	@Column(name = "TYPE", length = 20, nullable = false, unique = false)
	@XmlElement
	private String type;

	@XmlTransient
	@ManyToMany
	@JoinTable(name = "PROVIDER_SERVICES", joinColumns = @JoinColumn(name = "SERVICE_PROVIDER_ID"), inverseJoinColumns = @JoinColumn(name = "MOBILE_SERVICE_ID"))
	private Set<MobileService> mobileServices = new HashSet<MobileService>();

	/**
	 * Default constructor
	 */
	public ServiceProvider() {
	}

	/**
	 * All field constructor
	 */
	public ServiceProvider(final Long id1, final String name1,
			final String baseUrl1, final String userName1,
			final String password1) {
		// primary keys
		setId(id1);
		// attributes
		setName(name1);
		setBaseUrl(baseUrl1);
		setUserName(userName1);
		setPassword(password1);
		// parents
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(final Long id1) {
		id = id1;

	}

	public ServiceProvider flat() {
		return new ServiceProvider(getId(), getName(), getBaseUrl(),
				getUserName(), getPassword());
	}


	@Override
	public String getName() {
		return name;
	}

	public void setName(final String name1) {
		name = name1;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(final String baseUrl1) {
		baseUrl = baseUrl1;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(final String userName1) {
		userName = userName1;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password1) {
		password = password1;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type1) {
		type = type1;
	}

	public Set<MobileService> getMobileServices() {
		if (mobileServices == null) {
			mobileServices = new HashSet<MobileService>();
		}
		return mobileServices;
	}

	public void setMobileServices(final Set<MobileService> mobileServices1) {
		mobileServices = mobileServices1;
	}

	public void addMobileService(final MobileService mobileService) {
		getMobileServices().add(mobileService);
	}



}
