package com.example.lab4sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * Stand up a client to registers itself with the registry (server)
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4SentenceApplication.class, args);
	}

}
