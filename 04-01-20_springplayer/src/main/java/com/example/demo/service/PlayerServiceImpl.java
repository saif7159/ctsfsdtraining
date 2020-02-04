package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.PlayerDao;
import com.example.demo.model.Player;
@Service

@EnableTransactionManagement
public class PlayerServiceImpl implements PlayerService {
	PlayerDao pdao;
	@Autowired
	public PlayerServiceImpl(PlayerDao pdao)
	{
		this.pdao = pdao;
	}
	@Override
	public List<Player> getPlayers() {
		
		return pdao.findAll();
	}
	@Override
	public Optional<Player> getById(Integer id) {
		Optional<Player> player = pdao.findById(id);
		return player;
	}

}
