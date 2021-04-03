package com.example.demo.repository;

import com.example.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    void deleteByUsername(String username);

    Users findByUsername(String username);

    @Query("select u.username from Users u where u.age = 21")
    List<Users> findTwentyOne();
}
