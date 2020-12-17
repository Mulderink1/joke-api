package com.joke_api.joke_api.bean;

import com.joke_api.joke_api.interfaces.bean.IRestTemplateBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateBean implements IRestTemplateBean {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) { return builder.build(); }
}
