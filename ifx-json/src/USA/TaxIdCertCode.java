package USA;

public enum TaxIdCertCode {
	
	AccountOpenBefore1984("AccountOpenBefore1984"), AccountOpened1984_1987("AccountOpened1984-1987"), AccountOpenedAfter1987("AccountOpenedAfter1987"), Certified("Certified"), CertNotOnFile("CertNotOnFile"), CertNotRequired("CertNotRequired"), CertOnFile("CertOnFile"), IRSMandatedWithholding("IRSMandatedWithholding"), Notice1("Notice1"), Notice2("Notice2"), Uncertified("Uncertified");
	private String value;
	private TaxIdCertCode(String value){
		this.value=value;
		
	}
}
