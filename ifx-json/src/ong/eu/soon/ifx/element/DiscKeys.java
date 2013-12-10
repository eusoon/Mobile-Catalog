package ong.eu.soon.ifx.element;

public class DiscKeys extends BaseKeys {
	SvcIdent svcIdent;//Aggregate	Optional Service Identifier
	//begin-xor Required 
	DiscId discId;//	Identifier		Required	Disclosure Identifier
	DiscIdent discIdent;//Aggregate	Required Disclosure Identifier
	//end-xor
	public SvcIdent getSvcIdent() {
		return svcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		this.svcIdent = svcIdent;
	}
	public DiscId getDiscId() {
		return discId;
	}
	public void setDiscId(DiscId discId) {
		this.discId = discId;
	}
	public DiscIdent getDiscIdent() {
		return discIdent;
	}
	public void setDiscIdent(DiscIdent discIdent) {
		this.discIdent = discIdent;
	}

}