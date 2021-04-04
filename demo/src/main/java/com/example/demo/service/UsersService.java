package com.example.demo.service;

import com.example.demo.entity.Users;
import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();
    boolean saveUser(Users user);
    Users getUserById(long id);
    boolean deleteUser(long id);
    Users findByUsername(String username);
}