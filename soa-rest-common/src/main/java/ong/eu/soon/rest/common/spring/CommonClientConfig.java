package ong.eu.soon.rest.common.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "ong.eu.soon.rest.common.client" })
public class CommonClientConfig {

    public CommonClientConfig() {
        super();
    }

}
