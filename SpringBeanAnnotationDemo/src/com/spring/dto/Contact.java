package com.spring.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Contact {

	private String mobileNo;
	private String email;

	public String getMobileNo() {
		return mobileNo;
	}

	@Value(value="7387029671")
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	@Value(value="keyurjava27@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

}
