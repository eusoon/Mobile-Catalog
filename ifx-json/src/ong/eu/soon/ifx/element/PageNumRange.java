package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class PageNumRange extends IFXObject {
	StartSectName startSectName;//C-40	Optional Start Section Name
	StartPageNum startPageNum;//Long	Optional Start Page Number
	EndSectName endSectName;//C-40	Optional End Section Name
	EndPageNum endPageNum;//Long	Optional End Page Number
	public StartSectName getStartSectName() {
		return startSectName;
	}
	public void setStartSectName(StartSectName startSectName) {
		this.startSectName = startSectName;
	}
	public StartPageNum getStartPageNum() {
		return startPageNum;
	}
	public void setStartPageNum(StartPageNum startPageNum) {
		this.startPageNum = startPageNum;
	}
	public EndSectName getEndSectName() {
		return endSectName;
	}
	public void setEndSectName(EndSectName endSectName) {
		this.endSectName = endSectName;
	}
	public EndPageNum getEndPageNum() {
		return endPageNum;
	}
	public void setEndPageNum(EndPageNum endPageNum) {
		this.endPageNum = endPageNum;
	}
}