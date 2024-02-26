package com.example.consumingrest;

import com.example.consumingrest.controller.YesNoController;
import com.example.consumingrest.model.ResponseYesNo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class ConsumingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner run() throws Exception {
		return args -> {
			YesNoController controller = new YesNoController();
			ResponseYesNo responseYesNo = controller.getResponseYesNo("yes").getBody();
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
