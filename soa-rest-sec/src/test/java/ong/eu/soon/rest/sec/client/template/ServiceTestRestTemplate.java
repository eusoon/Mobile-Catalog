package ong.eu.soon.rest.sec.client.template;

import java.util.List;

import my.com.infopro.rest.common.client.template.AbstractTestRestTemplate;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.util.SecurityConstants;
import ong.euoon.rest.sec.client.SecBusinessPaths;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.google.common.base.Preconditions;

@Component
@Profile("client")
public final class ServiceTestRestTemplate extends
AbstractTestRestTemplate<Service> {

	@Autowired
	protected SecBusinessPaths paths;

	public ServiceTestRestTemplate() {
		super(Service.class);
	}

	// API

	public final Service findByName(final String name) {
		final String resourcesAsRepresentation = findOneByUriAsString(getUri() + "?q=name=" + name);
		final List<Service> resources = marshaller.decodeList(
				resourcesAsRepresentation, clazz);
		if (resources.isEmpty()) {
			return null;
		}
		Preconditions.checkState(resources.size() == 1);
		return resources.get(0);
	}

	// template method

	@Override
	public final String getUri() {
		return paths.getServiceUri();
	}

	@Override
	public final Pair<String, String> getDefaultCredentials() {
		return new ImmutablePair<String, String>(SecurityConstants.ADMIN_EMAIL, SecurityConstants.ADMIN_PASS);
	}

}
