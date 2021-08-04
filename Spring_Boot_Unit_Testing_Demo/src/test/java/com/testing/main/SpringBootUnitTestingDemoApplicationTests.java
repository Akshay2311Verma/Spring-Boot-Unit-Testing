package com.testing.main;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.testing.main.model.Account;
import com.testing.main.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootUnitTestingDemoApplicationTests {

	@Autowired
	AccountService accountservice;
	
	@Test
	public void saveAccount()
	{
		Account acc = new Account(1001,34444);
		accountservice.saveData(acc);
	}

}
