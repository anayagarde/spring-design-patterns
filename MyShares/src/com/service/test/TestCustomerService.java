package com.service.test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dao.CustomerDAOImpl;
import com.pojo.Customer;
import com.service.CustomerService;

public class TestCustomerService {

	
	@Test
	public void testFindAllCustomers() {
		
		CustomerDAOImpl daoImpl = mock(CustomerDAOImpl.class);
		when(daoImpl.findAllCustomers()).thenReturn(Arrays.asList(new Customer("a", 10), new Customer("b", 2), new Customer("c", 3)));
		
		CustomerService service = new CustomerService(daoImpl);
		List<String> list = service.findAllCustomers();
		assertEquals(1,list.size());
	
	}

}
