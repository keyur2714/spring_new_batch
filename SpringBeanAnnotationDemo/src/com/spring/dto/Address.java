package com.spring.dto;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Address implements InitializingBean{

	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String pinCode;

	public String getAddress1() {
		return address1;
	}

	@Value(value = "A-1106 Alcove Society")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	@Value(value = "Kunal Icon Road,Pimle Saudagar")
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	@Value(value = "Pune")
	public void setCity(String city) {		
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@Value(value = "Maharashtra")
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	@Value(value = "India")
	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	@Value(value = "411027")
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello I am Lazy...");
	}

}
