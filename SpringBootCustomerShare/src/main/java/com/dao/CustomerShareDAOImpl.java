package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.CustomerShare;

@Repository
public class CustomerShareDAOImpl implements CustomerShareDAO {

	
		// TODO Auto-generated method stub
		@Autowired
		JdbcTemplate template;
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

			return shares;
		}

	}


