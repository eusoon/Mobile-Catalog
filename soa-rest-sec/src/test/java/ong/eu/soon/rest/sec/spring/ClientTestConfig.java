package ong.eu.soon.rest.sec.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "ong.eu.soon.rest.common.client", "my.com.infopro.rest.gallery.client" })
public class ClientTestConfig {

    // API

}
