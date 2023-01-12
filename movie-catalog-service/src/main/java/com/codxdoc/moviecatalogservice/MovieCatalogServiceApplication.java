package com.codxdoc.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogServiceApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();	
	}

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8182 );
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
