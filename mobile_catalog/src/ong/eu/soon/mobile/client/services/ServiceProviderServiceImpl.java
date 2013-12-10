package ong.eu.soon.mobile.client.services;


import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.ServiceProvider;
import ong.eu.soon.mobile.client.model.ServiceProviderData;
import ong.eu.soon.mobile.client.model.ServiceProviderStatus;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.RestRequest;
import ong.eu.soon.mobile.client.utils.ResultPage;
import ong.eu.soon.mobile.json.ifx.service.SvcInqRs;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
/**
 * Implementation for {@link ServiceProviderService}.
 */
public class ServiceProviderServiceImpl implements ServiceProviderService {

	@Override
	public void searchServiceProviders(Parameters parameters,
			AsyncCallback<ResultPage<ServiceProvider>> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getServiceProvidersData(
			AsyncCallback<JsArray<ServiceProviderData>> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getServiceProviderStatus(Long serviceProviderId,
			AsyncCallback<ServiceProviderStatus> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getServiceProviders(
			BaseAsyncCallback<JsArray<ServiceProvider>> baseAsyncCallback) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * Allows the client to retrieve a current view of the services supported by the SP, the Authentication Realms 
	 * that must be used for authentication, and basic information about the SP.
	 */
	
	public void svcProfInquiry(Parameters params, AsyncCallback<SvcInqRs> callback){
		 RestRequest<SvcInqRs> request = new RestRequest<SvcInqRs>(RequestBuilder.POST, "ifx/SvcProfInq", params);                           
	        request.sendAuthenticated(callback); 
	}
}
