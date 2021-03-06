package ong.eu.soon.ifx.element;

public enum CryptType {
	ACBC("ACBC"), ACFB("ACFB"), ACM("ACM"), AECB("AECB"), AOFB("AOFB"), CBC("CBC"), CFB("CFB"), ECB("ECB"), None("None"), OFB("OFB"), PKCS1("PKCS#1"), PKCS10("PKCS#10"), PKCS7(" PKCS#7"), RSA1("RSA#1"), TCBC("TCBC"), TCBC_I("TCBC-I"), TCFB("TCFB"), TCFB_P("TCFB-P"), TECB("TECB"), TOFB("TOFB"), TOFB_I("TOFB-I"), TR_31("TR-31"), BASE64("BASE64");
	
	String value;
	private CryptType(String value){
		this.value=value;
	}
}
