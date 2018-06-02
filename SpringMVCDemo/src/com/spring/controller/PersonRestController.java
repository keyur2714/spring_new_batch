package com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.Person;
import com.spring.service.PersonService;


@Controller
@RequestMapping(value="/personRest")
public class PersonRestController {

	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value="/getPerson/{id}",method = RequestMethod.GET)
	public ResponseEntity<Person> getPerson(@PathVariable("id") Integer id) {
		Person p = new Person();
		p.setName("keyur");
		p.setCity("pune");
		p.setMobileNo("7387029671");
		p.setPid(27);
		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}
	
}
