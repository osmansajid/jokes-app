package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesProviderService implements JokesProviderService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesProviderService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
