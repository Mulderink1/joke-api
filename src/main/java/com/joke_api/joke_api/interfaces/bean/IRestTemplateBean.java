package com.joke_api.joke_api.interfaces.bean;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public interface IRestTemplateBean {
    RestTemplate restTemplate(RestTemplateBuilder builder);
}
