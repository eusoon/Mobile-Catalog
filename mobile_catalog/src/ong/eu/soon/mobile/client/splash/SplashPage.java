package ong.eu.soon.mobile.client.splash;

import ong.eu.soon.mobile.client.app.MobileWebAppShellClientFactory;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;


public class SplashPage extends Page {

	 private MobileWebAppShellClientFactory clientFactory = GWT.create(MobileWebAppShellClientFactory.class);
	 
	@Override
	public String getHeading() {
		
		return null;
	}

	@Override
	public Widget initialize() {
		SquarePanel container = new SquarePanel();
		Widget splash=clientFactory.getSplash();
		container.add(splash); 
		return container;
	}

}
