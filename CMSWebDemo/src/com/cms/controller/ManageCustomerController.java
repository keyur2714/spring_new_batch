package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cms.dto.Customer;
import com.cms.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class ManageCustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String getCustomerList(ModelMap map) {
		List<Customer> customerList = customerService.getList();
		map.put("customerList", customerList);
		return "customer/list";
	}
	
}
