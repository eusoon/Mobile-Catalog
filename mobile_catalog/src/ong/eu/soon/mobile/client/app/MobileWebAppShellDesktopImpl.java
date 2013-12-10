package ong.eu.soon.mobile.client.app;
import ong.eu.soon.mobile.client.desktop.MobileWebAppShellDesktop;
import ong.eu.soon.mobile.client.desktop.SplashDesktop;

import com.google.gwt.user.client.ui.Widget;


public class MobileWebAppShellDesktopImpl implements MobileWebAppShellClientFactory {
	
	private MobileWebAppShell shell;
	private Widget splash;


	@Override
	public MobileWebAppShell getShell() {
		 if (shell == null) {
		      shell = createShell();
		    }
		    return shell;

	}
	@Override
	public Widget getSplash() {
		 if (splash == null) {
			 splash = createSplash();
		    }
		    return splash;

	}
	
	 /**
	   * Create the application UI shell.
	   * 
	   * @return the UI shell
	   */
	  protected MobileWebAppShell createShell() {
	    
	    return new MobileWebAppShellDesktop();
	  }
	  
	  protected Widget createSplash() {
		    
		    return new SplashDesktop();
	  }
	 
}
