package ong.eu.soon.mobile.client.phone;

import ong.eu.soon.mobile.client.help.OrientationHelper;
import ong.eu.soon.mobile.client.help.WindowBasedOrientationHelper;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Composite;



public class SplashPhone  extends Composite {

	private final static OrientationHelper orientationHelper = new WindowBasedOrientationHelper();

	private static final SplashAppearance APPEARANCE = GWT
			.create(SplashAppearance.class);

	  
	  @UiField(provided = true)
	  protected final  SplashAppearance appearance;
	  
	  @UiField
	   Label lblTitle;
	  @UiField
	   Label lblBriefDescription;
	  @UiField
	   Image logo;
	  
	  ImageResource imageResource;
	  
	  public SplashPhone() {
			this(APPEARANCE,orientationHelper);
		}

		public SplashPhone(SplashAppearance appearance,OrientationHelper orientationHelper) {
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
			lblTitle.setVisible(true);
			lblBriefDescription.setVisible(false);
			imageResource=DefaultSplashAppearance.Resource.INSTANCE.splash();
			logo=new Image(imageResource);
	
		}

		private void onShiftToLandscape() {
			lblTitle.setVisible(false);
			imageResource=DefaultSplashAppearance.Resource.INSTANCE.splashHdpi();
			logo=new Image(imageResource);
			lblBriefDescription.setVisible(true);
		}		
}
