package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PmtCreditDetail extends IFXObject {
	protected PmtCreditDetail(){	
	}
	public final native DebtorCurAmt getDebtorCurAmt() /*-{
		return $wnd.cleanObject(this.debtorCurAmt);
	}-*/;
	public final native void setDebtorCurAmt(DebtorCurAmt debtorCurAmt) /*-{
		this.debtorCurAmt = debtorCurAmt;
	}-*/;
	public final native CreditorCurAmt getCreditorCurAmt() /*-{
		return $wnd.cleanObject(this.creditorCurAmt);
	}-*/;
	public final native void setCreditorCurAmt(CreditorCurAmt creditorCurAmt) /*-{
		this.creditorCurAmt = creditorCurAmt;
	}-*/;
	public final native UltimateDebtorData getUltimateDebtorData() /*-{
		return $wnd.cleanObject(this.ultimateDebtorData);                                                                                                                                                                                                                                                                                          Z
	}-*/;
	public final native void setUltimateDebtorData(UltimateDebtorData ultimateDebtorData) /*-{
		this.ultimateDebtorData = ultimateDebtorData;
	}-*/;
	public final native CreditorData getCreditorData() /*-{
		return $wnd.cleanObject(this.creditorData);
	}-*/;
	public final native void setCreditorData(CreditorData creditorData) /*-{
		this.creditorData = creditorData;
	}-*/;
	public final native UltimateCreditorData getUltimateCreditorData() /*-{
		return $wnd.cleanObject(this.ultimateCreditorData);
	}-*/;
	public final native void setUltimateCreditorData(UltimateCreditorData ultimateCreditorData) /*-{
		this.ultimateCreditorData = ultimateCreditorData;
	}-*/;
	public final native ToAcctKeys getToAcctKeys() /*-{
		return $wnd.cleanObject(this.toAcctKeys);
	}-*/;
	public final native void setToAcctKeys(ToAcctKeys toAcctKeys) /*-{
		this.toAcctKeys = toAcctKeys;
	}-*/;
	public final native RemitRef getRemitRef() /*-{
		return $wnd.cleanObject(this.remitRef);
	}-*/;
	public final native void setRemitRef(RemitRef remitRef) /*-{
		this.remitRef = remitRef;
	}-*/;
	public final native Category getCategory() /*-{
		return $wnd.cleanObject(this.category);
	}-*/;
	public final native void setCategory(Category category) /*-{
		this.category = category;
	}-*/;
	public final native ForExDealKeys getForExDealKeys() /*-{
		return $wnd.cleanObject(this.forExDealKeys);
	}-*/;
	public final native void setForExDealKeys(ForExDealKeys forExDealKeys) /*-{
		this.forExDealKeys = forExDealKeys;
	}-*/;
	public final native PmtRefIdent getPmtRefIdent() /*-{
		return $wnd.cleanObject(this.pmtRefIdent);
	}-*/;
	public final native void setPmtRefIdent(PmtRefIdent pmtRefIdent) /*-{
		this.pmtRefIdent = pmtRefIdent;
	}-*/;
	
}