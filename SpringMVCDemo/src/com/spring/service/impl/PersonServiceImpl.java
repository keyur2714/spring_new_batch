package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PersonDAO;
import com.spring.model.Person;

import com.spring.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDAO personDAO;

	@Override
	public void save(Object object) {
		
		Person person = new Person();
		person.setName(((com.spring.dto.Person)object).getName());
		person.setCity(((com.spring.dto.Person)object).getCity());
		person.setMobileNo(((com.spring.dto.Person)object).getMobileNo());
		
		personDAO.save(person);
		System.out.println("Person Record Saved Successful ly...");
	}

	@Override
	public List<Person> list() {
		return personDAO.list();
	}

}
