package ong.eu.soon.rest.sec.common;

import my.com.infopro.rest.common.persistence.model.IEntity;
import my.com.infopro.rest.common.web.IUriMapper;

import org.springframework.stereotype.Component;

@Component
public class SecUriMapper implements IUriMapper {

    public SecUriMapper() {
        super();
    }

    // API

    /**
     * - note: at this point, the URI is transformed into plural (added `s`) in a hardcoded way - this will change in the future
     */
    @Override
    public <T extends IEntity> String getUriBase(final Class<T> clazz) {
        return clazz.getSimpleName().toString().toLowerCase() + "s";
    }

}
