package microserviceswithspringcloud.lab1;

import org.springframework.data.repository.CrudRepository;
/*
 * https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
 * https://stackoverflow.com/questions/12899372/spring-why-do-we-autowire-the-interface-and-not-the-implemented-class
 */
public interface TeamRepository extends CrudRepository<Team,Long>{

}
