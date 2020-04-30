package com.capgemini.pecunia.deleteaccount.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.deleteaccount.dao.AccountManagementDao;


@SuppressWarnings("unused")
@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService {
 
	@Autowired
	private AccountManagementDao dao;

	@Override
	public String deleteAccount(String accountId) {
		System.out.println("this is service"+accountId);
		
		  dao.deletecustomer(accountId);
		  dao.deleteAccount(accountId);
		 return "deleted account";
	
	}
	}



	
