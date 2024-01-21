package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ShareDAO;
import com.pojo.Share;

@RestController
public class ShareController {
	
	@Autowired
	ShareDAO dao;

	@PostMapping("/shares")
	public Share addShare(@RequestBody Share share) {
		
		int added = dao.addShare(share);
		if(added>0) {
			//return dao.findSharesById(share.getInstrumentId());
		return share;
		}
		return new Share();
	}
}
