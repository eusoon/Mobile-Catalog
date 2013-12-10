package ong.eu.soon.mobile.json.ifx.element;

public  class ForExDealEnvr extends BaseEnvr {

	protected ForExDealEnvr(){
	}
	
	public final native  ForExDealIdent getForExDealIdent()/*-{
		return $wnd.cleanObject(this.forExDealIdent);
	}-*/;

	public final native  void setForExDealIdent(ForExDealIdent forExDealIdent)/*-{
		this.forExDealIdent = forExDealIdent;
	}-*/;

}
