package com.lkw.st.test.service;

import com.lkw.st.test.bean.Person;
import com.lkw.st.test.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    PersonMapper personMapper;
    @Override
    public List<Person> getAllPerson() {
        return personMapper.getAllPerson();
    }

    @Override
    public String addPerson(Person person) {
        try{
            personMapper.addPerson(person);
        }catch (Error e){
            return e+"";
        }
        return "success";

    }

    @Override
    public String deletePerson(int id) {
        try {
            personMapper.deletePerson(id);
        }catch (Error e){
            return e.toString();
        }
        return "success";
    }

    @Override
    public Person updatePerson(Person person) {
        System.out.println(personMapper.updatePerson(person));
        System.out.println(person);
        return person;
    }


}
