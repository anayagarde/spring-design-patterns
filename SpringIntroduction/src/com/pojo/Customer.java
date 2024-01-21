package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "mycust")
public class Customer {

	private int custId;
	private String custName;
	
	@Autowired
	@Qualifier(value="s")
	private Share share;
	
	public Customer() {
		
	}
	public Customer(int custId, String custName, Share share) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.share = share;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Share getShare() {
		return share;
	}
	public void setShare(Share share) {
		this.share = share;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", share=" + share + "]";
	}
	
	
}
