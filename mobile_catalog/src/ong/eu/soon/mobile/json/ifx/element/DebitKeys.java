package ong.eu.soon.mobile.json.ifx.element;

public class DebitKeys extends BaseKeys {

	protected DebitKeys(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;

	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;

	public final native  DebitId getDebitId()/*-{
		return $wnd.cleanObject(this.debitId);
	}-*/;

	public final native  void setDebitId(DebitId debitId)/*-{
		this.debitId = debitId;
	}-*/;

}
