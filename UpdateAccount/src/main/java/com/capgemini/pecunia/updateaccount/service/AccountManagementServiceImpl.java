package com.capgemini.pecunia.updateaccount.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.updateaccount.dao.AccountManagementDao;


@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService{

	@Autowired
	private AccountManagementDao dao;

	@Override
	public void updateAccount(String accountId,String customerName, String contactNumber, String address) {
		System.out.println("This is accountId"+accountId);
		dao.updateAccount(accountId,customerName,contactNumber,address);
	}
	}

	
