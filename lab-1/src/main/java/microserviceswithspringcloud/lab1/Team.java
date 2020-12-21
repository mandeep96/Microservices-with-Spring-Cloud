package microserviceswithspringcloud.lab1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

	@Id @GeneratedValue
	Long id;
	String name;
	String location;
	String mascot;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the mascot
	 */
	public String getMascot() {
		return mascot;
	}
	/**
	 * @param mascot the mascot to set
	 */
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	
	
}
