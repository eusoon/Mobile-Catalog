package ong.eu.soon.rest.sec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@Entity
@XmlRootElement
@XStreamAlias("privilege")
public class Privilege implements INameableEntity {

	@SequenceGenerator(name = "PRIVILEGESEQ", sequenceName = "privilegeSEQ", allocationSize = 1)
	@Id
	@Column(name = "PRIV_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRIVILEGESEQ")
	private Long id;

	private String name;

	private String description;

	public Privilege() {
		super();
	}

	public Privilege(final String nameToSet) {
		super();
		name = nameToSet;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(final String descriptionToSet) {
		description = descriptionToSet;
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
		final Privilege other = (Privilege) obj;
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
