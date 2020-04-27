package com.cg.pecunia.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.pecunia.dao.AccountDao;
import com.cg.pecunia.dao.CustomerDao;
import com.cg.pecunia.dto.Account;
@Service
public class AccountService {
	AccountDao accountDao;
	CustomerDao customerDao;
	public AccountDao getAccountDao() {
		return accountDao;
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Transactional(readOnly=true)
	public Optional<Account> getAccount(String accountId)
	{
		return accountDao.findById(accountId);
	}
	
	@Transactional
	public String addAccount(Account account)
	{
		
		customerDao.save(account.getCustomer());
		if(accountDao.save(account)!=null)
			return "Account created";
		else
			return "Account creation failed";
	}


}
