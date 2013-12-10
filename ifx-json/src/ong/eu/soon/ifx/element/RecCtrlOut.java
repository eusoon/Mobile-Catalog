package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RecCtrlOut extends IFXObject {

	SentRecCount sentRecCount; //Long	Required	Sent Record Count
	MatchedRecCount matchedRecCount; //Long	Optional	Matched Record Count
	RemainRecCount remainRecCount; //Long	Optional	Remaining Record Count
	Cursor cursor; //Aggregate	Optional	Cursor Handle
	Token token; //NC-1024	Optional	Token
	
	public SentRecCount getSentRecCount() {
		return sentRecCount;
	}
	public void setSentRecCount(SentRecCount sentRecCount) {
		this.sentRecCount = sentRecCount;
	}
	public MatchedRecCount getMatchedRecCount() {
		return matchedRecCount;
	}
	public void setMatchedRecCount(MatchedRecCount matchedRecCount) {
		this.matchedRecCount = matchedRecCount;
	}
	public RemainRecCount getRemainRecCount() {
		return remainRecCount;
	}
	public void setRemainRecCount(RemainRecCount remainRecCount) {
		this.remainRecCount = remainRecCount;
	}
	public Cursor getCursor() {
		return cursor;
	}
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
}