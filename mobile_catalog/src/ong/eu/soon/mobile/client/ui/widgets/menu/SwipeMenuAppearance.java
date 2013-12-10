package ong.eu.soon.mobile.client.ui.widgets.menu;

import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public interface SwipeMenuAppearance {
	
	public interface SwipeMenuCss extends CssResource {
	    String main();

	    String wrap();

	    String menu();

	    String content();

	    String opened();

	    String closed();
	  }

	  public UiBinder<Widget, SwipeMenu> uiBinder();

	  public SwipeMenuCss css();

}
