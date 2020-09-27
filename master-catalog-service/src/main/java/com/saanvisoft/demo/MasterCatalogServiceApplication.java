package com.saanvisoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan("com.saanvisoft")
public class MasterCatalogServiceApplication {
	
	@Bean("getRestTemplate")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean("getWebClientBuilder")
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}
	public static void main(String[] args) {
		SpringApplication.run(MasterCatalogServiceApplication.class, args);
	}

}
