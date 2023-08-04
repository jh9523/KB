package cinema.theater.service;

import java.sql.SQLException;
import java.util.Scanner;

import cinema.util.TheaterException;
import cinema.dtos.TheaterDto;
import cinema.theater.dao.TheaterDao;
import cinema.theater.dao.TheaterDaoImpl;
import cinema.util.DuplicatedIdException;
import cinema.util.RecordNotFoundException;

public class TheaterServiceImpl implements TheaterService {
	private TheaterDao theaterDao = new TheaterDaoImpl();

	@Override
	public boolean add(TheaterDto dto) throws TheaterException {
		try {
			theaterDao.add(dto);
		} catch (SQLException e) {
			throw new TheaterException(e.getMessage());
		} catch (DuplicatedIdException e) {
		}
		return true;
	}

	@Override
	public boolean check(int no) throws TheaterException, RecordNotFoundException {
		try {
			System.out.println("조회하고 싶은 관");
			TheaterDto check = theaterDao.check(no);
			if(check != null) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			return false;
		}
	}

}
