package com.joke_api.joke_api.serviceTest;

import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiHeadersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class GetGeekJokeApiHeadersServiceTest {
    @Autowired
    IGetGeekJokeApiHeadersService getGeekJokeApiHeadersService;

    @Test
    public void getHeadersTest() {
        HttpHeaders httpHeaders = getGeekJokeApiHeadersService.getHttpHeaders();

        List<String> firstHttpHeader = httpHeaders.get("x-rapidapi-key");
        String firstHttpHeaderValue = firstHttpHeader.get(0);
        assertEquals("8418c24aa3mshbf34bb52aa31563p1070dajsnba35d9fdf24c", firstHttpHeaderValue, "Get Fucked Slug Head");

        List<String> secondHttpHeader = httpHeaders.get("x-rapidapi-host");
        String secondHttpHeaderValue = secondHttpHeader.get(0);
        assertEquals("geek-jokes.p.rapidapi.com", secondHttpHeaderValue, "Get Fucked Slug Head");
    }


}
