package ong.eu.soon.mobile.client.services;

import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.json.ifx.service.SvcInqRs;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SvcService {

	public void getServices(Parameters params, AsyncCallback<SvcInqRs> callback1) ;

}
