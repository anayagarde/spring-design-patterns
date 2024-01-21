package com.dao;

import java.util.List;

import com.pojo.Customer;
import com.pojo.CustomerShare;

public interface CustomerDAO {
	
	public int addCustomer(Customer customer);
	public int deleteCustomer(int customerid);
	public List<Customer>findAllCustomers();
	public Customer findCustomersById(int customerid);
	public int addSharesToCustomer(int customerId, String shareName, int quantity, String type);
	public List<CustomerShare> findCustomersShares(int customerid);

}
