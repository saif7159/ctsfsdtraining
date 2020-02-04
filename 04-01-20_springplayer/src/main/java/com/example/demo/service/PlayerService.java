package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Player;

public interface PlayerService {
public List<Player> getPlayers();
public Optional<Player> getById(Integer id);
}
