package ong.eu.soon.rest.sec.model;

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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


import ong.eu.soon.rest.common.persistence.model.INameableEntity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Entity
@XmlRootElement
@Table(name = "IB20USER")
public class Principal implements INameableEntity {

	@SequenceGenerator(name = "PRINCIPALSEQ", sequenceName = "principalSEQ", allocationSize = 1)
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRINCIPALSEQ")
	private Long id;

	private String name;
	@Column(name = "PSWD")
	private String password;
	@Column(name = "LOGINSTATUS")
	private String locked;
	@Column(name = "PRVLG")
	private String privilege;
	@Column(name = "AUTHLVL")
	private int authorityLevel;

	// @formatter:off
	@ManyToMany( /* cascade = { CascadeType.REMOVE }, */fetch = FetchType.EAGER)
	@JoinTable(name = "PRINCIPAL_ROLES", joinColumns = { @JoinColumn(name = "PRINCIPAL_ID", referencedColumnName = "PRINCIPAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID") })
	@XStreamImplicit
	private Set<Role> roles;

	// @formatter:on

	public Principal() {
		super();

		locked = "N";
	}

	public Principal(final String nameToSet, final String passwordToSet,
			final String lockedToSet,
			final Set<Role> rolesToSet) {
		super();

		name = nameToSet;
		password = passwordToSet;
		locked = lockedToSet;
		roles = rolesToSet;
	}

	// API

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(final Long idToSet) {
		id = idToSet;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(final String nameToSet) {
		name = nameToSet;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String passwordToSet) {
		password = passwordToSet;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(final Set<Role> rolesToSet) {
		roles = rolesToSet;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(final String lockedToSet) {
		locked = lockedToSet;
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
		final Principal other = (Principal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name)
				.toString();
	}

}
