package cccc.vo;

import java.sql.SQLException;

import cinema.util.TheaterException;
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
	public boolean update(SeatDto dto) throws TheaterException, RecordNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
