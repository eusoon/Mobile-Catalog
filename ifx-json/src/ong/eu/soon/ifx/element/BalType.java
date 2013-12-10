package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class BalType extends IFXObject {
	BalTypeSource balTypeSource; //Open Enum	Optional Balance Type SourceValid values include: BAI, IFX, TMW Default Value: IFX
	BalTypeValues balTypeValues; //Open Enum	Required Balance Type Values Valid values include: Avail, AvailCredit, AvgLedger, ClosingLedger, ClosingOutstanding, CreditHeld, CreditLimit, Current, DebitHeld, Escrow, Ledger, MinLedger, OpeningLedger, OpeningOutstanding, Outstanding, PayoffAmt, Principal, RwdBonus, RwdReg, TotalHeld
	public BalTypeSource getBalTypeSource() {
		return balTypeSource;
	}
	public void setBalTypeSource(BalTypeSource balTypeSource) {
		this.balTypeSource = balTypeSource;
	}
	public BalTypeValues getBalTypeValues() {
		return balTypeValues;
	}
	public void setBalTypeValues(BalTypeValues balTypeValues) {
		this.balTypeValues = balTypeValues;
	}
}
