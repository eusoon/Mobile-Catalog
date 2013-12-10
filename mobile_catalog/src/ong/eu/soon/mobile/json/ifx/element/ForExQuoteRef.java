package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExQuoteRef extends IFXObject {

	protected ForExQuoteRef(){
	}
	
	public final native  ForExQuoteKeys getForExQuoteKeys()/*-{
		return $wnd.cleanObject(this.forExQuoteKeys);
	}-*/;
	public final native  void setForExQuoteKeys(ForExQuoteKeys forExQuoteKeys)/*-{
		this.forExQuoteKeys = forExQuoteKeys;
	}-*/;
	public final native  ForExQuoteRec getForExQuoteRec()/*-{
		return $wnd.cleanObject(this.forExQuoteRec);
	}-*/;
	public final native  void setForExQuoteRec(ForExQuoteRec forExQuoteRec)/*-{
		this.forExQuoteRec = forExQuoteRec;
	}-*/;
	public final native  ForExQuoteInfo getForExQuoteInfo()/*-{
		return $wnd.cleanObject(this.ForExQuoteInfo);
	}-*/;
	public final native  void setForExQuoteInfo(ForExQuoteInfo forExQuoteInfo)/*-{
		ForExQuoteInfo = forExQuoteInfo;
	}-*/;

}
