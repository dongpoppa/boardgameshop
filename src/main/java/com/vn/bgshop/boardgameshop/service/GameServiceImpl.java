package com.vn.bgshop.boardgameshop.service;

import com.vn.bgshop.boardgameshop.entity.Game;
import com.vn.bgshop.boardgameshop.entity.Role;
import com.vn.bgshop.boardgameshop.repository.GameRepo;
import com.vn.bgshop.boardgameshop.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepo gameRepo;


    @Override
    public Game findByName(String name) {
        return null;
    }

    @Override
    public List<Game> findAll() {
        return null;
    }

    @Override
    public Game findById(int id) {
        return null;
    }

    @Override
    public void save(Game model) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, Game model) {

    }
}
