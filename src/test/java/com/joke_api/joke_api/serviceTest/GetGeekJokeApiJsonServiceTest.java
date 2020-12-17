package com.joke_api.joke_api.serviceTest;

import com.joke_api.joke_api.interfaces.bean.IRestTemplateBean;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiEntityService;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiHeadersService;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiJsonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import static com.joke_api.joke_api.constanst.GeekApiConstants.GEEKSAPIURL;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GetGeekJokeApiJsonServiceTest {
    @Autowired
    IGetGeekJokeApiJsonService getGeekJokeApiJsonService;

    @Autowired
    IGetGeekJokeApiHeadersService getGeekJokeApiHeadersService;

    @Autowired
    IGetGeekJokeApiEntityService getGeekJokeApiEntityService;

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void getJsonTest() {
        HttpHeaders headers = getGeekJokeApiHeadersService.getHttpHeaders();
        HttpEntity<String> entity = getGeekJokeApiEntityService.getStringHttpEntity(headers);
        ResponseEntity<Map> response = restTemplate.exchange(GEEKSAPIURL, HttpMethod.GET, entity, Map.class);
        assertNotNull(getGeekJokeApiJsonService.getJson(response));
    }

}
