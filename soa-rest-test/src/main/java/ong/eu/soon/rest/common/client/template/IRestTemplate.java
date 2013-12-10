package ong.eu.soon.rest.common.client.template;

import java.util.List;


import ong.eu.soon.rest.common.IOperations;
import ong.eu.soon.rest.common.client.marshall.IMarshaller;
import ong.eu.soon.rest.common.client.template.ITemplateWithUri;
import ong.eu.soon.rest.common.persistence.model.IEntity;
import ong.eu.soon.rest.common.search.ClientOperation;

import org.apache.commons.lang3.tuple.Triple;

import com.jayway.restassured.specification.RequestSpecification;

public interface IRestTemplate<T extends IEntity> extends IOperations<T>, ITemplateAsResponse<T>, ITemplateWithUri<T> {

	// template

	RequestSpecification givenAuthenticated();

	IMarshaller getMarshaller();

	String getUri();

	// search

	List<T> searchPaginated(final Triple<String, ClientOperation, String> idOp, final Triple<String, ClientOperation, String> nameOp, final int page, final int size);

}
