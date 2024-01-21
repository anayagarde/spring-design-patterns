package com.dao.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dao.ShareDAO;
import com.dao.ShareDAOImpl;
import com.pojo.Share;

public class TestShareDAOImpl {

	ShareDAO dao;
	
	@Before
	public void setUp() throws Exception {
		dao = new ShareDAOImpl();
	}

	@After
	public void tearDown() throws Exception { 
		dao=null;
	}

	@Test
	public void testAddShare() {
		
		int added = dao.addShare(new Share("test share", 100));
		assertEquals(1, added);
	}

	@Test
	public void testFindAllShares() {
		
		List<Share> shares = dao.findAllShares();
		assertEquals(11, shares.size());
		
	}

	
	//use ctr + d to delete a line in this
}
