package microserviceswithspringcloud.lab1;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {
	
	@Autowired
	TeamRepository teamRepository; 

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	
	@PostConstruct
	public void init() {
	  	List<Team> list = new ArrayList<>();

	  	Team team = new Team();
	  	team.setLocation("London");
	  	team.setName("Arsenal");
	  	list.add(team);
	  	
	  	team = new Team();
	  	team.setLocation("Manchester");
	  	team.setName("Manchester United");
	  	list.add(team);

	  	teamRepository.saveAll(list);
	  } 
	
}
