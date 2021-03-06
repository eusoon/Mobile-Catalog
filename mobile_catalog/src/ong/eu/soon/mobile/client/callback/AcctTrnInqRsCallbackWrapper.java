package ong.eu.soon.mobile.client.callback;

import java.math.BigDecimal;

import ong.eu.soon.mobile.client.model.Transfer;
import ong.eu.soon.mobile.client.utils.Amount;
import ong.eu.soon.mobile.client.utils.ResultPage;
import ong.eu.soon.mobile.json.ifx.acct.AcctTrnInqRs;
import ong.eu.soon.mobile.json.ifx.element.AcctTrnInfo;
import ong.eu.soon.mobile.json.ifx.element.AcctTrnRec;
import ong.eu.soon.mobile.json.ifx.element.CurCode;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeInfo;
import ong.eu.soon.mobile.json.ifx.element.Email;
import ong.eu.soon.mobile.json.ifx.element.Locator;


import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AcctTrnInqRsCallbackWrapper {
	private long start;
	public final AsyncCallback<AcctTrnInqRs> getAsyncCallback() {
		AsyncCallback<AcctTrnInqRs> callback=new AsyncCallback<AcctTrnInqRs>(){
			private long start;
			@Override
			public void onSuccess(AcctTrnInqRs acctTrnInqRs) {
				Log.debug("Time : " + (System.currentTimeMillis() - start));
					JsArray<AcctTrnRec> acctTrnRecs=acctTrnInqRs.getAcctTrnRec();
					JSONArray arr = new JSONArray();
					
					for(int i=0; i<acctTrnRecs.length();i++){
						 AcctTrnRec acctTrnRec=acctTrnRecs.get(i);
						 AcctTrnInfo acctTrnInfo =acctTrnRec.getAcctTrnInfo();
						 CustPayeeInfo custPayeeInfo =acctTrnInfo.getCustPayeeInfo();
				
						 String transferTypeValue=acctTrnInfo.getTrnType().getTrnTypeValue().getString();
						 String date=acctTrnInfo.getPostedDt().getString();
						 String processDate=acctTrnInfo.getEffDt().getString();
						 String amount=acctTrnInfo.getTotalCurAmt().getAmt().getString();
						 String transactionNumber="";
						
						 String systemAccountName="";
						 
						 String description=acctTrnInfo.getMemo().getString();
						 
						 String name=acctTrnInfo.getName().getString();
						 
						 
						 JSONObject transfer = new JSONObject();
						 transfer.put("date", getAsJSONString(date));
						 DateTimeFormat df = DateTimeFormat.getFormat("yyyy-mm-ddThh:mm:ss");//
							// formatted as per ISO 8601
					
//						 CalendarConverter calendarConverter=new CalendarConverter(df);
//						 Calendar formattedDate=calendarConverter.valueOf(date); 
//						 transfer.put("formattedDate", getAsJSONString(calendarConverter.toString(formattedDate)));	 
						 transfer.put("processDate", getAsJSONString(processDate));
//						 Calendar formattedProcessDate=calendarConverter.valueOf(date);
//						 transfer.put("formattedProcessDate", getAsJSONString(calendarConverter.toString(formattedProcessDate))); 
						 transfer.put("amount", getAsJSONString(amount));
						 Amount amt=new Amount();
						 amt.setValue(new BigDecimal(amount));
//				         String formattedAmount=localSettings.getAmountConverter().toString(amt);
//						 transfer.put("formattedAmount", getAsJSONString(formattedAmount));
						 JSONObject transferType=new JSONObject();
						 JSONObject from=new JSONObject();
						 JSONObject currency=new JSONObject();
						 CurCode curCode=acctTrnInfo.getTotalCurAmt().getCurCode();
						 currency.put("name", getAsJSONString(curCode.getCurCodeValue().getString()));
						 currency.put("symbol", getAsJSONString(curCode.getCurCodeValue().getString()));
						 String fromAccountName=acctTrnInfo.getCustPayeeInfo().getPayerAcctNum().getString();
						 from.put("name", getAsJSONString(fromAccountName));
						 from.put("currency", currency);
						 transferType.put("from", from);
						 JSONObject to=new JSONObject();
						 String toAccountName=acctTrnInfo.getCustPayeeInfo().getPayeeAcctNum().getString();
						 to.put("name", getAsJSONString(toAccountName));
						 to.put("currency", currency);
						 transferType.put("to", to);
						 transferType.put("name", getAsJSONString(transferTypeValue));
					     transfer.put("transferType", transferType);
						 transfer.put("description", getAsJSONString(description));
						 JSONObject member=new JSONObject();
						 JsArray<ong.eu.soon.mobile.json.ifx.element.Contact> contacts=custPayeeInfo.getStdPayeeRef().getStdPayeeInfo().getPartyData().getContact();
						 for(int x=0;i<contacts.length();x++){
								ong.eu.soon.mobile.json.ifx.element.Contact contact1=contacts.get(x);
								Locator locator=contact1.getLocator();
								if(locator instanceof Email){
									Email email=(Email)locator;
									String email1=email.getEmailAddr().getString();;
									member.put("email", getAsJSONString(email1));
								}
							}
							
							String payeeName=custPayeeInfo.getName().getString();
							member.put("name",getAsJSONString(payeeName));
							String username=acctTrnRec.getAcctTrnEnvr().getPartyKeys().getLoginIdent().getLoginName().getString();
							member.put("username", getAsJSONString(username));
						 
						 transfer.put("member", member);
						 transfer.put("name", getAsJSONString(name));
						 transfer.put("systemAccountName", getAsJSONString(systemAccountName));
						 transfer.put("transactionNumber", getAsJSONString(transactionNumber));
						 arr.set(i++,transfer);
					}
					JSONObject resultPage = new JSONObject();
					resultPage.put("elements", arr);
					ResultPage<Transfer> result=resultPage.getJavaScriptObject().cast();
					AcctTrnInqRsCallbackWrapper.this.onSuccess(result);
				
			}
			@Override
			public void onFailure(Throwable throwable) {
				 Log.debug("Time (failure) : " + (System.currentTimeMillis() - start));
				AcctTrnInqRsCallbackWrapper.this.onFailure(throwable);
			}

			
			
		};
		return callback;
	}
	protected abstract void onFailure(Throwable throwable);
	protected abstract void onSuccess(ResultPage<Transfer> result);
	protected abstract void onCall(AsyncCallback<AcctTrnInqRs> callback) ;

	
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
