package com.maiia.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.maiia.api.model.Text;
import com.maiia.api.service.TextService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ApiApplication {

	@Autowired
	private TextService service;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String url = "https://jsonplaceholder.typicode.com/posts";
			try {
				service.processData(restTemplate.getForEntity(url, Text[].class).getBody());
			} catch (Exception e) {
				log.error("Error when getting data: " + e.getMessage());
			}
		};
	}
}