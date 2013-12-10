package ong.eu.soon.mobile.client.callback;


import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.model.Contact;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeInfo;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeRec;
import ong.eu.soon.mobile.json.ifx.element.Email;
import ong.eu.soon.mobile.json.ifx.element.Locator;
import ong.eu.soon.mobile.json.ifx.payee.CustPayeeInqRs;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback; 

public abstract class CustPayeeInqRsCallbackWrapper {
	private long start;
	private final LoggedUser loggerUser = LoggedUser.get();
	public final AsyncCallback<CustPayeeInqRs> getAsyncCallback() {
		AsyncCallback<CustPayeeInqRs> asyncCallback=new AsyncCallback<CustPayeeInqRs> (){

			
			@Override
			public void onSuccess(CustPayeeInqRs result) {
				Log.debug("Time : " + (System.currentTimeMillis() - start));
				JsArray<CustPayeeRec> custPayeeRecs = result.getCustPayeeRec();
				JSONArray arr = new JSONArray();
				
				for (int i=0; i<custPayeeRecs.length();i++)
				{
					CustPayeeRec custPayeeRec=custPayeeRecs.get(i);
					String loginName = custPayeeRec.getCustPayeeEnvr().getPartyKeys().getLoginIdent().getLoginName().getString();
					if (loggerUser.getPrincipal().equalsIgnoreCase(loginName))
					{
						CustPayeeInfo custPayeeInfo =custPayeeRec.getCustPayeeInfo();
						JSONObject contact = new JSONObject();
									
						JSONObject member=new JSONObject();
						JsArray<ong.eu.soon.mobile.json.ifx.element.Contact> contacts=custPayeeInfo.getStdPayeeRef().getStdPayeeInfo().getPartyData().getContact();
						for(int x=0;x<contacts.length();x++){
							ong.eu.soon.mobile.json.ifx.element.Contact contact1=contacts.get(x);
							Locator locator=contact1.getLocator();
							if(locator instanceof Email){
								Email email=(Email)locator;
								String email1=email.getEmailAddr().getString();;
								member.put("email", getAsJSONString(email1));
							}
						}
						
						String name=custPayeeRec.getCustPayeeInfo().getName().getString();
						member.put("name",getAsJSONString(name));
						String username=custPayeeRec.getCustPayeeEnvr().getPartyKeys().getLoginIdent().getLoginName().getString();
						member.put("username", getAsJSONString(username));
						contact.put("member", member);
						String notes="";
						contact.put("notes", getAsJSONString(notes));
						arr.set(i++, contact);
						
					}
					else{
						
					}
				}
				JsArray<Contact> result1 = arr.getJavaScriptObject().cast();
				CustPayeeInqRsCallbackWrapper.this.onSuccess(result1);
			}
			
			@Override
			public void onFailure(Throwable throwable) {
				 Log.debug("Time (failure) : " + (System.currentTimeMillis() - start));
				CustPayeeInqRsCallbackWrapper.this.onFailure(throwable);
			}
			
        };
        return asyncCallback;
	}
	protected abstract void onSuccess(JsArray<Contact> result) ;
	protected abstract void onFailure(Throwable throwable) ;
	protected abstract void onCall(AsyncCallback<CustPayeeInqRs> callback) ;
	public final void call() {
		start = System.currentTimeMillis();
		onCall(getAsyncCallback());
	}
	private JSONValue getAsJSONString(String value) {
		if (value == null) {
			return JSONNull.getInstance();
		}

		return new JSONString(value);
	}
	
}
