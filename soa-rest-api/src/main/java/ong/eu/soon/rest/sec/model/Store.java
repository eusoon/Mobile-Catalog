package ong.eu.soon.rest.sec.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

import my.com.infopro.rest.common.persistence.model.INameableEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 *
 * <p>Title: Store</p>
 *
 * <p>Description: Domain Object describing a Store entity</p>
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity (name="Store")
@XmlRootElement
public class Store implements INameableEntity {


	@SequenceGenerator(name = "STORESEQ", sequenceName = "storeSEQ", allocationSize = 1)
	@Id @Column(name="STORE_ID" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="STORESEQ")
	private Long id;


	private String name;


	private String address;

	private BigDecimal latitude;


	private BigDecimal logititude;


	private String city;


	private String country;


	private String phone;


	private String state;

	@ManyToMany( /* cascade = { CascadeType.REMOVE }, */fetch = FetchType.EAGER)
	@JoinTable(name = "STORE_SERVICES", joinColumns = { @JoinColumn(name = "STORE_ID", referencedColumnName = "STORE_ID") }, inverseJoinColumns = { @JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID") })
	@XStreamImplicit
	private Set<Service> services = new HashSet<Service>();

	//MP-MANAGED-UPDATABLE-ENDING
	/**
	 * Default constructor
	 */
	public Store() {
	}

	/**
	 * All field constructor
	 */
	public Store(
			final Long id1, final String address1, final String city1,
			final String country1, final java.math.BigDecimal latitude1,
			final java.math.BigDecimal logititude1, final String name1,
			final String phone1, final String state1) {
		//primary keys
		setId(id1);
		//attributes
		setAddress(address1);
		setCity(city1);
		setCountry(country1);
		setLatitude(latitude1);
		setLogititude(logititude1);
		setName(name1);
		setPhone(phone1);
		setState(state1);
		//parents
	}

	public Store(final String address1, final String city1,
			final String country1, final java.math.BigDecimal latitude1,
			final java.math.BigDecimal logititude1, final String name1,
			final String phone1, final String state1,
			final HashSet<Service> newHashSet) {

		// attributes
		setAddress(address1);
		setCity(city1);
		setCountry(country1);
		setLatitude(latitude1);
		setLogititude(logititude1);
		setName(name1);
		setPhone(phone1);
		setState(state1);
		// parents
		services = newHashSet;
	}
	public Store(final String name1, final String address1,
			final BigDecimal latitude1, final BigDecimal logititude1,
			final HashSet<Service> newHashSet) {
		name = name1;
		address = address1;
		latitude = latitude1;
		logititude = logititude1;
		services = newHashSet;
	}


	public Store flat() {
		return new Store(
				getId(),
				getAddress(),
				getCity(),
				getCountry(),
				getLatitude(),
				getLogititude(),
				getName(),
				getPhone(),
				getState()
				);
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(final Long idToSet) {
		id = idToSet;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(final String addressToSet) {
		address = addressToSet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String cityToSet) {
		city = cityToSet;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String countryToSet) {
		country = countryToSet;
	}

	public java.math.BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(final java.math.BigDecimal latitudeToSet) {
		latitude = latitudeToSet;
	}

	public java.math.BigDecimal getLogititude() {
		return logititude;
	}

	public void setLogititude(final java.math.BigDecimal logititudeToSet) {
		logititude = logititudeToSet;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(final String nameToSet) {
		name = nameToSet;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phoneToSet) {
		phone = phoneToSet;
	}

	public String getState() {
		return state;
	}

	public void setState(final String stateToSet) {
		state = stateToSet;
	}

	public Set<Service> getServices() {
		if (services == null) {
			services = new HashSet<Service>();
		}
		return services;
	}

	public void setServices(final Set<Service> servicesToSet) {
		services = servicesToSet;
	}

	public void addService(final Service service) {
		getServices().add(service);
	}

	//

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Store other = (Store) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getName();
	}

}
