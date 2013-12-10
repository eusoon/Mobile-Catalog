package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class AcctType extends IFXObject {

	protected AcctType(){	
	}
	public final native  AcctTypeValue getAcctTypeValue()/*-{
		return $wnd.cleanObject(this.acctTypeValue); //Open Enum	Optional Account Type Source Valid values include: APACS, IFX, ISO15022, ISO20022, ISO8583:1993, ISO8583:2003, OFXDefault Value: IFX
	}-*/;
	public final native  void setAcctTypeValue(AcctTypeValue acctTypeValue)/*-{
		this.acctTypeValue = acctTypeValue;
	}-*/;
	public final native  AcctTypeSource getAcctTypeSource()/*-{
		return $wnd.cleanObject(this.acctTypeSource);
	}-*/;
	public final native  void setAcctTypeSource(AcctTypeSource acctTypeSource)/*-{
		this.acctTypeSource = acctTypeSource;
	}-*/;

}
