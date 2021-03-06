package ong.eu.soon.ifx.element.USA;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class TaxIdCert extends IFXObject {
	TaxIdCertCode taxIdCertCode;//Open Enum	Optional USA TaxId Certification Code Valid values include: AccountOpenBefore1984, AccountOpened1984-1987, AccountOpenedAfter1987, Certified, CertNotOnFile, CertNotRequired, CertOnFile, IRSMandatedWithholding, Notice1, Notice2, Uncertified
	TaxIdCertDate taxIdCertDate;//Date	Optional USA TaxId Certification Date
	public TaxIdCertCode getTaxIdCertCode() {
		return taxIdCertCode;
	}
	public void setTaxIdCertCode(TaxIdCertCode taxIdCertCode) {
		this.taxIdCertCode = taxIdCertCode;
	}
	public TaxIdCertDate getTaxIdCertDate() {
		return taxIdCertDate;
	}
	public void setTaxIdCertDate(TaxIdCertDate taxIdCertDate) {
		this.taxIdCertDate = taxIdCertDate;
	}

}
