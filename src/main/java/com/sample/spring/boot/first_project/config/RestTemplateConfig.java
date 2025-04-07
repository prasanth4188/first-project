package com.sample.spring.boot.first_project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {


    @Bean("microServiceBeanName")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
