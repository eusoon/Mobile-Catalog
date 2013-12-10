package ong.eu.soon.rest.sec.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "ong.eu.soon.rest.sec.common" })
public class SecCommonApiConfig {

    public SecCommonApiConfig(){
        super();
    }

}
