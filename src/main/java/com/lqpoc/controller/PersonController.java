package com.lqpoc.controller;

import com.lqpoc.entities.Person;
import com.lqpoc.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <ul>
 * <li>Title: PersonController.java</li>
 * <li>Description: The class <code>PersonController</code> .</li>
 * <li>Created: Aug 28, 2021</li>
 * <li>@author 6112363</li>
 * </ul>
 */
@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "/list")
    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
