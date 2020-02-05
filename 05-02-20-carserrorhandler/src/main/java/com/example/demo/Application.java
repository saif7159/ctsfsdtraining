package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CarsDao;
import com.example.demo.model.Cars;

@SpringBootApplication
public class Application implements CommandLineRunner{
	CarsDao cdao;
	@Autowired
	
	public Application(CarsDao cdao) {
		super();
		this.cdao = cdao;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cdao.save(new Cars(0, "Honda", "v6", "Automatic"));
		cdao.save(new Cars(0, "Lamborghini", "v8", "Manual"));
		cdao.save(new Cars(0, "Pagani", "v12", "Automatic"));
	}

}
