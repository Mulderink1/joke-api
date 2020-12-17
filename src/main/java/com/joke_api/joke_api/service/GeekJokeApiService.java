package com.joke_api.joke_api.service;

import static com.joke_api.joke_api.constanst.GeekApiConstants.*;
import com.joke_api.joke_api.interfaces.service.IGeekJokeApiService;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiEntityService;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiHeadersService;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class GeekJokeApiService implements IGeekJokeApiService {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    IGetGeekJokeApiHeadersService getGeekJokeApiHeadersService;

    @Autowired
    IGetGeekJokeApiEntityService getGeekJokeApiEntityService;

    @Autowired
    IGetGeekJokeApiJsonService getGeekJokeApiJsonService;

    public String getJokeFromApi() {
        HttpHeaders headers = getGeekJokeApiHeadersService.getHttpHeaders();
        HttpEntity<String> entity = getGeekJokeApiEntityService.getStringHttpEntity(headers);
        ResponseEntity<Map> response = restTemplate.exchange(GEEKSAPIURL, HttpMethod.GET, entity, Map.class);
        return getGeekJokeApiJsonService.getJson(response);
    }
}
