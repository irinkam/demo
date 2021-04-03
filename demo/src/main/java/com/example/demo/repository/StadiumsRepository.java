package com.example.demo.repository;

import com.example.demo.entity.Stadiums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadiumsRepository extends JpaRepository<Stadiums, Long> {
}
