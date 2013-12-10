package ong.eu.soon.ifx.element;

public enum AcctTypeSource {
	 APACS("APACS"), IFX("IFX"), ISO15022("ISO15022"), ISO20022("ISO20022"), ISO8583_1993(" ISO8583:1993"), ISO8583_2003("ISO8583:2003"), OFX("OFX");
	 
	 private String value;
	 private AcctTypeSource(String value){
		 this.value=value;
	 }
}