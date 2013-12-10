package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class RelationshipMgr extends IFXObject {
	protected RelationshipMgr(){	
	}
	public final native RelationshipMgrIdent getRelationshipMgrIdent() /*-{
		return $wnd.cleanObject(relationshipMgrIdent);
	}-*/;
	public final native void setRelationshipMgrIdent(RelationshipMgrIdent relationshipMgrIdent) /*-{
		this.relationshipMgrIdent = relationshipMgrIdent;
	}-*/;
	public final native Desc getDesc() /*-{
		return $wnd.cleanObject(desc);
	}-*/;
	public final native void setDesc(Desc desc) /*-{
		this.desc = desc;
	}-*/;
	public final native RelationshipRole getRelationshipRole() /*-{
		return $wnd.cleanObject(relationshipRole);
	}-*/;
	public final native void setRelationshipRole(RelationshipRole relationshipRole) /*-{
		this.relationshipRole = relationshipRole;
	}-*/;

}