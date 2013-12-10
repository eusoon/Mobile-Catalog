/*
   This file is part of Cyclos.

   Cyclos is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.

   Cyclos is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with Cyclos; if not, write to the Free Software
   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package ong.eu.soon.mobile.client;

import ong.eu.soon.mobile.client.model.AppState;
import ong.eu.soon.mobile.client.model.GeneralData;
import ong.eu.soon.mobile.client.model.ServiceProvider;
import ong.eu.soon.mobile.client.ui.MainLayout;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.utils.ErrorHandler;
import ong.eu.soon.mobile.client.utils.Storage;
import ong.eu.soon.mobile.client.utils.StringHelper;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;

/**
 * Entry point for the Cyclos mobile application.
 * 
 * @author luis
 */
public class InfoproMobile implements EntryPoint {

	private static InfoproMobile instance;

	public static InfoproMobile get() {
		return instance;
	}

	private static MainLayout mainLayout;
	private GeneralData generalData;
	private JsArray<ServiceProvider> serviceProvidersData;
	private PhoneGap phoneGap;

	/**
	 * This field gets compiled out when <code>log_level=OFF</code>, or any
	 * <code>log_level</code> higher than <code>DEBUG</code>.
	 */
	private long startTimeMillis;

	/**
	 * Returns the current application state
	 */
	public AppState getAppState() {
		if (!Configuration.get().isServerConfigured()) {
			return AppState.SERVER_NOT_CONFIGURED;
		} else if (generalData == null) {
			return AppState.SERVER_DATA_NOT_LOADED;
		} else if (!LoggedUser.get().isLoggedIn()) {
			return AppState.NO_LOGGED_USER;
		}
		return AppState.READY;
	}

	/**
	 * Returns application general data retrieved in rest service
	 */
	public GeneralData getGeneralData() {
		return generalData;
	}

	/**
	 * Returns application service provider data retrieved in rest service
	 */
	public JsArray<ServiceProvider> getServiceProviders() {
		return serviceProvidersData;
	}

	/**
	 * Returns main layout which holds the application's visual elements
	 */
	public MainLayout getMainLayout() {
		return mainLayout;
	}

	/**
	 * Returns PhoneGapp component
	 */
	public PhoneGap getPhoneGap() {
		return phoneGap;
	}

	@Override
	public void onModuleLoad() {
		instance = this;
		/*
		 * Install an UncaughtExceptionHandler which will produce
		 * <code>FATAL</code> log messages
		 */
		Log.setUncaughtExceptionHandler();

		// use deferred command to catch initialization exceptions in
		// onModuleLoad2
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			@Override
			public void execute() {
				onModuleLoad2();
			}
		});
		initApplication();
	}

	/**
	 * Deferred initialization method, used by {@link #onModuleLoad()}.
	 */
	private void onModuleLoad2() {
		/*
		 * Use a <code>if (Log.isDebugEnabled()) {...}</code> guard to ensure
		 * that <code>System.currentTimeMillis()</code> is compiled out when
		 * <code>log_level=OFF</code>, or any <code>log_level</code> higher than
		 * <code>DEBUG</code>.
		 */
		if (Log.isDebugEnabled()) {
			startTimeMillis = System.currentTimeMillis();
		}

		/*
		 * No guards necessary. Code will be compiled out when
		 * <code>log_level=OFF</code>
		 */
		Log.debug("This is a 'DEBUG' test message");
		Log.info("This is a 'INFO' test message");
		Log.warn("This is a 'WARN' test message");
		Log.error("This is a 'ERROR' test message");
		Log.fatal("This is a 'FATAL' test message");

		Log.fatal("This is what an exception might look like",
				new RuntimeException("2 + 2 = 5"));

		Log.debug("foo.bar.baz", "Using logging categories", (Exception) null);

		/*
		 * Again, we need a guard here, otherwise <code>log_level=OFF</code>
		 * would still produce the following useless JavaScript: <pre> var
		 * durationSeconds, endTimeMillis; endTimeMillis =
		 * currentTimeMillis_0(); durationSeconds = (endTimeMillis -
		 * this$static.startTimeMillis) / 1000.0; </pre>
		 */
		if (Log.isDebugEnabled()) {
			long endTimeMillis = System.currentTimeMillis();
			float durationSeconds = (endTimeMillis - startTimeMillis) / 1000F;
			Log.debug("Duration: " + durationSeconds + " seconds");
		}
	}

	/**
	 * Initializes the mobile application
	 */
	private void initApplication() {

		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			@Override
			public void onUncaughtException(Throwable e) {
				ErrorHandler.handle(e);
			}
		});

		phoneGap = GWT.create(PhoneGap.class);
		phoneGap.addHandler(new PhoneGapAvailableHandler() {
			@Override
			public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {

				String splash = Storage.get().getItem("splash");

				// If there is no splash screen available to display, start the
				// application
				if (StringHelper.isEmpty(splash)) {
					startApplication();
				} else {
					// Wait for the splash screen
					Timer t = new Timer() {
						@Override
						public void run() {
							startApplication();
						}
					};
					t.schedule(2000);
				}
			}
		});

		phoneGap.addHandler(new PhoneGapTimeoutHandler() {
			@Override
			public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
				throw new IllegalStateException(Messages.Accessor.get()
						.loadingApplicationError());
			}
		});
		phoneGap.initializePhoneGap(30 * 1000); // 30 seconds
	}

	/**
	 * Sets application general data
	 */
	public void setGeneralData(GeneralData generalData) {
		this.generalData = generalData;
	}

	/**
	 * Sets application general data
	 */
	public void setServiceProviders(JsArray<ServiceProvider> result) {
		this.serviceProvidersData = result;
	}

	/**
	 * Initialize main layout and starts application
	 */
	private void startApplication() {

		// Override opaque class and set principal class
		RootPanel.getBodyElement().setClassName("principal");

		// Remove loading element
		Element loading = DOM.getElementById("loading");
		if (loading != null) {
			DOM.removeChild(RootPanel.getBodyElement(), loading);
		}

		mainLayout = new MainLayout();
		mainLayout.apply(RootPanel.get());

		loadInitialPage();
	}

	/**
	 * Load initial page
	 */
	private void loadInitialPage() {
		switch (getAppState()) {
		case SERVER_NOT_CONFIGURED:
			Navigation.get().goNoHistory(PageAnchor.CONFIGURATION);
			break;
		case SERVER_DATA_NOT_LOADED:
			Navigation.get().goNoHistory(PageAnchor.LOAD_GENERAL_DATA);
			break;
		default:
			Navigation.get().loadInitialPage();
		}
	}

	/**
	 * Reloads the application
	 */
	public native void reloadApplication() /*-{
		$wnd.reloadApp();
	}-*/;

}
