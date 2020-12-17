package com.joke_api.joke_api.service;

import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiHeadersService;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import static com.joke_api.joke_api.constanst.GeekApiConstants.GEEKSAPIHEADERHOST;
import static com.joke_api.joke_api.constanst.GeekApiConstants.GEEKSAPIHEADERKEY;

@Service
public class GetGeekJokeApiHeadersService implements IGetGeekJokeApiHeadersService {
    public HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", GEEKSAPIHEADERKEY);
        headers.set("x-rapidapi-host", GEEKSAPIHEADERHOST);
        return headers;
    }
}
