package com.example.lab4sentence;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

/*
 * https://spring.io/guides/gs/service-registration-and-discovery/
 * DiscoveryClient to get information about registered clients. Dependecy injected 
 */
@RestController
public class Sentence {
	
	@Autowired 
	DiscoveryClient client;

	 @GetMapping("/sentence")
	  public @ResponseBody String getSentence() {
		 
	   return 
	      getWord("LAB-4-SUBJECT") + " "
	      + getWord("LAB-4-VERB") + " "
	      + getWord("LAB-4-ARTICLE") + " "
	      + getWord("LAB-4-ADJECTIVE") + " "
	      + getWord("LAB-4-NOUN") + "."
	      ; 
	  }
	  
	  public String getWord(String service) {
		    List<ServiceInstance> list = client.getInstances(service);
		    if (list != null && list.size() > 0 ) {
		      URI uri = list.get(0).getUri();
		  if (uri !=null ) {
		    	//makes a get req with to the uri, type that is to be returned
		    return (new RestTemplate()).getForObject(uri,String.class);
		  }
		    }
		    return null;
		  }
}
