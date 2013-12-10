package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class OrgCategoryCode extends IFXObject {
	protected OrgCategoryCode(){	
	}
	public final native JsArray<MCC> getmCC() /*-{
		return $wnd.cleanObject(mCC);
	}-*/;
	public final native void setmCC(JsArray<MCC> mCC) /*-{
		this.mCC = mCC;
	}-*/;
	public final native JsArray<NAICS> getnAICS() /*-{
		return $wnd.cleanObject(nAICS);
	}-*/;
	public final native void setnAICS(JsArray<NAICS> nAICS) /*-{
		this.nAICS = nAICS;
	}-*/;
	public final native JsArray<SIC> getsIC() /*-{
		return $wnd.cleanObject(sIC);
	}-*/;
	public final native void setsIC(JsArray<SIC> sIC) /*-{
		this.sIC = sIC;
	}-*/;
	public final native JsArray<OrgCatIdent> getOrgCatIdent() /*-{
		return $wnd.cleanObject(orgCatIdent);
	}-*/;
	public final native void setOrgCatIdent(JsArray<OrgCatIdent> orgCatIdent) /*-{
		this.orgCatIdent = orgCatIdent;
	}-*/;
}
