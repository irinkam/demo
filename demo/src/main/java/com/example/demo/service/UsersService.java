package com.example.demo.service;

import com.example.demo.entity.Users;
import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();
    void saveUser(Users user);
    Users getUserById(long id);
    void deleteUser(long id);
    Users findByUsername(String username);
}