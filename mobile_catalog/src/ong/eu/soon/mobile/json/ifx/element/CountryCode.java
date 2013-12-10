package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class CountryCode extends IFXObject {
	
	protected CountryCode(){
	}
	
	public final native  CountryCodeSource getCountryCodeSource()/*-{
		return $wnd.cleanObject(countryCodeSource);
	}-*/;
	public final native  void setCountryCodeSource(CountryCodeSource countryCodeSource)/*-{
		this.countryCodeSource = countryCodeSource;
	}-*/;
	public final native  CountryCodeValue getCountryCodeValue()/*-{
		return $wnd.cleanObject(countryCodeValue);
	}-*/;
	public final native  void setCountryCodeValue(CountryCodeValue countryCodeValue)/*-{
		this.countryCodeValue = countryCodeValue;
	}-*/;
}
