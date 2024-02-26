package com.example.consumingrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	/*
	Response from API consumed:
	{
	  "answer": "yes",
	  "forced": false,
	  "image": "https://yesno.wtf/assets/yes/2.gif"
	}

	Hit this API in Postman using: http://localhost:8080/yesno/api?force=yes
	* */

}
