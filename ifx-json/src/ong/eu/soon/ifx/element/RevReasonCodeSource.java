package ong.eu.soon.ifx.element;

public enum RevReasonCodeSource {
	ISO8583_1993AnnexA_11("8583:1993AnnexA.11");
	private String value;
	private RevReasonCodeSource(String value){
		this.value=value;
	}
}
