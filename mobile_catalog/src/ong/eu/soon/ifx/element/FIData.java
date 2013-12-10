package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class FIData extends IFXObject {
	FIIdentType fIIdentType;
	FIIdent fIIdent;
	RefData[] refData;
	Name name;
	BranchIdent branchIdent;
	BranchName branchName;
	PostAddr PostAddr;
	public FIIdentType getFIIdentType() {
		return fIIdentType;
	}
	public void setFIIdentType(FIIdentType fIIdentType) {
		this.fIIdentType = fIIdentType;
	}
	public FIIdent getFIIdent() {
		return fIIdent;
	}
	public void setFIIdent(FIIdent fIIdent) {
		this.fIIdent = fIIdent;
	}
	public RefData[] getRefData() {
		return refData;
	}
	public void setRefData(RefData[] refData) {
		this.refData = refData;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public BranchIdent getBranchIdent() {
		return branchIdent;
	}
	public void setBranchIdent(BranchIdent branchIdent) {
		this.branchIdent = branchIdent;
	}
	public BranchName getBranchName() {
		return branchName;
	}
	public void setBranchName(BranchName branchName) {
		this.branchName = branchName;
	}
	public PostAddr getPostAddr() {
		return PostAddr;
	}
	public void setPostAddr(PostAddr postAddr) {
		PostAddr = postAddr;
	}








}
