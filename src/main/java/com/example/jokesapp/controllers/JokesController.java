package com.example.jokesapp.controllers;

import com.example.jokesapp.services.JokesProviderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    JokesProviderService jokesProviderService;

    public JokesController(@Qualifier("chuckNorrisJokesProviderService") JokesProviderService jokesProviderService){
        this.jokesProviderService = jokesProviderService;
    }

    @RequestMapping("/")
    public String getQuote(Model model){
        model.addAttribute("joke",jokesProviderService.getQuote());
        return "index";
    }
}
