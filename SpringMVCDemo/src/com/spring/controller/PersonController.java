package com.spring.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.Person;
import com.spring.service.PersonService;


@Controller
@RequestMapping(value="/person")
public class PersonController {

	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value="/create",method = RequestMethod.GET)
	public String newPerson(ModelMap modelMap) {
		Person person = new Person();
		modelMap.addAttribute("person", person);
		return "person/create";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String savePerson(@Valid Person person,BindingResult result,ModelMap modelMap) {
		if(result.hasErrors()) {
			return "person/create";
		}else {
			personService.save(person);
		}
		modelMap.addAttribute("person", person);
		modelMap.addAttribute("successMsg", "Person Save Successfullly.");
		return "person/create";
	}
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		List<com.spring.model.Person> personList = personService.list();
		modelMap.addAttribute("personList", personList);
		for (com.spring.model.Person person : personList) {
			System.out.println(person.getName());
		}
		Person person = new Person();
		modelMap.addAttribute("person", person);
		return "person/create";
	}
	
}
