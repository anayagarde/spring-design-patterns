package com.dao;

import java.util.List;

import com.pojo.Share;

public interface ShareDAO {
	
	public int addShare(Share share);
	public int deleteShare(int shareid);
	public List<Share>findAllShares();
	public Share findSharesById(int shareid);
	
}
