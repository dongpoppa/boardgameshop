package com.vn.bgshop.boardgameshop.service;

import com.vn.bgshop.boardgameshop.entity.User;
import com.vn.bgshop.boardgameshop.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public User findByEmailNotBanned(String email) {
        return userRepo.findByEmailNotBanned(email);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public List<User> findByRole(String roleName) {
        return userRepo.findByRole(roleName);
    }

    @Override
    public List<User> findByRoleSize(int roleSize) {
        return userRepo.findByRoleSize(roleSize);
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(User model) {
        userRepo.save(model);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, User model) {
        userRepo.update(id,model);
    }
}
