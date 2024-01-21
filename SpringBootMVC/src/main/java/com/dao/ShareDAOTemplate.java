package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Share;

@Repository(value="dao1")
public class ShareDAOTemplate implements ShareDAO {


	@Autowired
	JdbcTemplate template;
	
	@Override
	public int addShare(Share share) {
		// TODO Auto-generated method stub
		int added = template.update("insert into share(instrumentname,marketrate) values(?,?)",
				share.getInstrumentName(), share.getMarketRate());
		return added;

	}

	@Override
	public int deleteShare(int shareid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Share> findAllShares() {
		// TODO Auto-generated method stub
		
		List<Share> shares=template.query("select * from share", new RowMapper<Share>() {

			@Override
			public Share mapRow(ResultSet set, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new Share(set.getInt(1), set.getString(2),set.getDouble(3));
			}} );

		return shares;
	}

	@Override
	public Share findSharesById(int shareid) {
		// TODO Auto-generated method stub
		Share share=template.queryForObject("select * from share where instrumentid=? ", new RowMapper<Share>() {

			@Override
			public Share mapRow(ResultSet set, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new Share(set.getInt(1), set.getString(2),set.getDouble(3));
			}},shareid );

		return share;
	}


}
