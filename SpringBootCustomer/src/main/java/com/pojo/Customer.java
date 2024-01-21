package com.pojo;

import java.util.List;

public class Customer {
	private String customerName;
	private int customerId;
	List<CustomerShare> shares;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, int customerId, List<CustomerShare> shares) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.shares = shares;
	}

	public Customer(String customerName, int customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<CustomerShare> getShares() {
		return shares;
	}

	public void setShares(List<CustomerShare> shares) {
		this.shares = shares;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + "]";
	}
	


}





