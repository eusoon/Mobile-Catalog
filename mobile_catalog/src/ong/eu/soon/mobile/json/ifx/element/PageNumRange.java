package ong.eu.soon.mobile.json.ifx.element;

import ong.eu.soon.mobile.json.ifx.basetypes.IFXObject;

public class PageNumRange extends IFXObject {
	protected PageNumRange(){	
	}
	public final native StartSectName getStartSectName() /*-{
		return $wnd.cleanObject(startSectName);
	}-*/;
	public final native void setStartSectName(StartSectName startSectName) /*-{
		this.startSectName = startSectName;
	}-*/;
	public final native StartPageNum getStartPageNum() /*-{
		return $wnd.cleanObject(startPageNum);
	}-*/;
	public final native void setStartPageNum(StartPageNum startPageNum) /*-{
		this.startPageNum = startPageNum;
	}-*/;
	public final native EndSectName getEndSectName() /*-{
		return $wnd.cleanObject(endSectName);
	}-*/;
	public final native void setEndSectName(EndSectName endSectName) /*-{
		this.endSectName = endSectName;
	}-*/;
	public final native EndPageNum getEndPageNum() /*-{
		return $wnd.cleanObject(endPageNum);
	}-*/;
	public final native void setEndPageNum(EndPageNum endPageNum) /*-{
		this.endPageNum = endPageNum;
	}-*/;
}