package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class POSAgent extends IFXObject {
	AgentType agentType;	 //	Open Enum	 Optional	 The type of agent that assisted the customer creating this message.Valid values: Unknown, Clerk, Manager, IndependentAgent, AuthorizedAgentDefault value: Clerk
	AgentIdent agentIdent;	 //	NC-36	 Optional	 The identification of the agent of the card acceptor that attended the service device while this message was created. This will usually be the Id of a clerk or similar employee of the card acceptor.
	public AgentType getAgentType() {
		return agentType;
	}
	public void setAgentType(AgentType agentType) {
		this.agentType = agentType;
	}
	public AgentIdent getAgentIdent() {
		return agentIdent;
	}
	public void setAgentIdent(AgentIdent agentIdent) {
		this.agentIdent = agentIdent;
	}
}
