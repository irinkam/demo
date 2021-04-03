package com.example.demo.repository;

import com.example.demo.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepository extends JpaRepository<Teams, Long> {
}
