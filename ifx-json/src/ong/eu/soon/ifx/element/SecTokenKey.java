package ong.eu.soon.ifx.element;

public class SecTokenKey extends SecToken {
	SessKey sessKey;//NC-64	Required A token supplied by a server on request to use as credential in multiple message or operation requests during a client session, instead of providing the full credentials in each request.

	public SessKey getSessKey() {
		return sessKey;
	}

	public void setSessKey(SessKey sessKey) {
		this.sessKey = sessKey;
	}
}
