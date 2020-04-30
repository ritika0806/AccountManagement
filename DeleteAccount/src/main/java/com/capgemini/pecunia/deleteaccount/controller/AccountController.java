package com.capgemini.pecunia.deleteaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.deleteaccount.service.AccountManagementServiceImpl;

@RestController
@RequestMapping("/deleteService")
@CrossOrigin("http://localhost:4200")
public class AccountController {
 
	@Autowired
	private AccountManagementServiceImpl service;
	
	
	@DeleteMapping("/delete/{accountId}")
	public ResponseEntity<String> deleteAccount(@PathVariable("accountId") String accountId) 
	{
		ResponseEntity<String> rs =  new ResponseEntity<String>(service.deleteAccount(accountId),HttpStatus.OK);
			  return rs;
	}
	

	
	
	
}
