package ong.eu.soon.mobile.client.callback;

import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.model.Transfer;
import ong.eu.soon.mobile.client.utils.ResultPage;
import ong.eu.soon.mobile.json.ifx.element.CustPayeeRec;
import ong.eu.soon.mobile.json.ifx.element.FromAcctRef;
import ong.eu.soon.mobile.json.ifx.element.XferInfo;
import ong.eu.soon.mobile.json.ifx.element.XferRec;
import ong.eu.soon.mobile.json.ifx.transfer.XferAddRs;
import ong.eu.soon.mobile.json.ifx.transfer.XferInqRs;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.rpc.AsyncCallback;


public abstract class XferAddRsCallbackWrapper {
	private long start;
	private final LoggedUser loggerUser = LoggedUser.get();
	public final AsyncCallback<XferAddRs> getAsyncCallback() {
		AsyncCallback<XferAddRs> asyncCallback=new AsyncCallback<XferAddRs> (){
	
			@Override
			public void onSuccess(XferAddRs result) {
				Log.debug("Time : " + (System.currentTimeMillis() - start));
		
					XferRec xferRec=result.getXferRec();
					XferInfo xferInfo=xferRec.getXferInfo();
					FromAcctRef fromAcctRef=xferInfo.getFromAcctRef();
					JSONObject transfer = new JSONObject();
					
					Transfer result1=transfer.getJavaScriptObject().cast();
					XferAddRsCallbackWrapper.this.onSuccess(result1);
			}
			@Override
			public void onFailure(Throwable throwable) {
				XferAddRsCallbackWrapper.this.onFailure(throwable);
			}	
		};
		return asyncCallback;
	}
	protected abstract void onSuccess(Transfer result) ;
	protected abstract void onFailure(Throwable throwable) ;
	protected abstract void onCall(AsyncCallback<XferInqRs> callback) ;
}
