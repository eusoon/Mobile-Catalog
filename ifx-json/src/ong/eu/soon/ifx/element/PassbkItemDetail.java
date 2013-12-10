package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PassbkItemDetail extends IFXObject {

	PostedDt postedDt; //Date	Optional	Posted Date. For banking, the date on which the transaction was recorded against the account. For transfers, the date on which the entries were made on the books of the receiving Financial Institution.
	TrnType trnType; //Aggregate	Optional	Transaction Type
	CompositeCurAmt[] compositeCurAmt; //Aggregate	Optional Repeating	The amount for the specific transaction this Passbook Item Detail represents.
	BalAmt balAmt; //Aggregate	Optional	The account balance after the processing of this item, prior to the processing of subsequent items
	Memo[] memo; //C-255	Optional Repeating	Description of this item. The size of the passbook printable area should not be inferred from the size of this field, as it would likely be smaller.
	
	public PostedDt getPostedDt() {
		return postedDt;
	}
	public void setPostedDt(PostedDt postedDt) {
		this.postedDt = postedDt;
	}
	public TrnType getTrnType() {
		return trnType;
	}
	public void setTrnType(TrnType trnType) {
		this.trnType = trnType;
	}
	public CompositeCurAmt[] getCompositeCurAmt() {
		return compositeCurAmt;
	}
	public void setCompositeCurAmt(CompositeCurAmt[] compositeCurAmt) {
		this.compositeCurAmt = compositeCurAmt;
	}
	public BalAmt getBalAmt() {
		return balAmt;
	}
	public void setBalAmt(BalAmt balAmt) {
		this.balAmt = balAmt;
	}
	public Memo[] getMemo() {
		return memo;
	}
	public void setMemo(Memo[] memo) {
		this.memo = memo;
	}
	
}
