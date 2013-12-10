package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class IssuerScriptResultData extends IFXObject {
	protected IssuerScriptResultData(){	
	}
	
	public final native  IssuerScriptResult getIssuerScriptResult()/*-{
		return $wnd.cleanObject(this.issuerScriptResult);
	}-*/;
	public final native  void setIssuerScriptResult(IssuerScriptResult issuerScriptResult)/*-{
		this.issuerScriptResult = issuerScriptResult;
	}-*/;
	public final native  IssuerScriptIdent getIssuerScriptIdent()/*-{
		return $wnd.cleanObject(this.issuerScriptIdent);
	}-*/;
	public final native  void setIssuerScriptIdent(IssuerScriptIdent issuerScriptIdent)/*-{
		this.issuerScriptIdent = issuerScriptIdent;
	}-*/;	
}
