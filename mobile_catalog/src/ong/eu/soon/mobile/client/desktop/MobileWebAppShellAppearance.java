package ong.eu.soon.mobile.client.desktop;

import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public interface MobileWebAppShellAppearance {
	
	public interface MobileWebAppShellCss extends CssResource {
		String main();

	    String menu();

	    String content();
	  }

	  public UiBinder<Widget, MobileWebAppShellDesktop> uiBinder();

	  public MobileWebAppShellCss css();

}
