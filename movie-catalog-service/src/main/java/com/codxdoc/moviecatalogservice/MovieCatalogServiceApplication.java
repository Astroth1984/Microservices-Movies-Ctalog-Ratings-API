package com.codxdoc.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieCatalogServiceApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8182 );
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
