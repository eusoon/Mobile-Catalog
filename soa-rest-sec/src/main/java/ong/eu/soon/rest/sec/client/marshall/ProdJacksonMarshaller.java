package ong.eu.soon.rest.sec.client.marshall;

import java.io.IOException;
import java.util.List;


import ong.eu.soon.rest.common.client.marshall.IMarshaller;
import ong.eu.soon.rest.sec.model.Principal;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.dto.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;

@Component
@Profile("production")
public final class ProdJacksonMarshaller implements IMarshaller {
	private final Logger logger = LoggerFactory.getLogger(ProdJacksonMarshaller.class);

	private final ObjectMapper objectMapper;

	public ProdJacksonMarshaller() {
		super();

		objectMapper = new ObjectMapper();
	}

	// API

	@Override
	public final <T> String encode(final T entity) {
		Preconditions.checkNotNull(entity);
		String entityAsJSON = null;
		try {
			entityAsJSON = objectMapper.writeValueAsString(entity);
		} catch (final JsonParseException parseEx) {
			logger.error("", parseEx);
		} catch (final JsonMappingException mappingEx) {
			logger.error("", mappingEx);
		} catch (final IOException ioEx) {
			logger.error("", ioEx);
		}

		return entityAsJSON;
	}

	@Override
	public final <T> T decode(final String entityAsString, final Class<T> clazz) {
		Preconditions.checkNotNull(entityAsString);

		T entity = null;
		try {
			entity = objectMapper.readValue(entityAsString, clazz);
		} catch (final JsonParseException parseEx) {
			logger.error("", parseEx);
		} catch (final JsonMappingException mappingEx) {
			logger.error("", mappingEx);
		} catch (final IOException ioEx) {
			logger.error("", ioEx);
		}

		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public final <T> List<T> decodeList(final String entitiesAsString, final Class<T> clazz) {
		Preconditions.checkNotNull(entitiesAsString);

		List<T> entities = null;
		try {
			if (clazz.equals(Role.class)) {
				entities = objectMapper.readValue(entitiesAsString, new TypeReference<List<Role>>() {
					// ...
				});
			} else if (clazz.equals(Privilege.class)) {
				entities = objectMapper.readValue(entitiesAsString, new TypeReference<List<Privilege>>() {
					// ...
				});
			} else if (clazz.equals(User.class)) {
				entities = objectMapper.readValue(entitiesAsString, new TypeReference<List<User>>() {
					// ...
				});
			} else if (clazz.equals(Principal.class)) {
				entities = objectMapper.readValue(entitiesAsString, new TypeReference<List<Principal>>() {
					// ...
				});
			} else {
				entities = objectMapper.readValue(entitiesAsString, List.class);
			}
		} catch (final JsonParseException parseEx) {
			logger.error("", parseEx);
		} catch (final JsonMappingException mappingEx) {
			logger.error("", mappingEx);
		} catch (final IOException ioEx) {
			logger.error("", ioEx);
		}

		return entities;
	}

	@Override
	public final String getMime() {
		return MediaType.APPLICATION_JSON.toString();
	}

}
