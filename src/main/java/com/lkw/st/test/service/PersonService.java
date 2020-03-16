package com.lkw.st.test.service;

import com.lkw.st.test.bean.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPerson();
    public String addPerson(Person person);
    String deletePerson(int id);
    Person updatePerson(Person person);
}
