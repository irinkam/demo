package com.example.demo.service.implementations;

import com.example.demo.entity.Matches;
import com.example.demo.repository.MatchesRepository;
import com.example.demo.service.MatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchesServiceImplementation implements MatchesService {

    @Autowired
    private MatchesRepository matchesRepository;

    @Override
    public List<Matches> getAllMatches() {
        return matchesRepository.findAll();
    }
}
