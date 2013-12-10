package ong.eu.soon.rest.sec.model;

import java.sql.Blob;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;


@Entity
@XmlRootElement
public class Image implements INameableEntity {

	@SequenceGenerator(name = "IMAGESEQ", sequenceName = "imageSEQ", allocationSize = 1)
	@Id
	@Column(name = "IMAGE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMAGESEQ")
	private Long id;
	private String contentType;
	private Blob image;
	private Integer imageSize;
	private Calendar lastModified;
	private String name;
	private Blob thumbnail;
	private Integer thumbnailSize;

	protected Image() {
	}

	public String getContentType() {
		return contentType;
	}

	public Blob getImage() {
		return image;
	}

	public Integer getImageSize() {
		return imageSize;
	}

	public Calendar getLastModified() {
		return lastModified;
	}

	@Override
	public String getName() {
		return name;
	}

	/**
	 * Returns the name without extension
	 */
	public String getSimpleName() {
		final int pos = name == null ? -1 : name.lastIndexOf('.');
		if (pos < 0) {
			return name;
		}
		return name.substring(0, pos);
	}

	public Blob getThumbnail() {
		return thumbnail;
	}

	public Integer getThumbnailSize() {
		return thumbnailSize;
	}

	public void setContentType(final String contentType1) {
		contentType = contentType1;
	}

	public void setImage(final Blob image1) {
		image = image1;
	}

	public void setImageSize(final Integer imageSize1) {
		imageSize = imageSize1;
	}

	public void setLastModified(final Calendar lastModified1) {
		lastModified = lastModified1;
	}

	public void setName(final String name1) {
		name = name1;
	}

	public void setThumbnail(final Blob thumbnail1) {
		thumbnail = thumbnail1;
	}

	public void setThumbnailSize(final Integer thumbnailSize1) {
		thumbnailSize = thumbnailSize1;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id1) {
		id = id1;

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
		final Image other = (Image) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getId() + " - " + name;
	}
}
