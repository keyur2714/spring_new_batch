package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.dto.Customer;

@Service
public class CustomerService {

	@Autowired	
	Customer customer;
	
		
	public String getAbstractCustometInfo() {
		return customer.getCustomerId()+" "+customer.getAddress().getAddress1();
	}
	
}
