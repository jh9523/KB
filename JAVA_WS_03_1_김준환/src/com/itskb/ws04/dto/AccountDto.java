package com.itskb.ws04.dto;

public class AccountDto implements Comparable<AccountDto> {
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;
	
	public AccountDto() {}
	
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		super();
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}



	// getter setter
	public int getAccountSeq() {
		return accountSeq;
	}
	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	
	// tostring
	@Override
	public String toString() {
		return "[ accountSeq=" + accountSeq + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", userSeq=" + userSeq+"] ";
	}

	@Override
	public int compareTo(AccountDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
