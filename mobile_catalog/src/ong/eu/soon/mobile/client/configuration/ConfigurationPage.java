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
package ong.eu.soon.mobile.client.configuration;

import java.util.ArrayList;
import java.util.List;

import ong.eu.soon.mobile.client.Configuration;
import ong.eu.soon.mobile.client.InfoproMobile;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.model.AppState;
import ong.eu.soon.mobile.client.model.ConfigurationStatus;
import ong.eu.soon.mobile.client.services.ConfigurationService;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.panels.SquarePanel;
import ong.eu.soon.mobile.client.ui.widgets.LabelField;
import ong.eu.soon.mobile.client.ui.widgets.LoadingPopup;
import ong.eu.soon.mobile.client.ui.widgets.SimpleSelectionField;
import ong.eu.soon.mobile.client.ui.widgets.TextField;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.PageActionAsync;
import ong.eu.soon.mobile.client.utils.ScreenHelper;
import ong.eu.soon.mobile.client.utils.StringHelper;


import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwtphonegap.client.notification.AlertCallback;

/**
 * A {@link Page} used to edit the application settings
 * 
 * @author luis
 */
public class ConfigurationPage extends Page {
    
    private ConfigurationService configurationService = GWT.create(ConfigurationService.class);
    
    private TextField cyclosUrl;
    private SimpleSelectionField<String> languages;
    private LoadingPopup popup;

    @Override
    public String getHeading() {
        return messages.configurationHeading();
    }

    @Override
    public AppState getMinimumAppState() {
        return AppState.SERVER_NOT_CONFIGURED;
    }
    
    @Override
    public boolean isDisplayMenu() {
        return false;            
    }

    @Override
    public Widget initialize() {
        
        SquarePanel container = new SquarePanel();
        
        LabelField url = new LabelField(messages.cyclosUrl());
        url.addStyleName("configuration-label-field");
        
        cyclosUrl = new TextField(messages.typeCyclosUrlHere());
        cyclosUrl.setValue(Configuration.get().getServerAppUrl());          
        
        LabelField example = new LabelField(messages.forExample());
                
        LabelField language = new LabelField(messages.language());
        language.addStyleName("configuration-label-field");      
        
        languages = new SimpleSelectionField<String>(Configuration.get().getLocales()) {
            @Override
            protected String getDisplayName(String item) {
                return StringHelper.capitalize(LocaleInfo.getLocaleNativeDisplayName(item));
            }
            @Override
            protected String getValue(String item) {
                return item;
            }           
        };                
        
        FlowPanel versionContainer = new FlowPanel();
        versionContainer.setStyleName("version-container");
        
        String appVersion = Configuration.get().getAppVersion();
        LabelField version = new LabelField(messages.version() + " " + appVersion);
        version.addStyleName("version-label-field");
        
        versionContainer.add(version);
                
        // Select the user language if set
        String userLanguage = Configuration.get().getUserLanguage();
        if(StringHelper.isNotEmpty(userLanguage)) {                    
            languages.selectItem(userLanguage);
        } else {
            languages.selectItem(Configuration.get().getDefaultLanguage());
        }
        
        if(Configuration.get().isURLConfigEnabled()) {
            language.addStyleName("top-spacing");
            container.add(url);
            container.add(cyclosUrl);
            container.add(example);
        }
        container.add(language);
        container.add(languages);
        
        if(StringHelper.isNotEmpty(appVersion)) {
            container.add(versionContainer);
        }
                
        return container;
    }
    
    @Override
    public List<PageAction> getPageActions() {
        List<PageAction> actions = new ArrayList<PageAction>();       
        if(InfoproMobile.get().getAppState() == AppState.NO_LOGGED_USER) {
            actions.add(getCancelAction());
        }
        actions.add(getSaveAction());
        return actions;
    }
    
    /**
     * Returns cancel action
     */
    private PageAction getCancelAction() {
        return new PageAction() {
            @Override
            public void run() {
                Navigation.get().loadInitialPage();
            }
            @Override
            public String getLabel() {
                return messages.cancel();
            }           
        };
    }
    
    /**
     * Returns save action     
     */
    private PageAction getSaveAction() {
        return new PageActionAsync<ConfigurationStatus>() {            
            @Override
            public void runAsync(BaseAsyncCallback<ConfigurationStatus> callback) {
                // Hide any previous notification
                Notification.get().hide();
              
                String url = cyclosUrl.getValue();  
                String language = languages.getSelectedItem();
                
                if(StringHelper.isEmpty(url) && Configuration.get().isURLConfigEnabled()) {                   
                    Notification.get().error(messages.cyclosUrlIsRequired());
                    return;
                }
                
                // Block the page until url is processed
                popup = new LoadingPopup();
                popup.display();
                        
                configurationService.configureApplication(url, language, callback);                            
            }  
            @Override
            protected void onCallbackFailure() {
                popup.hide();
            }
            @Override
            public void onCallbackSuccess(final ConfigurationStatus result) {
                Timer timer = new Timer() {
                    @Override
                    public void run() {
                        popup.hide();
                        switch(result) {
                            case RELOAD_APP:
                                final boolean supportsReload = ScreenHelper.supportsReload();                                
                                Notification.get().alert(supportsReload ? messages.theLanguageHasChanged() : messages.theLanguageHasChangedNoReload(), messages.notice(), messages.ok(), new AlertCallback() {                                    
                                    @Override
                                    public void onOkButtonClicked() {
                                        // Reload application if supported
                                        if(supportsReload) {
                                            InfoproMobile.get().reloadApplication();
                                        } else {
                                            // Otherwise hide popup and continue
                                            Navigation.get().goNoHistory(PageAnchor.LOAD_GENERAL_DATA);
                                        }
                                    }
                                });                               
                                break;
                            case INVALID_URL:
                                Notification.get().error(messages.invalidUrlConfiguration());
                                break;
                            case CONFIGURED:
                                Navigation.get().goNoHistory(PageAnchor.LOAD_GENERAL_DATA);
                                break;
                        }                         
                    }                                       
                };
                timer.schedule(1500);
            }
            @Override
            public String getLabel() {
                return messages.save();
            }
        };
    }

}
