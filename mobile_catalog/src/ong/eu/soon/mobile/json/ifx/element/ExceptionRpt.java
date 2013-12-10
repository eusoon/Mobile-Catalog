package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class ExceptionRpt extends IFXObject {

	protected ExceptionRpt(){
	}
	
	public final native  ExceptionResponse getExceptionResponse()/*-{
		return $wnd.cleanObject(this.exceptionResponse);
	}-*/;
	public final native  void setExceptionResponse(ExceptionResponse exceptionResponse)/*-{
		this.exceptionResponse = exceptionResponse;
	}-*/;
	public final native  PurgeDt getPurgeDt()/*-{
		return $wnd.cleanObject(this.purgeDt);
	}-*/;
	public final native  void setPurgeDt(PurgeDt purgeDt)/*-{
		this.purgeDt = purgeDt;
	}-*/;
	public final native  LimitAmt getLimitAmt()/*-{
		return $wnd.cleanObject(this.limitAmt);
	}-*/;
	public final native  void setLimitAmt(LimitAmt limitAmt)/*-{
		this.limitAmt = limitAmt;
	}-*/;
	public final native  JsArray<ExceptionRegion> getExceptionRegion()/*-{
		return $wnd.cleanObject(this.exceptionRegion);
	}-*/;
	public final native  void setExceptionRegion(JsArray<ExceptionRegion> exceptionRegion)/*-{
		this.exceptionRegion = exceptionRegion;
	}-*/;
	public final native  JsArray<RegionPurgeDt> getRegionPurgeDt()/*-{
		return $wnd.cleanObject(this.regionPurgeDt);
	}-*/;
	public final native  void setRegionPurgeDt(JsArray<RegionPurgeDt> regionPurgeDt)/*-{
		this.regionPurgeDt = regionPurgeDt;
	}-*/;
}
