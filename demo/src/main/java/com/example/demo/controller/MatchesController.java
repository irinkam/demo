package com.example.demo.controller;

import com.example.demo.service.MatchesService;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MatchesController {
    @Autowired
    private MatchesService matchesService;

    @GetMapping("/matches")
    public String viewMatchesPage(Model modelMatches)
    {
        modelMatches.addAttribute("listOfMatches", matchesService.getAllMatches());
        return "matches";
    }
}
