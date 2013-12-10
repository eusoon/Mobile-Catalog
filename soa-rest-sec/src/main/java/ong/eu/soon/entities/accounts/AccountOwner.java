package ong.eu.soon.entities.accounts;

import java.util.Map;

import ong.eu.soon.entities.settings.LocalSettings;


/**
 * Marker interface for entities that can be owner of accounts
 * 
 * @author luis
 */
public interface AccountOwner {

	Map<String, Object> getVariableValues(LocalSettings localSettings);

}
