package ong.eu.soon.mobile.client.ui.widgets.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

public class DefaultSwipeMenuAppearance implements SwipeMenuAppearance {
	
	private static SwipeMenuUiBinder uiBinder = GWT.create(SwipeMenuUiBinder.class);

	@UiTemplate("DefaultSwipeMenu.ui.xml")
	  interface SwipeMenuUiBinder extends UiBinder<Widget, SwipeMenu> {
	  }

	  public interface Resource extends ClientBundle {

	    public static Resource INSTANCE = GWT.create(Resource.class);

	    @Source("swipe-menu.css")
	    public SwipeMenuCss css();
	  }
	  
	  static {
		    Resource.INSTANCE.css().ensureInjected();
		  }
	  
	@Override
	public UiBinder<Widget, SwipeMenu> uiBinder() {
		return uiBinder;
	}

	@Override
	public SwipeMenuCss css() {
		return Resource.INSTANCE.css();
	}

}
