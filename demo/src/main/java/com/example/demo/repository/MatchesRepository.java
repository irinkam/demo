package com.example.demo.repository;

import com.example.demo.entity.Matches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchesRepository extends JpaRepository<Matches, Long> {
}
