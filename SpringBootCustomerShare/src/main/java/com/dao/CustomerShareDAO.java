package com.dao;

import java.util.List;

import com.pojo.CustomerShare;

public interface CustomerShareDAO {

		public List<CustomerShare> findCustomersShares(int customerid);
	
}
