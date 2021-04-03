package com.example.demo.service.implementations;

import com.example.demo.entity.Teams;
import com.example.demo.repository.TeamsRepository;
import com.example.demo.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsServiceImplementation implements TeamsService {

    @Autowired
    private TeamsRepository teamsRepository;

    @Override
    public List<Teams> getAllTeams() {
        return teamsRepository.findAll();
    }
}
