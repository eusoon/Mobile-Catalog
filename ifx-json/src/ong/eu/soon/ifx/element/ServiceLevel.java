package ong.eu.soon.ifx.element;

public enum ServiceLevel {
	Gold("Gold"), Silver("Silver"), Platinum("Platinum") , FirstClass("First Class"), BusinessClass("Business Class"),  Coach("Coach");
	private String value;
	private ServiceLevel(String value){
		this.value=value;
	}
}