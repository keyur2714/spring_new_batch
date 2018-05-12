package com.spring.action;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dto.Customer;
import com.spring.exceptions.MyCustomeException;
import com.spring.service.CustomerService;

public class CustomerAction {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		
		CustomerService customerService = applicationContext.getBean("customerServiceImpl",CustomerService.class);
		
		printCustomerDetails(customerService);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Customer Id: ");
		long customerId = scanner.nextInt();
		
		System.out.print("Enter Customer Name: ");
		String customerName = scanner.next();
		
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		customer.setName(customerName);

		int result = customerService.save(customer);
		if(result > 0) 
			System.out.println("Customer Saved Successfully");
		else
			System.out.println("Error in Saving Customer Details");
		
		printCustomerDetails(customerService);
		
		System.out.print("Enter Customer Id for Update: ");
		long customerUpdateId = scanner.nextLong();
		
		if(customerUpdateId > 10) {
			try {
				throw new MyCustomeException();
			} catch (MyCustomeException e) {
				e.printStackTrace();
			}
		}
		
		Customer customerForUpdate = customerService.get(customerUpdateId);		
		
		if(customerForUpdate != null) {
			System.out.println("Custemer is Exist in System please Enter Information to update:::  ");
			System.out.print("Enter Customer Name to be updaetd: ");
			String customerUpdatedName = scanner.next();
			customerForUpdate.setName(customerUpdatedName);
			result = customerService.update(customerForUpdate);
			if(result > 0) {
				System.out.println("Customer Updated Successfully");
			}else {
				System.out.println("Error in Update Customer Details");
			}
		}
		
		printCustomerDetails(customerService);
		
		
		
		
		
	}

	private static void printCustomerDetails(CustomerService customerService) {
		List<Customer> customerList = customerService.getList();
		
		System.out.println("...List Of Customers...");
		for (Customer customer : customerList) {
			System.out.println(customer.getCustomerId()+" "+customer.getName());
		}
	}

}
