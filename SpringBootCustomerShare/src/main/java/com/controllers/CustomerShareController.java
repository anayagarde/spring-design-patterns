package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerShareDAO;
import com.pojo.CustomerShare;

@RestController
public class CustomerShareController {

	@Autowired
	CustomerShareDAO dao;
	
	@RequestMapping(value = "/customers-shares/{customerid}", method = RequestMethod.GET)
	public List<CustomerShare> searchCustomerShares(@PathVariable int customerid) {

		List<CustomerShare> shares = dao.findCustomersShares(customerid);
		return shares;
	}
}
