package com.example.demo.repository;

import com.example.demo.entity.Fouls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoulsRepository extends JpaRepository<Fouls, Long> {
}
