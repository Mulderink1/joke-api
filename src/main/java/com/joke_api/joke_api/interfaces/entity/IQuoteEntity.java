package com.joke_api.joke_api.interfaces.entity;

import java.sql.Date;

public interface IQuoteEntity {
    int getId();
    void setId(int id);
    Date getDate();
    String getQuote();
    void setQuote(String quote);
    String getName();
    void setName(String name);
}
