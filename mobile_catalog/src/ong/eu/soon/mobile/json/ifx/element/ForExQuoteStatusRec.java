package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExQuoteStatusRec extends IFXObject {

	protected ForExQuoteStatusRec(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  ForExQuoteId getForExQuoteId()/*-{
		return $wnd.cleanObject(this.forExQuoteId);
	}-*/;
	public final native  void setForExQuoteId(ForExQuoteId forExQuoteId)/*-{
		this.forExQuoteId = forExQuoteId;
	}-*/;
	public final native  ForExQuoteStatus getForExQuoteStatus()/*-{
		return $wnd.cleanObject(this.forExQuoteStatus);
	}-*/;
	public final native  void setForExQuoteStatus(ForExQuoteStatus forExQuoteStatus)/*-{
		this.forExQuoteStatus = forExQuoteStatus;
	}-*/;
	
}
