package ong.eu.soon.ifx.element;

public enum TrnTypeSource {
	BAI("BAI"), IFX("IFX"), ISO8583_1993("ISO8583:1993"), ISO8583_2003("ISO8583:2003"), TMA("TMA");
	private String value;
	private TrnTypeSource(String value){
		this.value=value;
	}
}