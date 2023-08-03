package cccc;

import java.sql.SQLException;

import cccc.dao.TheaterDao;
import cccc.vo.TheaterDto;
import cccc.vo.TheaterService;
import cinema.util.TheaterException;
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
	public boolean update(TheaterDto dto) throws TheaterException, RecordNotFoundException {
		return false;
	}

}
