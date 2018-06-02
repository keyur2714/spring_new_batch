package com.spring.dao;

import java.util.List;

public interface IDAO<T> {
	void save(Object object);
	List<T> list(); 
}
