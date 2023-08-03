package cccc.dao;

import java.sql.SQLException;

import cccc.vo.TheaterDto;
import cinema.util.DuplicatedIdException;

public interface TheaterDao {
	// 등록
	public void add(TheaterDto dto) throws SQLException, DuplicatedIdException;
	
}
