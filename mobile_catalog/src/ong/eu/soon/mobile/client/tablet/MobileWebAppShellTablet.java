package ong.eu.soon.mobile.client.tablet;

import ong.eu.soon.mobile.client.app.MobileWebAppShell;
import ong.eu.soon.mobile.client.help.OrientationHelper;
import ong.eu.soon.mobile.client.help.WindowBasedOrientationHelper;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.ResizeComposite;


public class MobileWebAppShellTablet extends ResizeComposite implements
		MobileWebAppShell {

	private static final MobileWebAppShellAppearance APPEARANCE = GWT
			.create(MobileWebAppShellAppearance.class);

	private final static OrientationHelper orientationHelper = new WindowBasedOrientationHelper();

	 @UiField(provided = true)
	  protected final  MobileWebAppShellAppearance appearance;
	 
	public MobileWebAppShellTablet() {
		this(APPEARANCE, orientationHelper);
	}

	public MobileWebAppShellTablet(MobileWebAppShellAppearance appearance, OrientationHelper orientationHelper) {
		this.appearance=appearance;
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
