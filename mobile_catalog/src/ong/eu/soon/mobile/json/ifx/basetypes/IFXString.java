package ong.eu.soon.mobile.json.ifx.basetypes;

/**
 * The IFXString class models the xsd:string datatype.
 * @author Ong Eu Soon (eusoob@gmail.com)
 * @version $Revision: 2.3 $
 */
public class IFXString extends IFXObject implements IBaseType {
	protected IFXString(){	
	}
	@Override
	public final native  void setString(String s) /*-{
		this.string = string;
	}-*/;

	@Override
	public  final native String getString() /*-{
    	return $wnd.cleanString(this.string);
	}-*/;
}
