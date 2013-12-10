package ong.euoon.rest.sec.client.template;

import my.com.infopro.rest.common.client.template.AbstractNamedClientRestTemplate;

import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.util.SecurityConstants;
import ong.euoon.rest.sec.client.SecBusinessPaths;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("client")
public class ServiceClientRestTemplate extends
		AbstractNamedClientRestTemplate<Service> {

	@Autowired
	private SecBusinessPaths paths;

	public ServiceClientRestTemplate() {
		super(Service.class);
	}

	// API

	// template methods

	@Override
	public final String getUri() {
		return paths.getServiceUri();
	}

	@Override
	public final Pair<String, String> getDefaultCredentials() {
		return new ImmutablePair<String, String>(SecurityConstants.ADMIN_EMAIL, SecurityConstants.ADMIN_PASS);
	}

	@Override
	protected void beforeReadOperation() {
		super.beforeReadOperation();
	}

}
