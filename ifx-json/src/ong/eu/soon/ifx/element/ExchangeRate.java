package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class ExchangeRate extends IFXObject {
	ExchRate exchRate;//Decimal	Required Currency Exchange Rate
	BaseCurCode baseCurCode;//AggregateOptional Base Currency Code
	ContraCurCode contraCurCode;//Aggregate	Optional Contra Currency Code
	ExchConvertRule exchConvertRule;//Closed Enum	Optional Exchange Convert Rule
	//Valid values are limited to: Direct, Indirect
	ExchRatePrecision exchRatePrecision;//Long	Optional Exchange Rate Precision
	ExchRateInvertPrec exchRateInvertPrec;//Long	Optional Exchange Rate Inverted Precision
	ExchMktConvertRule exchMktConvertRule;//Closed Enum	Optional Market Currency Conversion Indicator
	//Valid values are limited to: Direct, Indirect
	ExchMktRatePrecision exchMktRatePrecision;//Long	Optional Exchange Market Rate Precision
	public ExchRate getExchRate() {
		return exchRate;
	}
	public void setExchRate(ExchRate exchRate) {
		this.exchRate = exchRate;
	}
	public BaseCurCode getBaseCurCode() {
		return baseCurCode;
	}
	public void setBaseCurCode(BaseCurCode baseCurCode) {
		this.baseCurCode = baseCurCode;
	}
	public ContraCurCode getContraCurCode() {
		return contraCurCode;
	}
	public void setContraCurCode(ContraCurCode contraCurCode) {
		this.contraCurCode = contraCurCode;
	}
	public ExchConvertRule getExchConvertRule() {
		return exchConvertRule;
	}
	public void setExchConvertRule(ExchConvertRule exchConvertRule) {
		this.exchConvertRule = exchConvertRule;
	}
	public ExchRatePrecision getExchRatePrecision() {
		return exchRatePrecision;
	}
	public void setExchRatePrecision(ExchRatePrecision exchRatePrecision) {
		this.exchRatePrecision = exchRatePrecision;
	}
	public ExchRateInvertPrec getExchRateInvertPrec() {
		return exchRateInvertPrec;
	}
	public void setExchRateInvertPrec(ExchRateInvertPrec exchRateInvertPrec) {
		this.exchRateInvertPrec = exchRateInvertPrec;
	}
	public ExchMktConvertRule getExchMktConvertRule() {
		return exchMktConvertRule;
	}
	public void setExchMktConvertRule(ExchMktConvertRule exchMktConvertRule) {
		this.exchMktConvertRule = exchMktConvertRule;
	}
	public ExchMktRatePrecision getExchMktRatePrecision() {
		return exchMktRatePrecision;
	}
	public void setExchMktRatePrecision(ExchMktRatePrecision exchMktRatePrecision) {
		this.exchMktRatePrecision = exchMktRatePrecision;
	}












}
