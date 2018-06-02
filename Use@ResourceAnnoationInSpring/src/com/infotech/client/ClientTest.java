package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Address;
import com.infotech.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student = context.getBean("student", Student.class);
		if(student != null){
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getPhone());
			
			Address address = student.getAddress();
			if(address != null){
				System.out.println(address.getAddressId()+"\t"+address.getCity()+"\t"+address.getStreet()+"\t"+address.getZipCode());
			}
		}
	}

}
