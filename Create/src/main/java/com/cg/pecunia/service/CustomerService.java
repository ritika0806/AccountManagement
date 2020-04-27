package com.cg.pecunia.service;

import org.springframework.transaction.annotation.Transactional;

import com.cg.pecunia.dao.CustomerDao;
import com.cg.pecunia.dto.Customer;

public class CustomerService {
	CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Transactional(readOnly=true)
	public Customer getCustomer(String customerId)
	{
		return customerDao.findById(customerId).get();
	}
	
	@Transactional
	public void addCustomer(Customer customer)
	{
		customerDao.save(customer);
	}

}
