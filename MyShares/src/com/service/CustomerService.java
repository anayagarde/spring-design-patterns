package com.service;


import java.util.ArrayList;
import java.util.List;

import com.dao.CustomerDAO;
import com.dao.ShareDAO;
import com.pojo.Customer;
import com.pojo.Share;

public class CustomerService {
	CustomerDAO dao;

	public CustomerService(CustomerDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}

	public List<String> findAllCustomers() {

		List<Customer> customers = dao.findAllCustomers();
		List<String> names = new ArrayList<String>();
		for (Customer customer : customers) {
			if(customer.getCustomerName().startsWith("a"))
			names.add(customer.getCustomerName());
		}

		return names;

	}

}
