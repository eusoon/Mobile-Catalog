/*
   This file is part of Cyclos.

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
package ong.eu.soon.mobile.client.accounts;

import ong.eu.soon.ifx.acct.AcctInqRq;
import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.mobile.client.IFX;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.Notification.NotificationLayout;
import ong.eu.soon.mobile.client.callback.AcctInqRsCallbackWrapper;
import ong.eu.soon.mobile.client.model.Account;
import ong.eu.soon.mobile.client.model.AccountData;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.services.AccountService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.widgets.AccountRow;
import ong.eu.soon.mobile.client.ui.widgets.SimpleDataList;
import ong.eu.soon.mobile.client.utils.ParameterKey;
import ong.eu.soon.mobile.json.ifx.acct.AcctInqRs;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
//import com.jayway.jsonpath.JsonPath;

/**
 * A {@link Page} used to display accounts.
 * 
 * @author luis
 */
public class AccountsPage extends Page {
    
    private AccountService accountService = GWT.create(AccountService.class);
    private JsArray<Account> accounts;
    private String unitPattern="$#amount#";
    public String getUnitPattern() {
		return unitPattern;
	}

	public void setUnitPattern(String unitPattern) {
		this.unitPattern = unitPattern;
	}

	@Override
    public String getHeading() {
    	 JsArray<AccountData> accountDatas = LoggedUser.get().getInitialData().getAccountDatas();
    	 accounts = IFX.getAccounts(accountDatas);
      
        // If exists only an account display details title
        if(accounts.length() == 1) {
            return messages.accountDetailsHeading();
        } 
        return messages.accountsHeading();
    }

    @Override
    public boolean hasCustomScroll() {
        return true;
    }
    
    @Override
    public Widget initialize() {                           
        
        if(accounts.length() == 1) {
            // If exists only an account display details page
            final Account account = accounts.get(0);
            
            Parameters params = new Parameters();
            params.add(ParameterKey.ID, account.getId());   
            
            Page page = new AccountDetailsPage();
            page.setParameters(params);

            return page.initialize();
        }
        
        // List pages uses fixed notification layout
        Notification.get().setLayout(NotificationLayout.FIXED);
        
        // If there are multiple accounts, display it
        SimpleDataList<AccountData> dataList = new SimpleDataList<AccountData>() {
       
            @Override
            protected Widget onRender(Context context, AccountData data) {                
                
                // Value can be null
                if (data == null) {
                  return null;
                }
                
                // Create row widget
                AccountRow row = new AccountRow();
                row.setHeading(data.getAccount().getType().getName());
 //               row.setSub(LoggedUser.get().getInitialData().getProfile().getName());
                row.setSub(data.getAccount().getAccountNo());
                row.setValue(data.getStatus().getFormattedBalance(), data.getStatus().getBalance() > 0d);
                
                return row;
            }

           
      	 
            
            @Override
            protected void onSearchData(final AsyncCallback<JsArray<AccountData>> callback) {
            	final LoggedUser loggerUser=LoggedUser.get();
            	final Parameters params=new Parameters();
            	AcctInqRq acctInqRq=new AcctInqRq();
				acctInqRq.setRqUID(IFX.getRqUID("ACCT"));
				acctInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggerUser, "AcctInq"));

				RecSelect[] recSelect = new RecSelect[1];
				recSelect[0].setString("$.acctInqRs.acctRec.acctEnvr.partyKeys.loginIdent[?(@.loginName='"+loggerUser.getPrincipal()+"')]");
				acctInqRq.setRecSelect(recSelect);
				
				params.add("accInqRq", acctInqRq);
				
				new AcctInqRsCallbackWrapper() {

				        protected void onFailure(Throwable throwable) {
				          	callback.onFailure(throwable);
				        }
						@Override
						protected void onSuccess(JsArray<AccountData> result1) {
							callback.onSuccess(result1);
						}
						@Override
						protected void onCall(AsyncCallback<AcctInqRs> callback) {
							// Fetch account data
							this.setUnitPattern(unitPattern);
							accountService.getAccountsData(params, callback);
						}
				      }.call(); 
            }     

            @Override
            protected void onRowSelected(AccountData value) { 
                // Go to account details
                navigateToAccountDetails(value.getAccount());
            }
        };

        return dataList;
    }

    /**
     * Navigates to account details sending according parameters     
     */
    private void navigateToAccountDetails(Account account) {
        Parameters params = new Parameters();
        params.add(ParameterKey.ID, account.getId());   
        Navigation.get().go(PageAnchor.ACCOUNT_DETAILS, params);      
    }

}
