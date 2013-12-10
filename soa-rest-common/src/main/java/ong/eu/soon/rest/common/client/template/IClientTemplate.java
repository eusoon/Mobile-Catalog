package ong.eu.soon.rest.common.client.template;

import ong.eu.soon.rest.common.persistence.model.INameableEntity;
import ong.eu.soon.rest.common.persistence.service.INameSupport;

public interface IClientTemplate<T extends INameableEntity> extends
		IRawClientTemplate<T>, INameSupport<T> {

	//

}
