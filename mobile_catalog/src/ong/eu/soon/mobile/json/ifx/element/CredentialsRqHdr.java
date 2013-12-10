package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

import com.google.gwt.core.client.JsArray;


public class CredentialsRqHdr extends IFXObject {

	protected CredentialsRqHdr(){	
	}
	
	public final native  SubjectRole getSubjectRole()/*-{
		return $wnd.cleanObject(this.subjectRole);
	}-*/;
	public final native  void setSubjectRole(SubjectRole subjectRole)/*-{
		this.subjectRole = subjectRole;
	}-*/;
	public final native  StartSession getStartSession()/*-{
		return $wnd.cleanObject(this.startSession);
	}-*/;
	public final native  void setStartSession(StartSession startSession)/*-{
		this.startSession = startSession;
	}-*/;
	public final native  PartyRef getPartyRef()/*-{
		return $wnd.cleanObject(this.partyRef);
	}-*/;
	public final native  void setPartyRef(PartyRef partyRef)/*-{
		this.partyRef = partyRef;
	}-*/;
	public final native  SeqNum getSeqNum()/*-{
		return $wnd.cleanObject(this.seqNum);
	}-*/;
	public final native  void setSeqNum(SeqNum seqNum)/*-{
		this.seqNum = seqNum;
	}-*/;
	public final native  JsArray<SecToken> getSecToken()/*-{
		return $wnd.cleanObject(this.secToken);
	}-*/;
	public final native  void setSecToken(JsArray<SecToken> secToken)/*-{
		this.secToken = secToken;
	}-*/;
	public final native  OvrdExceptionCode getOvrdExceptionCode()/*-{
		return $wnd.cleanObject(this.ovrdExceptionCode);
	}-*/;
	public final native  void setOvrdExceptionCode(OvrdExceptionCode ovrdExceptionCode)/*-{
		this.ovrdExceptionCode = ovrdExceptionCode;
	}-*/;
}
