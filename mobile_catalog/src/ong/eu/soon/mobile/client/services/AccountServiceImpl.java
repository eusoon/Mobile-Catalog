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

import ong.eu.soon.mobile.client.model.AccountData;
import ong.eu.soon.mobile.client.model.AccountStatus;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.Transfer;
import ong.eu.soon.mobile.client.utils.RestRequest;
import ong.eu.soon.mobile.client.utils.ResultPage;
import ong.eu.soon.mobile.json.ifx.acct.AcctInqRs;
import ong.eu.soon.mobile.json.ifx.acct.AcctTrnInqRs;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Implementation for {@link AccountService}.
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public void searchAccountHistory(Long accountId, Parameters parameters, AsyncCallback<ResultPage<Transfer>> callback) {
        RestRequest<ResultPage<Transfer>> request = new RestRequest<ResultPage<Transfer>>(RequestBuilder.GET, "accounts/"+accountId+"/history", parameters);                              
        request.sendAuthenticated(callback);
    }

    @Override
    public void getAccountsData(AsyncCallback<JsArray<AccountData>> callback) {
        RestRequest<JsArray<AccountData>> request = new RestRequest<JsArray<AccountData>>(RequestBuilder.GET, "accounts/info");        
        request.sendAuthenticated(callback);
    }

    @Override
    public void getAccountStatus(Long accountId, AsyncCallback<AccountStatus> callback) {
        RestRequest<AccountStatus> request = new RestRequest<AccountStatus>(RequestBuilder.GET, "accounts/"+accountId+"/status");        
        request.sendAuthenticated(callback);
    }
    @Override
    public void getAccountById(Long accountId, Parameters parameters, AsyncCallback<AcctInqRs> callback) {
        RestRequest<AcctInqRs> request = new RestRequest<AcctInqRs>(RequestBuilder.POST, "accounts/acctInq/"+accountId);        
        request.sendAuthenticated(callback);
    }
    @Override
	public void getAccounts(Parameters params,
			AsyncCallback<AcctInqRs> callback) {
		 RestRequest<AcctInqRs> request = new RestRequest<AcctInqRs>(RequestBuilder.POST, "accounts/acctInq");        
	        request.sendAuthenticated(callback);
		
	}
    @Override
	public void getAccountsData(Parameters params,
			AsyncCallback<AcctInqRs> callback) {
		 RestRequest<AcctInqRs> request = new RestRequest<AcctInqRs>(RequestBuilder.POST, "accounts/acctInq/info");        
	        request.sendAuthenticated(callback);
		
	}
    
    @Override
    public void getDefaultAccount(Long accountId,Parameters parameters, AsyncCallback<AcctInqRs> callback) {
        RestRequest<AcctInqRs> request = new RestRequest<AcctInqRs>(RequestBuilder.POST, "accounts/acctInq/default");        
        request.sendAuthenticated(callback);
    }
    
    @Override
    public void getAccountStatusById(Long accountId, Parameters parameters,AsyncCallback<AcctInqRs> callback) {
        RestRequest<AcctInqRs> request = new RestRequest<AcctInqRs>(RequestBuilder.POST, "accounts/acctInq/"+accountId+"/status",parameters);        
        request.sendAuthenticated(callback);
    }
    @Override
    public void getDefaultAccountStatus(Long accountId, Parameters parameters, AsyncCallback<AcctInqRs> callback) {
        RestRequest<AcctInqRs> request = new RestRequest<AcctInqRs>(RequestBuilder.POST, "accounts/acctInq/default/status",parameters);        
        request.sendAuthenticated(callback);
    }
	

	@Override
	public void searchAccountTransactionHistory(Long accountId,
			Parameters parameters, AsyncCallback<AcctTrnInqRs> callback) {
		RestRequest<AcctTrnInqRs> request = new RestRequest<AcctTrnInqRs>(RequestBuilder.POST, "accounts/acctTrnInq/"+accountId, parameters);                              
        request.sendAuthenticated(callback);
		
	}

	@Override
	public void getTransactionData(Long transferId,Parameters parameters,
			AsyncCallback<AcctTrnInqRs> callback) {
		RestRequest<AcctTrnInqRs> request = new RestRequest<AcctTrnInqRs>(RequestBuilder.POST, "accounts/acctTrnInq/transaction/"+transferId, parameters);                              
        request.sendAuthenticated(callback);
		
	}  

}
