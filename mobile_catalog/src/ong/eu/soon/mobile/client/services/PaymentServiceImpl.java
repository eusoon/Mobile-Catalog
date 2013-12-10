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
import ong.eu.soon.mobile.client.model.PaymentPreview;
import ong.eu.soon.mobile.client.model.TransferData;
import ong.eu.soon.mobile.client.utils.RestRequest;
import ong.eu.soon.mobile.json.ifx.bill.BillInqRs;
import ong.eu.soon.mobile.json.ifx.payment.PmtAddRs;
import ong.eu.soon.mobile.json.ifx.payment.PmtInqRs;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Implementation for {@link PaymentService}.
 */
public class PaymentServiceImpl implements PaymentService {
    
    @Override
    public void getTransferData(Long transferId, AsyncCallback<TransferData> callback) {
       RestRequest<TransferData> request = new RestRequest<TransferData>(RequestBuilder.GET, "accounts/transferData/"+transferId);
       request.sendAuthenticated(callback);
    }

    @Override
    public void getPaymentData(Parameters params, AsyncCallback<PaymentData> callback) {
        RestRequest<PaymentData> request = new RestRequest<PaymentData>(RequestBuilder.GET, "payments/paymentData", params);
        request.sendAuthenticated(callback);
    }

    @Override
    public void getPaymentPreview(boolean isSystem, Parameters params, AsyncCallback<PaymentPreview> callback) {
       RestRequest<PaymentPreview> request = new RestRequest<PaymentPreview>(RequestBuilder.POST, "payments/" + (isSystem ? "systemPayment" : "memberPayment"), params);
       request.sendAuthenticated(callback);
    }

    @Override
    public void doPayment(boolean isSystem, Parameters params, AsyncCallback<PaymentConfirm> callback) {
        RestRequest<PaymentConfirm> request = new RestRequest<PaymentConfirm>(RequestBuilder.POST, "payments/" + (isSystem ? "confirmSystemPayment" : "confirmMemberPayment"), params);
        request.sendAuthenticated(callback);
    }   
    @Override
    public void doPaymentInq(Parameters params, AsyncCallback<PmtInqRs> callback) {
        RestRequest<PmtInqRs> request = new RestRequest<PmtInqRs>(RequestBuilder.POST, "payments/pmtInq", params);
        request.sendAuthenticated(callback);
    }
    @Override
    public void doPaymentAdd(boolean isSystem, Parameters params, AsyncCallback<PmtAddRs> callback) {
        RestRequest<PmtAddRs> request = new RestRequest<PmtAddRs>(RequestBuilder.POST, "payments/pmtAdd/" + (isSystem ? "confirmSystemPayment" : "confirmMemberPayment"), params);
        request.sendAuthenticated(callback);
    } 
    @Override
    public void doPaymentPreview(boolean isSystem, Parameters params, AsyncCallback<BillInqRs> callback) {
       RestRequest<BillInqRs> request = new RestRequest<BillInqRs>(RequestBuilder.POST, "payments/BillInq" + (isSystem ? "systemPayment" : "memberPayment"), params);
       request.sendAuthenticated(callback);
    }
}
