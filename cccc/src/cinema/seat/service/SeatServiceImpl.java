package cinema.seat.service;

import java.sql.SQLException;
import java.util.List;

import cinema.util.TheaterException;
import cinema.dtos.SeatDto;
import cinema.seat.dao.SeatDao;
import cinema.seat.dao.SeatDaoImpl;
import cinema.util.DuplicatedIdException;
import cinema.util.RecordNotFoundException;

public class SeatServiceImpl implements SeatService {
	
	private SeatDao seatDao = new SeatDaoImpl();
	
	@Override
	public boolean add(SeatDto dto) throws TheaterException {
		try {
			seatDao.add(dto);
		} catch (SQLException e) {
			throw new TheaterException(e.getMessage());
		} catch (DuplicatedIdException e) {
		}
		return true;
	}


	@Override
	public List<SeatDto> check(int thnum) throws TheaterException {
		List<SeatDto> list = null;
		try {
			list = seatDao.list(thnum);
		} catch(SQLException e) {
			e.printStackTrace();
			throw new TheaterException(e.getMessage());
		}
		return list;
	}

}
