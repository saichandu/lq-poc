package com.lqpoc.repository;

import com.lqpoc.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <ul>
 * <li>Title: PersonRepository.java</li>
 * <li>Description: The class <code>PersonRepository</code> .</li>
 * <li>Created: Aug 28, 2021</li>
 * <li>@author 6112363</li>
 * </ul>
 */
public interface PersonRepository extends JpaRepository<Person, String> {

}
