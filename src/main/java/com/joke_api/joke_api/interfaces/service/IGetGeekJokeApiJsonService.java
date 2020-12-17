package com.joke_api.joke_api.interfaces.service;

import org.springframework.http.ResponseEntity;
import java.util.Map;

public interface IGetGeekJokeApiJsonService {
    String getJson(ResponseEntity<Map> response);
}
