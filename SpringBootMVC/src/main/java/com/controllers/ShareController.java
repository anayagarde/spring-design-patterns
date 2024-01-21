package com.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ShareDAO;
import com.pojo.Share;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin

@RestController
public class ShareController {
	
	@Autowired
	ShareDAO dao;

	@RequestMapping(value="/data",method=RequestMethod.GET)
	public String message() {
		
		return "welcome to REST";
	}


@RequestMapping(value = "/shares/{id}", method = RequestMethod.GET)
public Share showShares(@PathVariable int id) {

	return dao.findSharesById(id);
}

@RequestMapping(value = "/shares", method = RequestMethod.GET)
public List<Share> showShares() {

	//return Arrays.asList(new Share(1, "name1", 200.20), new Share(2, "name2", 300.20),
		//	new Share(10, "name10", 9200.20));
	return dao.findAllShares();
}


}

