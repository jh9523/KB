package com.itskb.ws04.service;

import java.util.ArrayList;
import java.util.Collections;

import com.itskb.ws04.dto.AccountDto;
import com.itskb.ws04.dto.UserDto;

public class BankService  {
	private ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	private ArrayList<UserDto> userList = new ArrayList<UserDto>();
	
	public BankService() {
		accountList.add(new AccountDto(100, "111-222", 10000, 1000));
		accountList.add(new AccountDto(101, "111-333", 30000, 1002));
		accountList.add(new AccountDto(103, "222-222", 20000, 1001));
		accountList.add(new AccountDto(102, "444-111", 100000, 1001));
		userList.add(new UserDto(1002, "홍길동", "hong@naver.com", "010-111-2222", true));
		userList.add(new UserDto(1001, "김길동", "kim@naver.com", "010-222-4322", false));
		userList.add(new UserDto(1000, "박길동", "park@naver.com", "010-333-1222", true));
		
	}

	public ArrayList<AccountDto> getAccountList(int userSeq) {
		ArrayList<AccountDto> result = new ArrayList<AccountDto>();
		for (AccountDto ac : accountList) {
			if(userSeq == ac.getUserSeq()) {
				result.add(ac);
			}
		}
		return result;
	}
	
	public UserDto getUserDetail(int userSeq) {
		for(UserDto u : userList) {
			if(userSeq == u.getUserSeq()) {
				return u;
			}
		}
		return null;
	}

	public ArrayList<AccountDto> getAccountList() {
		return accountList;
	}
	
	public ArrayList<AccountDto> getAccountListSortByBalance(){
		BalanceCompararator bc = new BalanceCompararator();
		Collections.sort(accountList, bc);
		return accountList;
	}
	
	public ArrayList<UserDto> getAccountListSortByUserSeq(){
		UserSeqCompararator uc = new UserSeqCompararator();
		Collections.sort(userList, uc);
		return userList;
	}
	
}
