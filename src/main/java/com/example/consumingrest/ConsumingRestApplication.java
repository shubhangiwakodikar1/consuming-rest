package com.example.consumingrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ResponseYesNo responseYesNo = restTemplate.getForObject("https://yesno.wtf/api", ResponseYesNo.class);
			System.out.println(responseYesNo.toString());
		};
	}

	/*
	{
	  "answer": "yes",
	  "forced": false,
	  "image": "https://yesno.wtf/assets/yes/2.gif"
	}
	* */

}
