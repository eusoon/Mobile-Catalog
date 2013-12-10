package ong.eu.soon.ifx.element;


public class SvcKeys extends BaseKeys {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	//begin-xor Required 
	SvcId svcId;//Identifier	Required Service Identifier
	SvcName svcName;//C-32	RequiredService Name. Must be unique in the Service Provider.
	//end-xor
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public SvcId getSvcId() {
		return svcId;
	}
	public void setSvcId(SvcId svcId) {
		this.svcId = svcId;
	}
	public SvcName getSvcName() {
		return svcName;
	}
	public void setSvcName(SvcName svcName) {
		this.svcName = svcName;
	}
}
