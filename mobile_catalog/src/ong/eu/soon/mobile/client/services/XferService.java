package ong.eu.soon.mobile.client.services;

import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.PaymentConfirm;
import ong.eu.soon.mobile.client.model.PaymentData;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface XferService {

	void getPaymentData(Parameters params,
			AsyncCallback<PaymentData> callback);

	void doTransfer(boolean isSystem, Parameters confirmParams,
			BaseAsyncCallback<PaymentConfirm> callback);

}
