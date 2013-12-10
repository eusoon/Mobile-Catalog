package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class QuestionAnswer extends IFXObject {
	protected QuestionAnswer(){	
	}
	public final native QuestionIdent getQuestionIdent() /*-{
		return $wnd.cleanObject(questionIdent);
	}-*/;
	public final native void setQuestionIdent(QuestionIdent questionIdent) /*-{
		this.questionIdent = questionIdent;
	}-*/;
	public final native Question getQuestion() /*-{
		return $wnd.cleanObject(question);
	}-*/;
	public final native void setQuestion(Question question) /*-{
		this.question = question;
	}-*/;
	public final native Selection getSelection() /*-{
		return $wnd.cleanObject(selection);
	}-*/;
	public final native void setSelection(Selection selection) /*-{
		this.selection = selection;
	}-*/;
	public final native Answer getAnswer() /*-{
		return $wnd.cleanObject(answer);
	}-*/;
	public final native void setAnswer(Answer answer) /*-{
		this.answer = answer;
	}-*/;
}