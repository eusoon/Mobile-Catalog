package ong.eu.soon.rest.sec.client.marshall;

import java.util.List;


import ong.eu.soon.rest.common.client.marshall.IMarshaller;
import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.dto.User;

import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.google.common.base.Preconditions;
import com.thoughtworks.xstream.XStream;

@Component
@Profile("mime_xml")
public final class XStreamMarshaller implements IMarshaller {

	private XStream xstream;

	public XStreamMarshaller() {
		super();

		xstream = new XStream();
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(User.class);
		xstream.processAnnotations(Principal.class);
		xstream.processAnnotations(Role.class);
		xstream.processAnnotations(Privilege.class);
		xstream.processAnnotations(Store.class);
		xstream.processAnnotations(Service.class);
	}

	// API

	@Override
	public final <T> String encode(final T entity) {
		Preconditions.checkNotNull(entity);
		return xstream.toXML(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public final <T> T decode(final String entityAsXML, final Class<T> clazz) {
		Preconditions.checkNotNull(entityAsXML);
		return (T) xstream.fromXML(entityAsXML);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> decodeList(final String entityAsXML, final Class<T> clazz) {
		return this.decode(entityAsXML, List.class);
	}

	@Override
	public final String getMime() {
		return MediaType.APPLICATION_XML.toString();
	}

}
