package ong.eu.soon.ifx.element;

public enum RegistrationAuthority {
	
	DunAndBradstreet("DunAndBradstreet"), OrgSpecific("OrgSpecific"), USA_TaxId("USA.TaxId");
	private String value;
	private RegistrationAuthority(String value){
		this.value=value;
	}
}
