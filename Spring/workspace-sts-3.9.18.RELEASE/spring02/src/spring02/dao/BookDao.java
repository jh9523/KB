package spring02.dao;

import org.springframework.stereotype.Component;

import spring02.dto.BookDto;


import spring02.dto.BookDto;

@Component
public class BookDao {

	public void insert(BookDto dto) {
		System.out.println("BookDao.insert !!");
	}

}