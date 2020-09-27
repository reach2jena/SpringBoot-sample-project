package com.saanvisoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.saanvisoft")
public class MasterMoviesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterMoviesServiceApplication.class, args);
	}

}
