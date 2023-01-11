package com.codxdoc.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieInfoServiceApplication.class, args);
		System.getProperties().put( "server.port", 8181 );  //8181 port is set here
	    SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
