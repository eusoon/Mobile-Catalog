package ong.eu.soon.mobile.json.ifx.element;

public class ForExDealKeys extends BaseKeys {
	
	protected ForExDealKeys(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  ForExDealId getForExDealId()/*-{
		return $wnd.cleanObject(this.forExDealId);
	}-*/;
	public final native  void setForExDealId(ForExDealId forExDealId)/*-{
		this.forExDealId = forExDealId;
	}-*/;
	public final native  ForExDealIdent getForExDealIdent()/*-{
		return $wnd.cleanObject(this.forExDealIdent);
	}-*/;
	public final native  void setForExDealIdent(ForExDealIdent forExDealIdent)/*-{
		this.forExDealIdent = forExDealIdent;
	}-*/;
}
