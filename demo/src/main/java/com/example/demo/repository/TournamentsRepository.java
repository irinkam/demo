package com.example.demo.repository;

import com.example.demo.entity.Tournaments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentsRepository extends JpaRepository<Tournaments, Long> {
}
