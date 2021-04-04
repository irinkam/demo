package com.example.demo.controller;

import com.example.demo.service.MatchesService;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchesController {
    @Autowired
    private MatchesService matchesService;

    @GetMapping("/matches")
    public String viewMatchesPage(Model model)
    {
        model.addAttribute("listOfMatches", matchesService.getAllMatches());
        return "matches";
    }
}
