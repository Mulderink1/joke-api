package com.joke_api.joke_api.repositoryTest;

import com.joke_api.joke_api.entity.QuoteEntity;
import com.joke_api.joke_api.interfaces.repository.IQuoteRepository;
import com.joke_api.joke_api.repository.QuoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class QuoteRepositoryTest {
    @Autowired
    IQuoteRepository quoteRepository;


    @Test
    public void findAllForUserTest() {
        List<QuoteEntity> dbEntityList = quoteRepository.findAllForUser("Mike");
        QuoteEntity firstEntityInList = dbEntityList.get(0);
        String entityNameProperty = firstEntityInList.getName();

        assertEquals("Mike", entityNameProperty, "Get Fucked Slug Head");
    }

    @Test
    public void addQuoteTest() {
        QuoteEntity entity = new QuoteEntity("Get Fucked Slug Head", "Tim");

        IQuoteRepository quoteRepositoryMock = mock(QuoteRepository.class);

        when(quoteRepositoryMock.addQuote(entity)).thenReturn(entity);
        assertNotNull(quoteRepository.addQuote(entity), "Get Fucked Slug Head");
    }
}
