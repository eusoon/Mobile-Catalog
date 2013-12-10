package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class POSAgent extends IFXObject {
	protected POSAgent(){	
	}
	public final native AgentType getAgentType() /*-{
		return $wnd.cleanObject(agentType);
	}-*/;
	public final native void setAgentType(AgentType agentType) /*-{
		this.agentType = agentType;
	}-*/;
	public final native AgentIdent getAgentIdent() /*-{
		return $wnd.cleanObject(agentIdent);
	}-*/;
	public final native void setAgentIdent(AgentIdent agentIdent) /*-{
		this.agentIdent = agentIdent;
	}-*/;
}