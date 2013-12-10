package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class ExchangeRate extends IFXObject {

	protected ExchangeRate(){
	}
	
	public final native  ExchRate getExchRate()/*-{
		return $wnd.cleanObject(this.exchRate);
	}-*/;
	public final native  void setExchRate(ExchRate exchRate)/*-{
		this.exchRate = exchRate;
	}-*/;
	public final native  BaseCurCode getBaseCurCode()/*-{
		return $wnd.cleanObject(this.baseCurCode);
	}-*/;
	public final native  void setBaseCurCode(BaseCurCode baseCurCode)/*-{
		this.baseCurCode = baseCurCode;
	}-*/;
	public final native  ContraCurCode getContraCurCode()/*-{
		return $wnd.cleanObject(this.contraCurCode);
	}-*/;
	public final native  void setContraCurCode(ContraCurCode contraCurCode)/*-{
		this.contraCurCode = contraCurCode;
	}-*/;
	public final native  ExchConvertRule getExchConvertRule()/*-{
		return $wnd.cleanObject(this.exchConvertRule);
	}-*/;
	public final native  void setExchConvertRule(ExchConvertRule exchConvertRule)/*-{
		this.exchConvertRule = exchConvertRule;
	}-*/;
	public final native  ExchRatePrecision getExchRatePrecision()/*-{
		return $wnd.cleanObject(this.exchRatePrecision);
	}-*/;
	public final native  void setExchRatePrecision(ExchRatePrecision exchRatePrecision)/*-{
		this.exchRatePrecision = exchRatePrecision;
	}-*/;
	public final native  ExchRateInvertPrec getExchRateInvertPrec()/*-{
		return $wnd.cleanObject(this.exchRateInvertPrec);
	}-*/;
	public final native  void setExchRateInvertPrec(ExchRateInvertPrec exchRateInvertPrec)/*-{
		this.exchRateInvertPrec = exchRateInvertPrec;
	}-*/;
	public final native  ExchMktConvertRule getExchMktConvertRule()/*-{
		return $wnd.cleanObject(this.exchMktConvertRule);
	}-*/;
	public final native  void setExchMktConvertRule(ExchMktConvertRule exchMktConvertRule)/*-{
		this.exchMktConvertRule = exchMktConvertRule;
	}-*/;
	public final native  ExchMktRatePrecision getExchMktRatePrecision()/*-{
		return $wnd.cleanObject(this.exchMktRatePrecision);
	}-*/;
	public final native  void setExchMktRatePrecision(ExchMktRatePrecision exchMktRatePrecision)/*-{
		this.exchMktRatePrecision = exchMktRatePrecision;
	}-*/;
}
