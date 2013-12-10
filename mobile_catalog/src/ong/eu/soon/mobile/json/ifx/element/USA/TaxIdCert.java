package ong.eu.soon.mobile.json.ifx.element.USA;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class TaxIdCert extends IFXObject {
	protected TaxIdCert(){	
	}
	public final native  TaxIdCertCode getTaxIdCertCode()/*-{
		return $wnd.cleanObject(this.taxIdCertCode);
	}-*/;
	public final native  void setTaxIdCertCode(TaxIdCertCode taxIdCertCode)/*-{
		this.taxIdCertCode = taxIdCertCode;
	}-*/;
	public final native  TaxIdCertDate getTaxIdCertDate()/*-{
		return $wnd.cleanObject(this.taxIdCertDate);
	}-*/;
	public final native  void setTaxIdCertDate(TaxIdCertDate taxIdCertDate)/*-{
		this.taxIdCertDate = taxIdCertDate;
	}-*/;

}
