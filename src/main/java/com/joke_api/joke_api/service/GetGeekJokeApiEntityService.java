package com.joke_api.joke_api.service;

import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiEntityService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class GetGeekJokeApiEntityService implements IGetGeekJokeApiEntityService {
    public HttpEntity<String> getStringHttpEntity(HttpHeaders headers) { return new HttpEntity<String>(headers); }
}
