package ong.eu.soon.ifx.element;

import ong.eu.soon.ifx.basetypes.IFXObject;

public class CardMagData extends IFXObject {
 
	MagData1 MagData1;//NC-79	Required Track 1 data
	MagData2 MagData2;//NC-40	Required Track 2 data
	MagData3 MagData3;//NC-107	Required Track 3 data
	public MagData1 getMagData1() {
		return MagData1;
	}
	public void setMagData1(MagData1 magData1) {
		MagData1 = magData1;
	}
	public MagData2 getMagData2() {
		return MagData2;
	}
	public void setMagData2(MagData2 magData2) {
		MagData2 = magData2;
	}
	public MagData3 getMagData3() {
		return MagData3;
	}
	public void setMagData3(MagData3 magData3) {
		MagData3 = magData3;
	}

}
