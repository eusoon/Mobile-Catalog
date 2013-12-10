package ong.eu.soon.mobile.json.ifx.element;

public class ForExQuoteKeys extends BaseKeys {

	protected ForExQuoteKeys(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.SvcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		SvcIdent = svcIdent;
	}-*/;
	public final native  ForExQuoteId getForExQuoteId()/*-{
		return $wnd.cleanObject(this.ForExQuoteId);
	}-*/;
	public final native  void setForExQuoteId(ForExQuoteId forExQuoteId)/*-{
		ForExQuoteId = forExQuoteId;
	}-*/;
	public final native  ForExQuoteIdent getForExQuoteIdent()/*-{
		return $wnd.cleanObject(this.ForExQuoteIdent);
	}-*/;
	public final native  void setForExQuoteIdent(ForExQuoteIdent forExQuoteIdent)/*-{
		ForExQuoteIdent = forExQuoteIdent;
	}-*/;

}
