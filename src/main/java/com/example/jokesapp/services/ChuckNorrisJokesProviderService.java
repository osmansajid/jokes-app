package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesProviderService implements JokesProviderService {
    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokesProviderService(){
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
