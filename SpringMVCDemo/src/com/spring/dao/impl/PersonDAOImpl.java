package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.PersonDAO;
import com.spring.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Object object) {
		Session session = sessionFactory.openSession();
		session.save(object);
		session.close();
	}

	@Override
	public List<Person> list() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Person P");
		List<Person> personList = query.list();
		return personList;
	}

}
