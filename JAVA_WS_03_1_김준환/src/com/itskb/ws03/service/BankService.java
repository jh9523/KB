package com.itskb.ws03.service;

import java.util.ArrayList;
import com.itskb.ws03.dto.AccountDto;
import com.itskb.ws03.dto.UserDto;

public class BankService  {
	private ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	private ArrayList<UserDto> userList = new ArrayList<UserDto>();
	
	public BankService() {
		accountList.add(new AccountDto(100, "111-222", 10000, 1000));
		accountList.add(new AccountDto(101, "111-333", 30000, 1002));
		accountList.add(new AccountDto(103, "222-222", 20000, 1001));
		accountList.add(new AccountDto(102, "444-111", 100000, 1001));
	}

	public ArrayList<AccountDto> getAccountList() {
		return accountList;
	}
	
	public UserDto getUserDetail(int userSeq) {
		return null;
	}

	public ArrayList<UserDto> getUserList() {
		return userList;
	}
	
	public ArrayList<UserDto> getAccountListSortByBalance(){
		return null;
	}
	
	public ArrayList<UserDto> getAccountListSortByUserSeq(){
		return null;
	}
	
	public ArrayList<AccountDto> PrintAll() {
		return null;
	}
	
	
	
}
