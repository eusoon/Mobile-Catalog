package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class DfltPmtData extends IFXObject {
	
	FromAcctRef fromAcctRef;//Aggregate	Optional	From Account Reference
	Category category;//C-40	Optional	Default Category for Payments. May be modified by the client.
	Memo memo;//	C-255		Optional	Default Memo for Payments. May be modified by the client.
	
	public FromAcctRef getFromAcctRef() {
		return fromAcctRef;
	}
	public void setFromAcctRef(FromAcctRef fromAcctRef) {
		this.fromAcctRef = fromAcctRef;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
}