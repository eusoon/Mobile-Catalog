package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CreditAcctData extends IFXObject {
	
	protected CreditAcctData(){	
	}
	
	public final native  OriginationDt getOriginationDt()/*-{
		return $wnd.cleanObject(this.originationDt);
	}-*/;
	public final native  void setOriginationDt(OriginationDt originationDt)/*-{
		this.originationDt = originationDt;
	}-*/;
	public final native  Freq getFreq()/*-{
		return $wnd.cleanObject(this.freq);
	}-*/;
	public final native  void setFreq(Freq freq)/*-{
		this.freq = freq;
	}-*/;
	public final native  TotalPmtCount getTotalPmtCount()/*-{
		return $wnd.cleanObject(this.totalPmtCount);
	}-*/;
	public final native  void setTotalPmtCount(TotalPmtCount totalPmtCount)/*-{
		this.totalPmtCount = totalPmtCount;
	}-*/;
	public final native  PurposeDesc getPurposeDesc()/*-{
		return $wnd.cleanObject(this.purposeDesc);
	}-*/;
	public final native  void setPurposeDesc(PurposeDesc purposeDesc)/*-{
		this.purposeDesc = purposeDesc;
	}-*/;
	public final native  CollateralDesc getCollateralDesc()/*-{
		return $wnd.cleanObject(this.collateralDesc);
	}-*/;
	public final native  void setCollateralDesc(CollateralDesc collateralDesc)/*-{
		this.collateralDesc = collateralDesc;
	}-*/;
	public final native  RegPmt getRegPmt()/*-{
		return $wnd.cleanObject(this.regPmt);
	}-*/;
	public final native  void setRegPmt(RegPmt regPmt)/*-{
		this.regPmt = regPmt;
	}-*/;
	public final native  DueDt getDueDt()/*-{
		return $wnd.cleanObject(this.dueDt);
	}-*/;
	public final native  void setDueDt(DueDt dueDt)/*-{
		this.dueDt = dueDt;
	}-*/;
	public final native  NextPmt getNextPmt()/*-{
		return $wnd.cleanObject(this.nextPmt);
	}-*/;
	public final native  void setNextPmt(NextPmt nextPmt)/*-{
		this.nextPmt = nextPmt;
	}-*/;
	public final native  PrepayPenalty getPrepayPenalty()/*-{
		return $wnd.cleanObject(this.prepayPenalty);
	}-*/;
	public final native  void setPrepayPenalty(PrepayPenalty prepayPenalty)/*-{
		this.prepayPenalty = prepayPenalty;
	}-*/;
	public final native  LOCLoanData getLOCLoanData()/*-{
		return $wnd.cleanObject(this.LOCLoanData);
	}-*/;
	public final native  void setLOCLoanData(LOCLoanData lOCLoanData)/*-{
		LOCLoanData = lOCLoanData;
	}-*/;
	public final native  WriteOffReason getWriteOffReason()/*-{
		return $wnd.cleanObject(this.writeOffReason);
	}-*/;
	public final native  void setWriteOffReason(WriteOffReason writeOffReason)/*-{
		this.writeOffReason = writeOffReason;
	}-*/;
	public final native  WriteOffRespParty getWriteOffRespParty()/*-{
		return $wnd.cleanObject(this.writeOffRespParty);
	}-*/;
	public final native  void setWriteOffRespParty(WriteOffRespParty writeOffRespParty)/*-{
		this.writeOffRespParty = writeOffRespParty;
	}-*/;
}
