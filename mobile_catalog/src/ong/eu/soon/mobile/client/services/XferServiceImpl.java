/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package ong.eu.soon.mobile.client.services;

import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.PaymentConfirm;
import ong.eu.soon.mobile.client.model.PaymentData;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.RestRequest;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Implementation for {@link XferService}.
 */
public class XferServiceImpl implements XferService {
    @Override
    public void getPaymentData(Parameters params, AsyncCallback<PaymentData> callback) {
        RestRequest<PaymentData> request = new RestRequest<PaymentData>(RequestBuilder.GET, "transfers/paymentData", params);
        request.sendAuthenticated(callback);
    }

	@Override
	public void doTransfer(boolean isSystem, Parameters params,
			BaseAsyncCallback<PaymentConfirm> callback) {
		 RestRequest<PaymentConfirm> request = new RestRequest<PaymentConfirm>(RequestBuilder.POST, "transfers/" + (isSystem ? "confirmSystemPayment" : "confirmMemberPayment"), params);
	     request.sendAuthenticated(callback);
	} 
}
