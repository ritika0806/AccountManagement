package com.capgemini.pecunia.updateaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.updateaccount.service.AccountManagementService;

@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	AccountManagementService service;
	
	@PutMapping("/update")
	public void updateAccount(@RequestParam String accountId,@RequestParam String customerName,@RequestParam String contactNumber,
			@RequestParam String address) {
		service.updateAccount(accountId,customerName,contactNumber,address);
	}
	
	
	
}