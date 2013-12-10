package ong.euoon.rest.sec.client;

import my.com.infopro.rest.common.client.template.CommonPaths;
import my.com.infopro.rest.common.web.IUriMapper;

import ong.eu.soon.rest.sec.model.MobileService;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.model.ServiceProvider;
import ong.eu.soon.rest.sec.model.Store;
import ong.eu.soon.rest.sec.model.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("client")
public final class SecBusinessPaths {

	@Value("${http.sec.path}")
	private String secPath;

	@Autowired
	private CommonPaths commonPaths;

	@Autowired
	private IUriMapper uriMapper;

	// API

	public final String getContext() {
		return commonPaths.getServerRoot() + secPath;
	}

	public final String getRootUri() {
		return getContext() + "/api/";
	}

	public final String getUserUri() {
		return getRootUri() + uriMapper.getUriBase(User.class);
	}

	public final String getRoleUri() {
		return getRootUri() + uriMapper.getUriBase(Role.class);
	}

	public final String getPrivilegeUri() {
		return getRootUri() + uriMapper.getUriBase(Privilege.class);
	}

	public final String getAuthenticationUri() {
		return getRootUri() + "authentication";
	}

	public final String getLoginUri() {
		return getContext() + "/j_spring_security_check";
	}

	public String getStoreUri() {
		return getRootUri() + uriMapper.getUriBase(Store.class);
	}

	public String getServiceUri() {
		return getRootUri() + uriMapper.getUriBase(Service.class);
	}

	public String getServiceProviderUri() {
		return getRootUri() + uriMapper.getUriBase(ServiceProvider.class);
	}

	public String getMobileServiceUri() {
		return getRootUri() + uriMapper.getUriBase(MobileService.class);
	}
}
