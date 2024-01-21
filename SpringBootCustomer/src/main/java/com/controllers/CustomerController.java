package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dao.CustomerDAO;
import com.pojo.Customer;
import com.pojo.CustomerShare;

@RestController
public class CustomerController {

	@Autowired
	CustomerDAO dao;
//	
//	@GetMapping("/customers/{custid}/shares")
//	public Customer findshares(@PathVariable int custid) {
//		Customer customer = dao.findCustomersById(custid);
//		List<CustomerShare> shares = dao.findCustomersShares(custid);
//		System.out.println("in controller:-"+shares);
//		customer.setShares(shares);
//		return customer;
//	}
	
	@GetMapping("/customers/{custid}/shares")
	public Customer findshares(@PathVariable int custid) {
		Customer customer = dao.findCustomersById(custid);
		RestTemplate template = new RestTemplate();
		ResponseEntity<List> entity = template.getForEntity("http://localhost:8089/customers-shares/"+custid, List.class);
		List<CustomerShare> shares = entity.getBody();
		customer.setShares(shares);
		return customer;
	}
	
	
	
	 */

	
}
