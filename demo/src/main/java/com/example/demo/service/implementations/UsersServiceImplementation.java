package com.example.demo.service.implementations;

import com.example.demo.entity.Roles;
import com.example.demo.entity.Users;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UsersServiceImplementation implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void saveUser(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Roles> roles = new HashSet<>();
        roles.add(roleRepository.getOne(1L));
        user.setRoles(roles);
        this.usersRepository.save(user);
    }

    @Override
    public Users getUserById(long id) {
        Optional<Users> optional = usersRepository.findById(id);
        Users user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException("User not found for id :: " + id);
        }
        return user;
    }

    @Override
    public void deleteUser(long id) {
        this.usersRepository.deleteById(id);
    }

    @Override
    public Users findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }
}
