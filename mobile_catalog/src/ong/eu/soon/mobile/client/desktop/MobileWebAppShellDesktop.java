package ong.eu.soon.mobile.client.desktop;

import ong.eu.soon.mobile.client.app.MobileWebAppShell;
import ong.eu.soon.mobile.client.help.OrientationHelper;
import ong.eu.soon.mobile.client.help.WindowBasedOrientationHelper;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.ResizeComposite;


public class MobileWebAppShellDesktop extends ResizeComposite implements
		MobileWebAppShell {

	private final static OrientationHelper orientationHelper = new WindowBasedOrientationHelper();

	private static final MobileWebAppShellAppearance APPEARANCE = GWT
			.create(MobileWebAppShellAppearance.class);


	@UiField(provided = true)
	protected final MobileWebAppShellAppearance appearance;

	public MobileWebAppShellDesktop() {
		this(APPEARANCE, orientationHelper);
	}

	public MobileWebAppShellDesktop(MobileWebAppShellAppearance appearance,
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
