package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ShareDAO;
import com.pojo.Share;

@Controller
public class SearchCustomerController {

	@Autowired
	ShareDAO dao1;
	
	@RequestMapping(value = "searchShares.htm", method = RequestMethod.GET)
	public ModelAndView searchShares() {
		List<Share> shares = dao1.findAllShares();
		return new ModelAndView("shares", "shares", shares);
	}

}
