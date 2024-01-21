package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.connections.MyConnection;
import com.pojo.Customer;
import com.pojo.CustomerShare;

public class CustomerDAOImpl implements CustomerDAO {

	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int inserted = 0;

		String INSERT_CUSTOMER = "insert into customer values(?,?)";
		try (Connection connection = new MyConnection().getConnection();) {
			PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER);
			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getCustomerName());
			inserted = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return inserted;
	}
@Override
	public int addSharesToCustomer(int customerId, String shareName, int quantity, String type) {

		int inserted = 0;

		String INSERT_SHARE = "insert into customer_shares(type,quantity,customer_id,shareName) values(?,?,?,?)";
		try (Connection connection = new MyConnection().getConnection();) {
			PreparedStatement ps = connection.prepareStatement(INSERT_SHARE);
			ps.setString(1, type);
			ps.setInt(2, quantity);
			ps.setInt(3, customerId);
			ps.setString(4, shareName);
			inserted = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return inserted;
	}

@Override
	public List<CustomerShare> findCustomersShares(int customerid) {
		// TODO Auto-generated method stub

		String FINDSHARES = "select * from customer_shares where customer_id=?";
		List<CustomerShare> shares = new ArrayList<CustomerShare>();
		try (Connection connection = new MyConnection().getConnection();) {
			PreparedStatement ps = connection.prepareStatement(FINDSHARES);
			ps.setInt(1, customerid);
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				// Customer customer = new Customer(set.getString(2), set.getInt(1));

				CustomerShare customerShare = new CustomerShare(set.getString(5), set.getInt(3), set.getString(2));
				shares.add(customerShare);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return shares;
		// return null;
	}
@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		String FINDCUSTOMERS = "select * from customer";
		List<Customer> shares = new ArrayList<Customer>();
		try (Connection connection = new MyConnection().getConnection();) {
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(FINDCUSTOMERS);
			while (set.next()) {
				Customer customer = new Customer(set.getString(2), set.getInt(1));
				shares.add(customer);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return shares;
	}




	
	@Override
	public int deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public Customer findCustomersById(int customerid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

	

	