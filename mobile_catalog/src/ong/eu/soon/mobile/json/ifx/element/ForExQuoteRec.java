package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class ForExQuoteRec extends IFXObject {

	protected ForExQuoteRec(){
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
	public final native  ForExQuoteInfo getForExQuoteInfo()/*-{
		return $wnd.cleanObject(this.forExQuoteInfo);
	}-*/;
	public final native  void setForExQuoteInfo(ForExQuoteInfo forExQuoteInfo)/*-{
		this.forExQuoteInfo = forExQuoteInfo;
	}-*/;
	public final native  ForExQuoteEnvr getForExQuoteEnvr()/*-{
		return $wnd.cleanObject(this.forExQuoteEnvr);
	}-*/;
	public final native  void setForExQuoteEnvr(ForExQuoteEnvr forExQuoteEnvr)/*-{
		this.forExQuoteEnvr = forExQuoteEnvr;
	}-*/;
	public final native  ForExQuoteStatus getForExQuoteStatus()/*-{
		return $wnd.cleanObject(this.forExQuoteStatus);
	}-*/;
	public final native  void setForExQuoteStatus(ForExQuoteStatus forExQuoteStatus)/*-{
		this.forExQuoteStatus = forExQuoteStatus;
	}-*/;

}
