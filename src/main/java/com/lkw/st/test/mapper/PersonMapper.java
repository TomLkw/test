package com.lkw.st.test.mapper;

import com.lkw.st.test.bean.Person;

import java.util.List;

public interface PersonMapper {
    List<Person> getAllPerson();
    void addPerson(Person person);
    void deletePerson(Integer id);
    Integer updatePerson(Person person);
    Person selectPersonById(Person person);
}
