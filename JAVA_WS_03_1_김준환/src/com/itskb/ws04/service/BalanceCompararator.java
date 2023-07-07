package com.itskb.ws04.service;

import java.util.Comparator;

import com.itskb.ws04.dto.AccountDto;

public class BalanceCompararator implements Comparator<AccountDto>{

	@Override
	public int compare(AccountDto o1, AccountDto o2) {
		return o1.getBalance() - o2.getBalance();
	}

	
}
