package com.lkw.st.test.controller;

import com.lkw.st.test.bean.Person;
import com.lkw.st.test.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PersonController {

    @Resource
    PersonService personService;

    @RequestMapping("/getAllPerson")
    @ResponseBody
    public List<Person> getAllPerson(){
        List<Person> personList =  personService.getAllPerson();
        return personList;
    }
    @RequestMapping("/addPerson")
    @ResponseBody
    public String addPerson(@RequestBody Person person){
        String result = personService.addPerson(person);
        return result;
    }
    @RequestMapping("/deletePerson")
    @ResponseBody
    public String deletePerson(Integer id){
        System.out.println(id);
        return personService.deletePerson(id);
    }
    @RequestMapping("/updatePerson")
    @ResponseBody
    public Person updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }
}
