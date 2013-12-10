package ong.eu.soon.mobile.json.ifx.element;

public class CustPayeeKeys extends BaseKeys {

	protected CustPayeeKeys(){	
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  CustPayeeId getCustPayeeId()/*-{
		return $wnd.cleanObject(this.custPayeeId);
	}-*/;
	public final native  void setCustPayeeId(CustPayeeId custPayeeId)/*-{
		this.custPayeeId = custPayeeId;
	}-*/;	
}
