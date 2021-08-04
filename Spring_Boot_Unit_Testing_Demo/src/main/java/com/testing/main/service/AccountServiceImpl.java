package com.testing.main.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.main.model.Account;
import com.testing.main.repository.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository repo;
	
	public void saveData(Account account) {
		repo.save(account);
		
	}

}
