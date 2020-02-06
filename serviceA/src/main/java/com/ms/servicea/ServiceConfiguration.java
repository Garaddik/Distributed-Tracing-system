package com.ms.servicea;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ServiceConfiguration {

    @Bean
    @NewSpan
    public RestTemplate getInstance(){
        return new RestTemplate();
    }
}
