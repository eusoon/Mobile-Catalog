package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;
public class CredentialsRsHdr extends IFXObject {
	Status status;//Aggregate	Optional Response Status
	SeqNum seqNum;//Long	Optional Sequence number
	SessKey sessKey;//NC-64	Optional A token supplied by a server on request to use as credential in multiple message or operation requests during a client session, instead of providing the full credentials in each request.
	ExpDt expDt;//DateTime	Optional Expiration Date
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public SeqNum getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(SeqNum seqNum) {
		this.seqNum = seqNum;
	}
	public SessKey getSessKey() {
		return sessKey;
	}
	public void setSessKey(SessKey sessKey) {
		this.sessKey = sessKey;
	}
	public ExpDt getExpDt() {
		return expDt;
	}
	public void setExpDt(ExpDt expDt) {
		this.expDt = expDt;
	}

}
