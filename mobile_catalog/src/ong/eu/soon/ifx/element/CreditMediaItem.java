package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CreditMediaItem extends IFXObject {
	CreditMediaItemIdent CreditMediaItemIdent;//NC-36	Optional Credit Media Item Identifier. If more than one <CreditMediaItem> aggregate exists then the <CreditMediaItemId> is required.
	//begin-xor Required
	CreditMediaCashData CreditMediaCashData;//Aggregate	Required Credit Media Cash Information aggregate. This aggregate contains details about cash being deposited.
	CreditMediaChkData CreditMediaChkData;//Aggregate	Required Credit Media Check Information aggregate. This aggregate contains details about the check being deposited.
	//end-xor
	public CreditMediaItemIdent getCreditMediaItemIdent() {
		return CreditMediaItemIdent;
	}
	public void setCreditMediaItemIdent(CreditMediaItemIdent creditMediaItemIdent) {
		CreditMediaItemIdent = creditMediaItemIdent;
	}
	public CreditMediaCashData getCreditMediaCashData() {
		return CreditMediaCashData;
	}
	public void setCreditMediaCashData(CreditMediaCashData creditMediaCashData) {
		CreditMediaCashData = creditMediaCashData;
	}
	public CreditMediaChkData getCreditMediaChkData() {
		return CreditMediaChkData;
	}
	public void setCreditMediaChkData(CreditMediaChkData creditMediaChkData) {
		CreditMediaChkData = creditMediaChkData;
	}

}
