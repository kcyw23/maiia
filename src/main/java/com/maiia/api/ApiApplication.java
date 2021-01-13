package com.maiia.api;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.maiia.api.model.Text;
import com.maiia.api.model.TextList;
import com.maiia.api.repository.TextRepository;

@SpringBootApplication
public class ApiApplication {

	@Autowired
	private TextRepository textRepository;

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
			TextList list = new TextList();
			list.setTexts(Arrays.asList(restTemplate.getForEntity(url, Text[].class).getBody()));
			list.firstFifty();
			list.sortByTitle();
			textRepository.saveAll(list.getTexts());
		};
	}
}