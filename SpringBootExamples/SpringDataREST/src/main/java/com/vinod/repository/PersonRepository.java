/**
 * 
 */
package com.vinod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vinod.entity.Person;
import java.lang.String;
import java.util.List;

/**
 * @author vinod
 *
 */
@RepositoryRestResource(collectionResourceRel="people",path="people")
public interface PersonRepository extends JpaRepository<Person, Long>{

	List<Person> findByLastName(@Param("name") String lastname);
}
