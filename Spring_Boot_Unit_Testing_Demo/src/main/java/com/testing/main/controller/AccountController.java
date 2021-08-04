package com.testing.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.main.model.Account;
import com.testing.main.service.AccountService;

@RequestMapping("/v1/accounts")
@RestController
public class AccountController {

	@Autowired
	AccountService accountService; 
	
	@PostMapping("save")
	public ResponseEntity<String> saveAccount(@RequestBody Account account)
	{
		accountService.saveData(account);
		return new ResponseEntity<String>("User Register Successfully", HttpStatus.CREATED);
	}
	
}
