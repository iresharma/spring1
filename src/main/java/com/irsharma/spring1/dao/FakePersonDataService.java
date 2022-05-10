package com.irsharma.spring1.dao;

import com.irsharma.spring1.model.Person;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("FakeDao")
public class FakePersonDataService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        Person temp = new Person(
                id,
                person.getName(),
                person.getEmail(),
                person.getPhone(),
                person.getCategory()
        );
        DB.add(temp);
        return 1;
    }

    @Override
    public List<Person> selectAll() {
        return DB;
    }
}
