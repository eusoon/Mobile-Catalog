package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class RemitInfo extends IFXObject {
	protected RemitInfo(){	
	}
	public final native RemitRefIdent getRemitRefIdent() /*-{
		return $wnd.cleanObject(remitRefIdent);
	}-*/;
	public final native void setRemitRefIdent(RemitRefIdent remitRefIdent) /*-{
		this.remitRefIdent = remitRefIdent;
	}-*/;
	public final native PmtRefIdent getPmtRefIdent() /*-{
		return $wnd.cleanObject(pmtRefIdent);
	}-*/;
	public final native void setPmtRefIdent(PmtRefIdent pmtRefIdent) /*-{
		this.pmtRefIdent = pmtRefIdent;
	}-*/;
	public final native RemitDeliveryRespParty getRemitDeliveryRespParty() /*-{
		return $wnd.cleanObject(remitDeliveryRespParty);
	}-*/;
	public final native void setRemitDeliveryRespParty(
			RemitDeliveryRespParty remitDeliveryRespParty) /*-{
		this.remitDeliveryRespParty = remitDeliveryRespParty;
	}-*/;
	public final native DeliveryInstruction getDeliveryInstruction() /*-{
		return $wnd.cleanObject(deliveryInstruction);
	}-*/;
	public final native void setDeliveryInstruction(DeliveryInstruction deliveryInstruction) /*-{
		this.deliveryInstruction = deliveryInstruction;
	}-*/;
	public final native PmtInstruction getPmtInstruction() /*-{
		return $wnd.cleanObject(pmtInstruction);
	}-*/;
	public final native void setPmtInstruction(PmtInstruction pmtInstruction) /*-{
		this.pmtInstruction = pmtInstruction;
	}-*/;
	public final native ChkData getChkData() /*-{
		return $wnd.cleanObject(chkData);
	}-*/;
	public final native void setChkData(ChkData chkData) /*-{
		this.chkData = chkData;
	}-*/;
	public final native ChkImageURL getChkImageURL() /*-{
		return $wnd.cleanObject(chkImageURL);
	}-*/;
	public final native void setChkImageURL(ChkImageURL chkImageURL) /*-{
		this.chkImageURL = chkImageURL;
	}-*/;
	public final native CustPayeeRef getCustPayeeRef() /*-{
		return $wnd.cleanObject(custPayeeRef);
	}-*/;
	public final native void setCustPayeeRef(CustPayeeRef custPayeeRef) /*-{
		this.custPayeeRef = custPayeeRef;
	}-*/;
	public final native JsArray<RemitDetail> getRemitDetail() /*-{
		return $wnd.cleanObject(remitDetail);
	}-*/;
	public final native void setRemitDetail(JsArray<RemitDetail> remitDetail) /*-{
		this.remitDetail = remitDetail;
	}-*/;
	public final native PmtRef getPmtRef() /*-{
		return $wnd.cleanObject(pmtRef);
	}-*/;
	public final native void setPmtRef(PmtRef pmtRef) /*-{
		this.pmtRef = pmtRef;
	}-*/;
	public final native JsArray<RefData> getRefData() /*-{
		return $wnd.cleanObject(refData);
	}-*/;
	public final native void setRefData(JsArray<RefData> refData) /*-{
		this.refData = refData;
	}-*/;
	public final native CurAmt getCurAmt() /*-{
		return $wnd.cleanObject(curAmt);
	}-*/;
	public final native void setCurAmt(CurAmt curAmt) /*-{
		this.curAmt = curAmt;
	}-*/;
	public final native PmtRemitRefIdent getPmtRemitRefIdent() /*-{
		return $wnd.cleanObject(pmtRemitRefIdent);
	}-*/;
	public final native void setPmtRemitRefIdent(PmtRemitRefIdent pmtRemitRefIdent) /*-{
		this.pmtRemitRefIdent = pmtRemitRefIdent;
	}-*/;
	public final native PmtLegalRpt getPmtLegalRpt() /*-{
		return $wnd.cleanObject(pmtLegalRpt);
	}-*/;
	public final native void setPmtLegalRpt(PmtLegalRpt pmtLegalRpt) /*-{
		this.pmtLegalRpt = pmtLegalRpt;
	}-*/;
}
