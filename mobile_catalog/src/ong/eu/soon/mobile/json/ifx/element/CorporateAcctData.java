package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CorporateAcctData extends IFXObject {

	protected CorporateAcctData(){
	}
	
	public final native  CorpAcctType getCorpAcctType()/*-{
		return $wnd.cleanObject(this.corpAcctType);
	}-*/;
	public final native  void setCorpAcctType(CorpAcctType corpAcctType)/*-{
		this.corpAcctType = corpAcctType;
	}-*/;
	public final native  CorpAcctRelType getCorpAcctRelType()/*-{
		return $wnd.cleanObject(this.corpAcctRelType);
	}-*/;
	public final native  void setCorpAcctRelType(CorpAcctRelType corpAcctRelType)/*-{
		this.corpAcctRelType = corpAcctRelType;
	}-*/;
	public final native  ParentAcctKeys getParentAcctKeys()/*-{
		return $wnd.cleanObject(this.parentAcctKeys);
	}-*/;
	public final native  void setParentAcctKeys(ParentAcctKeys parentAcctKeys)/*-{
		this.parentAcctKeys = parentAcctKeys;
	}-*/;
	public final native  RollBalance getRollBalance()/*-{
		return $wnd.cleanObject(this.rollBalance);
	}-*/;
	public final native  void setRollBalance(RollBalance rollBalance)/*-{
		this.rollBalance = rollBalance;
	}-*/;
	public final native  CorpStmtDetail getCorpStmtDetail()/*-{
		return $wnd.cleanObject(this.corpStmtDetail);
	}-*/;
	public final native  void setCorpStmtDetail(CorpStmtDetail corpStmtDetail)/*-{
		this.corpStmtDetail = corpStmtDetail;
	}-*/;
	public final native  CorpCreditLimitInd getCorpCreditLimitInd()/*-{
		return $wnd.cleanObject(this.corpCreditLimitInd);
	}-*/;
	public final native  void setCorpCreditLimitInd(CorpCreditLimitInd corpCreditLimitInd)/*-{
		this.corpCreditLimitInd = corpCreditLimitInd;
	}-*/;
	public final native  MaxCreditLimitPct getMaxCreditLimitPct()/*-{
		return $wnd.cleanObject(this.maxCreditLimitPct);
	}-*/;
	public final native  void setMaxCreditLimitPct(MaxCreditLimitPct maxCreditLimitPct)/*-{
		this.maxCreditLimitPct = maxCreditLimitPct;
	}-*/;
	public final native  CorpFinLiab getCorpFinLiab()/*-{
		return $wnd.cleanObject(this.corpFinLiab);
	}-*/;
	public final native  void setCorpFinLiab(CorpFinLiab corpFinLiab)/*-{
		this.corpFinLiab = corpFinLiab;
	}-*/;
	public final native  EmbossCorpNameInd getEmbossCorpNameInd()/*-{
		return $wnd.cleanObject(this.embossCorpNameInd);
	}-*/;
	public final native  void setEmbossCorpNameInd(EmbossCorpNameInd embossCorpNameInd)/*-{
		this.embossCorpNameInd = embossCorpNameInd;
	}-*/;

}
