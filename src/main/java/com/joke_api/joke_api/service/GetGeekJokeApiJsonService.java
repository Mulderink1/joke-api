package com.joke_api.joke_api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joke_api.joke_api.interfaces.service.IGetGeekJokeApiJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.EmptyStackException;
import java.util.Map;

@Service
public class GetGeekJokeApiJsonService implements IGetGeekJokeApiJsonService {
    @Autowired
    ObjectMapper objectMapper;

    public String getJson(ResponseEntity<Map> response) {
        try {
            return objectMapper.writeValueAsString(response.getBody());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new EmptyStackException();
        }
    }
}
