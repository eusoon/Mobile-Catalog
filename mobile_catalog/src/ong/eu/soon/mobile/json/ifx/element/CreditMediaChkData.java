package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public  class CreditMediaChkData extends IFXObject {
	
	protected CreditMediaChkData(){	
	}
	
	public final native  ChkEnteredAmt getChkEnteredAmt()/*-{
		return $wnd.cleanObject(this.ChkEnteredAmt);
	}-*/;
	public final native  void setChkEnteredAmt(ChkEnteredAmt chkEnteredAmt)/*-{
		ChkEnteredAmt = chkEnteredAmt;
	}-*/;
	public final native  ChkCourtesyAmt getChkCourtesyAmt()/*-{
		return $wnd.cleanObject(this.ChkCourtesyAmt);
	}-*/;
	public final native  void setChkCourtesyAmt(ChkCourtesyAmt chkCourtesyAmt)/*-{
		ChkCourtesyAmt = chkCourtesyAmt;
	}-*/;
	public final native  MicrReadIntegrity getMicrReadIntegrity()/*-{
		return $wnd.cleanObject(this.micrReadIntegrity);
	}-*/;
	public final native  void setMicrReadIntegrity(MicrReadIntegrity micrReadIntegrity)/*-{
		this.micrReadIntegrity = micrReadIntegrity;
	}-*/;
	public final native  MicrUnformatted getMicrUnformatted()/*-{
		return $wnd.cleanObject(this.micrUnformatted);
	}-*/;
	public final native  void setMicrUnformatted(MicrUnformatted micrUnformatted)/*-{
		this.micrUnformatted = micrUnformatted;
	}-*/;
	public final native  ChkImgData getChkImgData()/*-{
		return $wnd.cleanObject(this.chkImgData);
	}-*/;
	public final native  void setChkImgData(ChkImgData chkImgData)/*-{
		this.chkImgData = chkImgData;
	}-*/;
	public final native  ChkDetail getChkDetail()/*-{
		return $wnd.cleanObject(this.chkDetail);
	}-*/;
	public final native  void setChkDetail(ChkDetail chkDetail)/*-{
		this.chkDetail = chkDetail;
	}-*/;
	public final native  PartyData getPartyData()/*-{
		return $wnd.cleanObject(this.partyData);
	}-*/;
	public final native  void setPartyData(PartyData partyData)/*-{
		this.partyData = partyData;
	}-*/;
	public final native  ChkAcceptId getChkAcceptId()/*-{
		return $wnd.cleanObject(this.chkAcceptId);
	}-*/;
	public final native  void setChkAcceptId(ChkAcceptId chkAcceptId)/*-{
		this.chkAcceptId = chkAcceptId;
	}-*/;
}
