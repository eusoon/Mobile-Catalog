package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class NextStmtData extends IFXObject {
	NextStmtDt nextStmtDt;//Date	Optional The anticipated date on which a statement will be generated. When there are multiple dates present they will occur in the order of nearest to farthest chronological date.

	NextDueDt nextDueDt;//Date	Optional The payment due date associated with the NextStmtDt.


}
