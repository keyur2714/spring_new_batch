package com.spring.dto;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Person {

	private int pid;
	@Size(min = 3, max = 50)
	private String name;
	@NotEmpty
	private String city;
	@NotEmpty
	private String mobileNo;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
