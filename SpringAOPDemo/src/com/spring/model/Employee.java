package com.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Employee {

	private String empId;
	private String name;
	private String city;
	private String mobileNo;

	public String getEmpId() {
		return empId;
	}

	@Value("27")
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	@Value("keyur")
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	@Value("surat")
	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	@Value("7387029671")
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", mobileNo=" + mobileNo + "]";
	}

}
