package com.itskb.ws04.service;

import java.util.Comparator;

import com.itskb.ws04.dto.UserDto;

public class UserSeqCompararator implements Comparator<UserDto>{

	@Override
	public int compare(UserDto o1, UserDto o2) {
		return o1.getUserSeq() - o2.getUserSeq();
	}

}
