package com.example.demo.controller;

import com.example.demo.service.MatchesService;
import com.example.demo.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamsController {
    @Autowired
    private TeamsService teamsService;

    @GetMapping("/teams")
    public String viewTeamsPage(Model model)
    {
        model.addAttribute("listOfTeams", teamsService.getAllTeams());
        return "teams";
    }
}
