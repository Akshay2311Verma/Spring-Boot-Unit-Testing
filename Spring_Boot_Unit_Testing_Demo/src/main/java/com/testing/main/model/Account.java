package com.testing.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account") 
public class Account {

	@Id
	private int accountId;
	private int balance;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(int accountId, int balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	public Account() {
		super();
		
	}
	
	
	
}
