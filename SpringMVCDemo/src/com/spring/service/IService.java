package com.spring.service;

import java.util.List;

public interface IService<T> {

	void save(Object object);
	
	List<T> list();
	
}
