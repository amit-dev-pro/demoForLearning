package com.amit.demoForLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoForLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForLearningApplication.class, args);

		System.out.println("Welcome to our Prayagraj Kumbh Mela "+ LocalDate.now());
	}

}
