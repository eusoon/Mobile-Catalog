package ong.eu.soon.rest.sec.client.template;

import java.util.List;

import my.com.infopro.rest.common.client.template.AbstractTestRestTemplate;

import ong.eu.soon.rest.sec.model.Store;
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
public final class StoreTestRestTemplate extends
AbstractTestRestTemplate<Store> {

	@Autowired
	protected SecBusinessPaths paths;

	public StoreTestRestTemplate() {
		super(Store.class);
	}

	// API

	public final Store findByName(final String name) {
		final String resourcesAsRepresentation = findOneByUriAsString(getUri() + "?q=name=" + name);
		final List<Store> resources = marshaller.decodeList(
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
		return paths.getStoreUri();
	}

	@Override
	public final Pair<String, String> getDefaultCredentials() {
		return new ImmutablePair<String, String>(SecurityConstants.ADMIN_EMAIL, SecurityConstants.ADMIN_PASS);
	}


}
