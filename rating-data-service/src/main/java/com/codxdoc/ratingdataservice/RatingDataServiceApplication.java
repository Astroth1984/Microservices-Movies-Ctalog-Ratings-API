package com.codxdoc.ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RatingDataServiceApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8183 );
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}

}
