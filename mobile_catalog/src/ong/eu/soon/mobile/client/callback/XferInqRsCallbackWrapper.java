package ong.eu.soon.mobile.client.callback;

import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeRec;
import ong.eu.soon.mobile.json.ifx.element.XferInfo;
import ong.eu.soon.mobile.json.ifx.element.XferRec;
import ong.eu.soon.mobile.json.ifx.transfer.XferInqRs;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.user.client.rpc.AsyncCallback;


public abstract class XferInqRsCallbackWrapper {
	private long start;
	private final LoggedUser loggerUser = LoggedUser.get();
	public final AsyncCallback<XferInqRs> getAsyncCallback() {
		AsyncCallback<XferInqRs> asyncCallback=new AsyncCallback<XferInqRs> (){
	
			@Override
			public void onSuccess(XferInqRs result) {
				Log.debug("Time : " + (System.currentTimeMillis() - start));
				JsArray<XferRec> xferRecs = result.getXferRec();
				JSONArray arr = new JSONArray();
				for (int i=0; i<xferRecs.length();i++)
				{
					XferRec xferRec=xferRecs.get(i);
					XferInfo xferInfo=xferRec.getXferInfo();
					xferInfo.getFromAcctRef().getAcctRec().getAcctInfo().getAcctIdent();
				}
				
			}
			@Override
			public void onFailure(Throwable arg0) {
				// TODO Auto-generated method stub
				
			}	
		};
		return asyncCallback;
	}
	protected abstract void onFailure(Throwable throwable) ;
	protected abstract void onCall(AsyncCallback<XferInqRs> callback) ;
}
