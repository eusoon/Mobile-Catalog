package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class IdentCharacterData extends IFXObject {
	protected IdentCharacterData(){	
	}
	
	public final native  IdentType getIdentType()/*-{
		return $wnd.cleanObject(this.identType);
	}-*/;
	public final native  void setIdentType(IdentType identType)/*-{
		this.identType = identType;
	}-*/;
	public final native  ExpDt getExpDt()/*-{
		return $wnd.cleanObject(this.expDt);
	}-*/;
	public final native  void setExpDt(ExpDt expDt)/*-{
		this.expDt = expDt;
	}-*/;
	public final native  StartDt getStartDt()/*-{
		return $wnd.cleanObject(this.startDt);
	}-*/;
	public final native  void setStartDt(StartDt startDt)/*-{
		this.startDt = startDt;
	}-*/;
	public final native  OrigIssueDt getOrigIssueDt()/*-{
		return $wnd.cleanObject(this.origIssueDt);
	}-*/;
	public final native  void setOrigIssueDt(OrigIssueDt origIssueDt)/*-{
		this.origIssueDt = origIssueDt;
	}-*/;
	public final native  IdentProgram getIdentProgram()/*-{
		return $wnd.cleanObject(this.identProgram);
	}-*/;
	public final native  void setIdentProgram(IdentProgram identProgram)/*-{
		this.identProgram = identProgram;
	}-*/;
	public final native  JsArray<IdentReadMethod> getIdentReadMethod()/*-{
		return $wnd.cleanObject(this.identReadMethod);
	}-*/;
	public final native  void setIdentReadMethod(JsArray<IdentReadMethod> identReadMethod)/*-{
		this.identReadMethod = identReadMethod;
	}-*/;
	public final native  JsArray<IdentPrevReadMethod> getIdentPrevReadMethod()/*-{
		return $wnd.cleanObject(this.identPrevReadMethod);
	}-*/;
	public final native  void setIdentPrevReadMethod(JsArray<IdentPrevReadMethod> identPrevReadMethod)/*-{
		this.identPrevReadMethod = identPrevReadMethod;
	}-*/;
	public final native  IdentServiceCode getIdentServiceCode()/*-{
		return $wnd.cleanObject(this.identServiceCode);
	}-*/;
	public final native  void setIdentServiceCode(IdentServiceCode identServiceCode)/*-{
		this.identServiceCode = identServiceCode;
	}-*/;
	public final native  IdentPrevServiceCode getIdentPrevServiceCode()/*-{
		return $wnd.cleanObject(this.identPrevServiceCode);
	}-*/;
	public final native  void setIdentPrevServiceCode(IdentPrevServiceCode identPrevServiceCode)/*-{
		this.identPrevServiceCode = identPrevServiceCode;
	}-*/;
	public final native  JsArray<IdentVerifyMethod> getIdentVerifyMethod()/*-{
		return $wnd.cleanObject(this.identVerifyMethod);
	}-*/;
	public final native  void setIdentVerifyMethod(JsArray<IdentVerifyMethod> identVerifyMethod)/*-{
		this.identVerifyMethod = identVerifyMethod;
	}-*/;
	public final native  JsArray<IdentVerifyEntity> getIdentVerifyEntity()/*-{
		return $wnd.cleanObject(this.identVerifyEntity);
	}-*/;
	public final native  void setIdentVerifyEntity(JsArray<IdentVerifyEntity> identVerifyEntity)/*-{
		this.identVerifyEntity = identVerifyEntity;
	}-*/;
	public final native  JsArray<IdentConditions> getIdentConditions()/*-{
		return $wnd.cleanObject(this.identConditions);
	}-*/;
	public final native  void setIdentConditions(JsArray<IdentConditions> identConditions)/*-{
		this.identConditions = identConditions;
	}-*/;
	public final native  JsArray<IdentVerifyResults> getIdentVerifyResults()/*-{
		return $wnd.cleanObject(this.identVerifyResults);
	}-*/;
	public final native  void setIdentVerifyResults(JsArray<IdentVerifyResults> identVerifyResults)/*-{
		this.identVerifyResults = identVerifyResults;
	}-*/;	
}
