package cccc.vo;

import java.sql.SQLException;

import cinema.util.DuplicatedIdException;

public interface SeatDao {
	// 등록
	public void add(SeatDto dto) throws SQLException, DuplicatedIdException;
	
	
}
