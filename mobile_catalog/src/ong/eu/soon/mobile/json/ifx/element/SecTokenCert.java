package ong.eu.soon.mobile.json.ifx.element;

public class SecTokenCert extends SecToken {

	protected SecTokenCert(){	
	}
	
	public final native  Certificate getCertificate()/*-{
		return $wnd.cleanObject(this.certificate);
	}-*/;

	public final native  void setCertificate(Certificate certificate)/*-{
		this.certificate = certificate;
	}-*/;

}
