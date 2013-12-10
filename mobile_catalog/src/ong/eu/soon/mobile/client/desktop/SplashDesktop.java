package ong.eu.soon.mobile.client.desktop;

import ong.eu.soon.mobile.client.help.OrientationHelper;
import ong.eu.soon.mobile.client.help.WindowBasedOrientationHelper;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Composite;

public class SplashDesktop extends Composite {

	private final static OrientationHelper orientationHelper = new WindowBasedOrientationHelper();

	private static final SplashAppearance APPEARANCE = GWT
			.create(SplashAppearance.class);

	
	@UiField(provided = true)
	protected final SplashAppearance appearance;
	
	ImageResource imageResource;

	public SplashDesktop() {
		this(APPEARANCE, orientationHelper);
	}

	public SplashDesktop(SplashAppearance appearance,
			OrientationHelper orientationHelper) {
		this.appearance = appearance;

		initWidget(appearance.uiBinder().createAndBindUi(this));
		orientationHelper.setCommands(this, new Command() {
			@Override
			public void execute() {
				onShiftToPortrait();
			}
		}, new Command() {
			@Override
			public void execute() {
				onShiftToLandscape();
			}

		});

	}

	protected void onShiftToPortrait() {
		// TODO Auto-generated method stub

	}

	private void onShiftToLandscape() {
		// TODO Auto-generated method stub

	}

	
}
