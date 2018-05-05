package com.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.configuration.Appconfiguration;
import com.spring.dto.Customer;
import com.spring.service.CustomerService;

public class ClientTest {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfiguration.class);
		
		Customer customer = applicationContext.getBean("cust",Customer.class);
		
		System.out.println(customer.getCustomerId()+" "+customer.getName()+" ");
		
		System.out.println(customer.getAddress().getAddress1());
		
		System.out.println(customer.getContact().getMobileNo());
		
		CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
		
		System.out.println(customerService.getAbstractCustometInfo());
	}

}
