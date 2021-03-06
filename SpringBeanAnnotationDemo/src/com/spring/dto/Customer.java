package com.spring.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value="cust")
@Scope(value = "singleton")
public class Customer {

	private Long customerId;
	private String name;

	@Autowired
	@Lazy
	private Address address;

	private Contact contact;

	public Long getCustomerId() {
		return customerId;
	}

	@Value(value = "${customer.id}")
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	@Value(value = "${customer.name}")
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}
	@Autowired @Lazy
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
