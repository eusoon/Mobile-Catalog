package ong.eu.soon.services.settings;


import ong.eu.soon.entities.settings.LocalSettings;

import org.springframework.stereotype.Repository;

@Repository
public class SettingsServiceImpl implements SettingsService {

	@Override
	public LocalSettings getLocalSettings() {
		LocalSettings localSettings = new LocalSettings();
		return localSettings;
	}

}
