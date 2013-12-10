package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class TrnType extends IFXObject {
	TrnTypeValue trnTypeValue;  //Open Enum	Optional Transaction Type Value. Valid values include: Adjustment, Advance, Credit, Debit, Deposit, Dispurse, Dividend, Fee, Interest, Payment, Purchase, Redeem, Return, Sell, Tax, Transfer, Withdrawal
	TrnTypeSource trnTypeSource; //Open Enum	Optional Transaction Type Source Valid values include: BAI, IFX, ISO8583:1993, ISO8583:2003, TMA Default Value: IFX
	public TrnTypeValue getTrnTypeValue() {
		return trnTypeValue;
	}
	public void setTrnTypeValue(TrnTypeValue trnTypeValue) {
		this.trnTypeValue = trnTypeValue;
	}
	public TrnTypeSource getTrnTypeSource() {
		return trnTypeSource;
	}
	public void setTrnTypeSource(TrnTypeSource trnTypeSource) {
		this.trnTypeSource = trnTypeSource;
	}
}
