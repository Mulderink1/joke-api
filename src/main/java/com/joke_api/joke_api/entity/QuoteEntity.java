package com.joke_api.joke_api.entity;

import com.joke_api.joke_api.interfaces.entity.IQuoteEntity;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "quote")
@NamedQuery(name = "find_all", query = "select q from QuoteEntity q")
public class QuoteEntity implements IQuoteEntity {
    @Id
    @GeneratedValue
    private int id;

    private Date date = new Date(System.currentTimeMillis());
    private String quote;
    private String name;

    public QuoteEntity() { }

    public QuoteEntity(String quote, String name) {
        this.quote = quote;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
