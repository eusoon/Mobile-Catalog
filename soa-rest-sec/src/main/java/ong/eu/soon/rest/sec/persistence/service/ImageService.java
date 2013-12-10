package ong.eu.soon.rest.sec.persistence.service;

import ong.eu.soon.rest.sec.model.SystemImage;
import ong.eu.soon.webservices.model.ImageVO;

public interface ImageService {

	// List<SystemImage> listByNature(Nature system);

	ImageVO getImageVO(SystemImage systemImage);
}
