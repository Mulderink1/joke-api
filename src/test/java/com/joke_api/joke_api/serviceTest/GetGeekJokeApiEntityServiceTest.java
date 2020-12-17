package com.joke_api.joke_api.serviceTest;

import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiEntityService;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiHeadersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GetGeekJokeApiEntityServiceTest {
    @Autowired
    IGetGeekJokeApiHeadersService getGeekJokeApiHeadersService;

    @Autowired
    IGetGeekJokeApiEntityService getGeekJokeApiEntityService;


    @Test
    public void getHttpEntity() {
        HttpHeaders httpHeaders = getGeekJokeApiHeadersService.getHttpHeaders();
        HttpEntity<String> httpEntity = getGeekJokeApiEntityService.getStringHttpEntity(httpHeaders);
        HttpHeaders httpEntityHeaders = httpEntity.getHeaders();
        List<String> httpHeader = httpEntityHeaders.get("x-rapidapi-key");

        String httpHeaderValue = httpHeader.get(0);

        assertEquals("8418c24aa3mshbf34bb52aa31563p1070dajsnba35d9fdf24c", httpHeaderValue);
    }

}

