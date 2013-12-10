package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class RelationshipMgr extends IFXObject {
	RelationshipMgrIdent relationshipMgrIdent; //NC-36	Required Relationship Manager Identifier
	Desc desc; //C-80	Optional Description
	RelationshipRole relationshipRole; //C-40	Optional Relationship Role
	public RelationshipMgrIdent getRelationshipMgrIdent() {
		return relationshipMgrIdent;
	}
	public void setRelationshipMgrIdent(RelationshipMgrIdent relationshipMgrIdent) {
		this.relationshipMgrIdent = relationshipMgrIdent;
	}
	public Desc getDesc() {
		return desc;
	}
	public void setDesc(Desc desc) {
		this.desc = desc;
	}
	public RelationshipRole getRelationshipRole() {
		return relationshipRole;
	}
	public void setRelationshipRole(RelationshipRole relationshipRole) {
		this.relationshipRole = relationshipRole;
	}

}
