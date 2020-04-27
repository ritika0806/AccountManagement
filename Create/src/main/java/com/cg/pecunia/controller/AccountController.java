package com.cg.pecunia.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pecunia.dto.Account;
import com.cg.pecunia.service.AccountService;
@RestController
public class AccountController {
	AccountService accountService;
	public void getAccountService(AccountService accountService)
	{
		this.accountService=accountService;
	}
	
	@GetMapping("/getAccount/{accountId}")
	public ResponseEntity<Optional<Account>> getAccount(String accountId)
	{
		Optional<Account> account =  accountService.getAccount(accountId);
  	  if(account.isPresent())
  		  return new ResponseEntity<Optional<Account>>(account,HttpStatus.OK);
  	  return new ResponseEntity<Optional<Account>>(account,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/addAccount")
	public ResponseEntity<String> addAccount(@RequestBody()Account account)
	{
		try
  	  {
			accountService.addAccount(account);
  	      return new ResponseEntity<String>("Account created",HttpStatus.OK);
  	  }
  	  catch(Exception ex)
  	  {
  	    	return new ResponseEntity<String>(ex.getMessage()+" Account Creation Failed",HttpStatus.BAD_REQUEST);
  	  } 
	}

}
