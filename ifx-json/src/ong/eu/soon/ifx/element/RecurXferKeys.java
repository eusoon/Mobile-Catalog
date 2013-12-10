package ong.eu.soon.ifx.element;

public class RecurXferKeys extends BaseKeys {
	SvcIdent SvcIdent;//Aggregate	Optional Service Identifier
	//begin-xor Required 
	RecurXferId recurXferId;//Identifier	Required Recurring Transfer Identifier
	//end-xor
	public SvcIdent getSvcIdent() {
		return SvcIdent;
	}
	public void setSvcIdent(SvcIdent svcIdent) {
		SvcIdent = svcIdent;
	}
	public RecurXferId getRecurXferId() {
		return recurXferId;
	}
	public void setRecurXferId(RecurXferId recurXferId) {
		this.recurXferId = recurXferId;
	}

}
