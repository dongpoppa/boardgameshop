package com.vn.bgshop.boardgameshop.repository;


import com.vn.bgshop.boardgameshop.entity.User;
import java.util.List;


public interface UserRepo extends Repo<User>{
    User findByEmail(String email);

    User findByEmailNotBanned(String email);

    List<User> findByRole(String roleName);

    List<User> findByRoleSize(int roleSize);
}
