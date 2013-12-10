package ong.eu.soon.mobile.client.services;

import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.utils.RestRequest;
import ong.eu.soon.mobile.json.ifx.service.SvcInqRs;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class SvcServiceImpl implements SvcService {

	@Override
	public void getServices(Parameters params, AsyncCallback<SvcInqRs> callback1) {
		RestRequest<SvcInqRs> request = new RestRequest<SvcInqRs>(RequestBuilder.POST, "services/svcInq/",params);
	       request.sendAuthenticated(callback1);
	}
}
