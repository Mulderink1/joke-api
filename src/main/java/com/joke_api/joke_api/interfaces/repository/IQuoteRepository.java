package com.joke_api.joke_api.interfaces.repository;

import com.joke_api.joke_api.entity.QuoteEntity;
import java.util.List;

public interface IQuoteRepository {
    List<QuoteEntity> findAllForUser(String name);
    QuoteEntity addQuote(QuoteEntity  quoteEntity);
}
