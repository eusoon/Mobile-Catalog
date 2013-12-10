package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class PmtLegalRpt extends IFXObject {
	protected PmtLegalRpt(){	
	}
	public final native OrgPartyInfo getOrgPartyInfo() /*-{
		return $wnd.cleanObject(orgPartyInfo);
	}-*/;
	public final native void setOrgPartyInfo(OrgPartyInfo orgPartyInfo) /*-{
		this.orgPartyInfo = orgPartyInfo;
	}-*/;
	public final native OrgIdent getOrgIdent() /*-{
		return $wnd.cleanObject(orgIdent);
	}-*/;
	public final native void setOrgIdent(OrgIdent orgIdent) /*-{
		this.orgIdent = orgIdent;
	}-*/;
	public final native PayeeCountry getPayeeCountry() /*-{
		return $wnd.cleanObject(payeeCountry);
	}-*/;
	public final native void setPayeeCountry(PayeeCountry payeeCountry) /*-{
		this.payeeCountry = payeeCountry;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;
	public final native PrcDt getPrcDt() /*-{
		return $wnd.cleanObject(prcDt);
	}-*/;
	public final native void setPrcDt(PrcDt prcDt) /*-{
		this.prcDt = prcDt;
	}-*/;
	public final native JsArray<PmtLegalRptData> getPmtLegalRptData() /*-{
		return $wnd.cleanObject(pmtLegalRptData);
	}-*/;
	public final native void setPmtLegalRptData(JsArray<PmtLegalRptData> pmtLegalRptData) /*-{
		this.pmtLegalRptData = pmtLegalRptData;
	}-*/;
}
