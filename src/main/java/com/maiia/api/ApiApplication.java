package com.maiia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maiia.api.model.Text;
import com.maiia.api.repository.TextRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	private TextRepository textRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		textRepository.save(new Text(1, 1, "test", "another test"));
	}

}
