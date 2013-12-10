package ong.eu.soon.mobile.client.serviceprovider;

import ong.eu.soon.mobile.client.InfoproMobile;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.Notification.NotificationLayout;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.ServiceProvider;
import ong.eu.soon.mobile.client.model.ServiceProviderData;
import ong.eu.soon.mobile.client.services.ServiceProviderService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.widgets.ServiceProviderRow;
import ong.eu.soon.mobile.client.ui.widgets.SimpleDataList;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.ParameterKey;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;



public class ServiceProvidersPage extends Page {

	private ServiceProviderService serviceProviderService = GWT
			.create(ServiceProviderService.class);
	private JsArray<ServiceProvider> serviceProviders;

	@Override
	public String getHeading() {
		return messages.loadServiceProviderHeading();
	}
		
		
	private void getServiceProviders() {
		serviceProviderService.getServiceProviders(new BaseAsyncCallback<JsArray<ServiceProvider>>() {
			@Override
            public void onFailure(Throwable caught) {
				super.onFailure(caught);
            }

			@Override
			public void onSuccess(JsArray<ServiceProvider> result) {
				InfoproMobile.get().setServiceProviders(result);
				Navigation.get().loadServiceProviderPage();
			}

		 });
	}


	@Override
	public boolean hasCustomScroll() {
		return true;
	}

	@Override
	public Widget initialize() {
		this.getServiceProviders();
		if(serviceProviders.length() == 1) {
            // If exists only an account display details page
            final ServiceProvider sp = serviceProviders.get(0);
            
            Parameters params = new Parameters();
            params.add(ParameterKey.ID, sp.getId());   
            
            Page page = new ServicesPage();
            page.setParameters(params);

            return page.initialize();
        }
		// List pages uses fixed notification layout
        Notification.get().setLayout(NotificationLayout.FIXED);
        
        // If there are multiple accounts, display it
        SimpleDataList<ServiceProviderData> dataList = new SimpleDataList<ServiceProviderData>() {
       
            @Override
            protected Widget onRender(Context context, ServiceProviderData data) {                
                
                // Value can be null
                if (data == null) {
                  return null;
                }
                
                // Create row widget
				ServiceProviderRow row = new ServiceProviderRow();
				row.setHeading(data.getServiceProvider().getServiceProviderName());
				row.setSub(LoggedUser.get().getInitialData().getProfile()
						.getName());
                
                return row;

            }

            @Override
            protected void onSearchData(AsyncCallback<JsArray<ServiceProviderData>> callback) {
                // Fetch service providers data
            	serviceProviderService.getServiceProvidersData(callback);
            }     
            
            @Override
            protected void onRowSelected(ServiceProviderData value) { 
                // Go to services
            	navigateToSPServices(value.getServiceProvider());
            }
        };

        return dataList;
	}

	/**
	 * Navigates to service provider services sending according parameters
	 */
	private void navigateToSPServices(ServiceProvider sp) {
		Parameters params = new Parameters();
		params.add(ParameterKey.ID, sp.getId());
		Navigation.get().go(PageAnchor.SERVICES, params);
	}
}
