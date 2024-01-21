package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.connections.MyConnectionFactory;
import com.pojo.Share;

public class ShareDAOImpl implements ShareDAO {

	@Override
	public int addShare(Share share) {
		// TODO Auto-generated method stub
		int added=0;

		
		try {
			
			//PreparedStatement ps=MyConnection.getConnection().prepareStatement("insert into share(instrumentname,marketrate) values(?,?)");
			//get instance of prepare statement
			
			PreparedStatement ps = new MyConnectionFactory().getConnection().prepareStatement("insert into share(instrumentname,marketrate) values(?,?)");
			ps.setString(1,share.getInstrumentName());
			ps.setDouble(2, share.getMarketRate());
			// set the values to PS
			
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//execute the query
			added = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return added; //return the result
	}

	@Override
	public int deleteShare(int shareid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Share> findAllShares() {
		// TODO Auto-generated method stub
		// get connection
		// get instance of Statement
		//
		// execute the query and obtain the resultset
		// walk throu the resultset and get and object per row
		// add the obtained object to the list
		List<Share> shares = new ArrayList<>();

		try {
			//Statement st = MyConnection.getConnection().createStatement();
			
			Connection con = new MyConnectionFactory().getConnection();
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery("select * from share");
			while (set.next()) {
				Share share = new Share(set.getInt(1), set.getString(2), set.getDouble(3));
				shares.add(share);
			}
			//MyConnection.getConnection().close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return shares;
	}

	@Override
	public Share findSharesById(int shareid) {
		// TODO Auto-generated method stub
		return null;
	}

}


