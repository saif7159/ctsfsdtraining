package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PlayerDao;
import com.example.demo.model.Player;
import com.example.demo.model.Titles;

@SpringBootApplication
public class Application implements CommandLineRunner {
	PlayerDao pdao;
	@Autowired
	public Application(PlayerDao pdao)
	{
		this.pdao = pdao;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//List<Titles> l1 = new ArrayList<Titles>();
		//Player p1 = new Player();
		//l1.add(new Titles())
		pdao.save(new Player(0, "Saif", 22, "Football"));
		pdao.save(new Player(0, "Cristiano", 33, "Football"));
		pdao.save(new Player(0, "Nadal", 32, "Tennis"));
		pdao.save(new Player(0, "Kobe", 42, "NBA"));
	}

}
