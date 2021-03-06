package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CredentialsRqHdr extends IFXObject {
	SubjectRole subjectRole;//Open Enum	Required Subject Role Valid values include: Anonymous, CSR, Party, PartyRep, Supervisor, System
	StartSession startSession;//Boolean	Optional Start Session
	PartyRef partyRef;//Aggregate	Optional Identifies the Party, if the party cannot be identified by the security token but identification of the party is required. This is usually used in situations when a CSR acts on behalf of a party
	SeqNum seqNum;//Long	Optional Sequence number of the credential. This is required if multiple <CredentialRqHdr>s are in the request header.
	SecToken[] secToken; //Abstract Aggregate	  Optional RepeatingSecurity Token	
	//Valid Aggregates are: SecTokenCard,SecTokenCert,SecTokenICC,SecTokenIssuedIdent,SecTokenKey,SecTokenLogin,SecTokenMagCard,SecTokenObject,SecTokenParty,SecTokenSecretAnswer

	OvrdExceptionCode ovrdExceptionCode;
	public SubjectRole getSubjectRole() {
		return subjectRole;
	}
	public void setSubjectRole(SubjectRole subjectRole) {
		this.subjectRole = subjectRole;
	}
	public StartSession getStartSession() {
		return startSession;
	}
	public void setStartSession(StartSession startSession) {
		this.startSession = startSession;
	}
	public PartyRef getPartyRef() {
		return partyRef;
	}
	public void setPartyRef(PartyRef partyRef) {
		this.partyRef = partyRef;
	}
	public SeqNum getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(SeqNum seqNum) {
		this.seqNum = seqNum;
	}
	public SecToken[] getSecToken() {
		return secToken;
	}
	public void setSecToken(SecToken[] secToken) {
		this.secToken = secToken;
	}
	public OvrdExceptionCode getOvrdExceptionCode() {
		return ovrdExceptionCode;
	}
	public void setOvrdExceptionCode(OvrdExceptionCode ovrdExceptionCode) {
		this.ovrdExceptionCode = ovrdExceptionCode;
	}




}
