package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class SubjectElement extends IFXObject {
	Path path;//IfxPath	Required Indicates which element is in error. It provides either the path of the element, or just the element name. If it provides the path, it must use IfxPath absolute notation with the starting node being the node of the message, and ending with the name of the element in error. In the event the IfxPath cannot be provided, this provides the name of the element in error.
	Value value;//C-256	Optional The string representation of the data value of the element in error. This field is intended to provide a human readable visual hint as to the value in error. It should not be provided for fields that cannot be represented as a string (i.e., binary data).
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
}
