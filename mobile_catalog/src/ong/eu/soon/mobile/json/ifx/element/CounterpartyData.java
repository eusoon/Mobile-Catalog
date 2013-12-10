package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CounterpartyData extends IFXObject {

	protected CounterpartyData(){
	}
	
	public final native  LegalName getLegalName()/*-{
		return $wnd.cleanObject(this.legalName);
	}-*/;
	public final native  void setLegalName(LegalName legalName)/*-{
		this.legalName = legalName;
	}-*/;
	public final native  RefData getRefData()/*-{
		return $wnd.cleanObject(this.refData);
	}-*/;
	public final native  void setRefData(RefData refData)/*-{
		this.refData = refData;
	}-*/;
	public final native  AcctKeys getAcctKeys()/*-{
		return $wnd.cleanObject(this.acctKeys);
	}-*/;
	public final native  void setAcctKeys(AcctKeys acctKeys)/*-{
		this.acctKeys = acctKeys;
	}-*/;
}