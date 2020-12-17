package com.joke_api.joke_api.repository;

import com.joke_api.joke_api.entity.QuoteEntity;
import com.joke_api.joke_api.interfaces.repository.IQuoteRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class QuoteRepository implements IQuoteRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<QuoteEntity> findAllForUser(String name) {
        TypedQuery<QuoteEntity> quotesTypedQuery = entityManager.createQuery("SELECT q FROM QuoteEntity q WHERE q.name=:name", QuoteEntity.class);
        return quotesTypedQuery.setParameter("name", name).getResultList();
    }

    public QuoteEntity addQuote(QuoteEntity  quoteEntity) {
        return entityManager.merge(quoteEntity);
    }
}
