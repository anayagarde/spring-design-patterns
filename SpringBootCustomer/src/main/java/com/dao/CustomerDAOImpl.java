package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Customer;
import com.pojo.CustomerShare;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int inserted = 0;

		String INSERT_CUSTOMER = "insert into customer values(?,?)";
		inserted = template.update(INSERT_CUSTOMER, customer.getCustomerId(), customer.getCustomerName());
		
		return inserted;
	}

	@Override
	public int deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		String FINDCUSTOMERS = "select * from customer";
		List<Customer> shares = template.query(FINDCUSTOMERS, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet set, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new Customer(set.getString(2), set.getInt(1));
			}

		});

		return shares;


	}

	@Override
	public Customer findCustomersById(int customerid) {
		// TODO Auto-generated method stub
		String FINDCUSTOMERS = "select * from customer where customerid=?";
		Customer customer = template.queryForObject(FINDCUSTOMERS, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet set, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new Customer(set.getString(2), set.getInt(1));
			}

		},customerid);
		
		return customer;

		
	}


	@Override
	public int addSharesToCustomer(int customerId, String shareName, int quantity, String type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CustomerShare> findCustomersShares(int customerid) {
		// TODO Auto-generated method stub
		String FINDSHARES = "select * from customer_shares where customer_id=?";
		List<CustomerShare> shares = template.query(FINDSHARES, new RowMapper<CustomerShare>() {

			@Override
			public CustomerShare mapRow(ResultSet set, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new CustomerShare(set.getString(5), set.getInt(3), set.getString(2));
			}

		}, customerid);

		System.out.println(shares);
		return shares;

	}

}
