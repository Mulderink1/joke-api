package com.joke_api.joke_api.controller;

import com.joke_api.joke_api.entity.QuoteEntity;
import com.joke_api.joke_api.interfaces.service.IGeekJokeApiService;
import com.joke_api.joke_api.interfaces.repository.IQuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
    @Autowired
    IQuoteRepository quoteRepository;

    @Autowired
    IGeekJokeApiService geekJokeApiService;

    @GetMapping(value = "/get_user_quotes", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<QuoteEntity> getQuotes(@RequestParam String name) {
        return quoteRepository.findAllForUser(name);
    }

    @GetMapping(value = "get_funny_geek_joke")
    @ResponseBody
    public String getFunnyGeekQuote() {
        return geekJokeApiService.getJokeFromApi();
    }

    @PostMapping(value = "/add_quote")
    public void addQuote(@RequestBody QuoteEntity quoteEntity) {
        quoteRepository.addQuote(quoteEntity);
    }
}
