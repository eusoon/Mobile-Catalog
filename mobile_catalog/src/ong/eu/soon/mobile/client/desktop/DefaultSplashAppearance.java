package ong.eu.soon.mobile.client.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

public class DefaultSplashAppearance implements SplashAppearance {
	
	private static SplashUiBinder uiBinder = GWT.create(SplashUiBinder.class);

	@UiTemplate("DefaultMobileWebAppShell.ui.xml")
	  interface SplashUiBinder extends UiBinder<Widget, SplashDesktop> {
	  }

	  public interface Resource extends ClientBundle {

	    public static Resource INSTANCE = GWT.create(Resource.class);

	    @Source("splash.css")
	    public SplashCss css();
	    
	    @Source("../ui/icons/splash.png")
		ImageResource splash();
	    
	    @Source("../ui/icons/hdpi/splash.png")
		ImageResource splashHdpi();
	    
	    @Source("../ui/icons/xhdpi/splash.png")
		ImageResource splashXhdpi();
	  }
	  
	  static {
		    Resource.INSTANCE.css().ensureInjected();
		  }
	  
	@Override
	public UiBinder<Widget, SplashDesktop> uiBinder() {
		return uiBinder;
	}

	@Override
	public SplashCss css() {
		return Resource.INSTANCE.css();
	}

}
