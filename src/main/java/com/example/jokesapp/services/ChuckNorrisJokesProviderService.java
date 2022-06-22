package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesProviderService implements JokesProviderService {
    @Override
    public String getQuote() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
