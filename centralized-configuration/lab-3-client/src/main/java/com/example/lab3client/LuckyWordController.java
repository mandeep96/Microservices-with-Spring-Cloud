package com.example.lab3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 * https://spring.io/guides/gs/centralized-configuration/
 * Client bootstrap.yml must be read before the rest of the application’s configuration. Hence called bootstrap not application
 * Bootstrap lists name, port and config uri 
 * Client can access any value in the Config Server using @Value("${…​}")
 * Run Client
 */

@RestController
public class LuckyWordController {

	//lucky-word from configuration file
  @Value("${lucky-word}")
  String luckyWord;

  @GetMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
  
}
