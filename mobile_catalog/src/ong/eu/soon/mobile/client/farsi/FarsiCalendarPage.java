package ong.eu.soon.mobile.client.farsi;

import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;

import com.bigoloo.gwt.jalaliwidget.client.JalaliDateBox;
import com.bigoloo.gwt.jalaliwidget.client.JalaliDatePicker;
import com.google.gwt.user.client.ui.Widget;


public class FarsiCalendarPage extends Page{
	private SquarePanel container;
	@Override
	public String getHeading() {

		return "Farsi Calendar";
	}

	@Override
	public Widget initialize() {
		container = new SquarePanel(true);
		container.setVisible(false);
		JalaliDatePicker dp=new JalaliDatePicker();
        JalaliDateBox jalaliDateBox=new JalaliDateBox();
        container.add(dp);
        container.add(jalaliDateBox);
		return container;
	}
	

}
