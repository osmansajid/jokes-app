package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisJokesProviderService implements JokesProviderService {
    @Override
    public String getQuote() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
