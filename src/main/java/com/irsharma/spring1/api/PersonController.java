package com.irsharma.spring1.api;

import com.irsharma.spring1.dao.PersonDao;
import com.irsharma.spring1.model.Person;
import com.irsharma.spring1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAllPeople();
    }

    @PostMapping
    public  void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
}
