package com.itskb.ws03.main;

import com.itskb.ws03.dto.AccountDto;
import com.itskb.ws03.dto.UserDto;
import com.itskb.ws03.service.BankService;

public class BankExam {
	public static void main(String[] args) {
		BankService bankService = new BankService();
		System.out.println(bankService.getAccountList());
		System.out.println(bankService.getAccountListSortByBalance());
		System.out.println(bankService.getAccountListSortByUserSeq());

	}
}
