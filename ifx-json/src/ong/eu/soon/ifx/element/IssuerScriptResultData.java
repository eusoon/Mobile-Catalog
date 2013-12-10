package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class IssuerScriptResultData extends IFXObject {
	IssuerScriptResult issuerScriptResult;	 //	HexBin-1	 Required	 Issuer Script Result. The result of executing the Issuer Script. In the event of an error, this includes the sequence number of the failed Script Command in the order it appears in the issuer script.Valid values are defined in EMV Integrated Circuit Card Specification for Payment Systems Version 4.1 (Book 4, table 33).
	IssuerScriptIdent issuerScriptIdent;	 //	HexBin-4	 Optional	 Issuer Script Identification. Uniquely identifies the script command for which this is the response.Required if multiple scripts send to the terminal were identified by 's.
	
	public IssuerScriptResult getIssuerScriptResult() {
		return issuerScriptResult;
	}
	public void setIssuerScriptResult(IssuerScriptResult issuerScriptResult) {
		this.issuerScriptResult = issuerScriptResult;
	}
	public IssuerScriptIdent getIssuerScriptIdent() {
		return issuerScriptIdent;
	}
	public void setIssuerScriptIdent(IssuerScriptIdent issuerScriptIdent) {
		this.issuerScriptIdent = issuerScriptIdent;
	}	
}
