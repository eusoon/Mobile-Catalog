package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ForExDealRec extends IFXObject {
	
	protected ForExDealRec(){
	}
	
	public final native  SvcIdent getSvcIdent()/*-{
		return $wnd.cleanObject(this.svcIdent);
	}-*/;
	public final native  void setSvcIdent(SvcIdent svcIdent)/*-{
		this.svcIdent = svcIdent;
	}-*/;
	public final native  ForExDealId getForExDealId()/*-{
		return $wnd.cleanObject(this.forExDealId);
	}-*/;
	public final native  void setForExDealId(ForExDealId forExDealId)/*-{
		this.forExDealId = forExDealId;
	}-*/;
	public final native  ForExDealInfo getForExDealInfo()/*-{
		return $wnd.cleanObject(this.forExDealInfo);
	}-*/;
	public final native  void setForExDealInfo(ForExDealInfo forExDealInfo)/*-{
		this.forExDealInfo = forExDealInfo;
	}-*/;
	public final native  ForExDealEnvr getForExDealEnvr()/*-{
		return $wnd.cleanObject(this.forExDealEnvr);
	}-*/;
	public final native  void setForExDealEnvr(ForExDealEnvr forExDealEnvr)/*-{
		this.forExDealEnvr = forExDealEnvr;
	}-*/;
	public final native  ForExDealStatus getForExDealStatus()/*-{
		return $wnd.cleanObject(this.forExDealStatus);
	}-*/;
	public final native  void setForExDealStatus(ForExDealStatus forExDealStatus)/*-{
		this.forExDealStatus = forExDealStatus;
	}-*/;

}
