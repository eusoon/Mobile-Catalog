package ong.eu.soon.mobile.client.phone;

import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public interface SplashAppearance {
	
	public interface SplashCss extends CssResource {
		String main();

	    String menu();

	    String content();
	  }

	  public UiBinder<Widget, SplashPhone> uiBinder();

	  public SplashCss css();


}
