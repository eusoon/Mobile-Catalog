package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;
import ong.eu.soon.mobile.json.ifx.element.AcctTrnId;
import ong.eu.soon.mobile.json.ifx.element.SvcIdent;

public class AcctTrnKeys extends IFXObject {

	protected AcctTrnKeys(){	
	}
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  AcctTrnId getAcctTrnId()/*-{
		return $wnd.cleanObject(acctTrnId);
	}-*/;
	public final native  void setAcctTrnId(AcctTrnId acctTrnId)/*-{
		this.acctTrnId = acctTrnId;
	}-*/;
}