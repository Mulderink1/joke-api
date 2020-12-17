package com.joke_api.joke_api.interfaces.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

public interface IGetGeekJokeApiEntityService {
    HttpEntity<String> getStringHttpEntity(HttpHeaders headers);
}
