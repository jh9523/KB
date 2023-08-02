package day_0802;

import java.sql.SQLException;
import java.util.List;

import day_0802.dao.BoardDao;
import day_0802.dao.DuplicatedIdException;
import day_0802.dao.RecordNotFoundException;
import day_0802.vo.BoardDto;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao = new BoardDaoImpl();
	
	@Override
	public List<BoardDto> list() throws BoardException {
		List<BoardDto> list = null;
		try {
			list = boardDao.list();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BoardException(e.getMessage());
		}
		return list;
	}

	@Override
	public BoardDto read(int no) throws BoardException, RecordNotFoundException {
		BoardDto dto = null;
		try {
			dto = boardDao.findById(no);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BoardException(e.getMessage());
		}
		return dto;
	}

	@Override
	public boolean update(BoardDto dto) throws BoardException, RecordNotFoundException {
		try {
			boardDao.update(dto);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BoardException(e.getMessage());
		} 
		return true;
	}

	@Override
	public boolean delete(int no) throws BoardException, RecordNotFoundException {
		try {
			BoardDto dto = boardDao.findById(no);
			if (dto == null) {//해당번호가 없음
				throw new RecordNotFoundException();
			}
			boardDao.delete(no);
		} catch (SQLException e) {
			throw new BoardException(e.getMessage());
		} 
		return true;
	}

	@Override
	public int count() throws BoardException {
		int count=0;
		try {
			count = boardDao.count();
		} catch (SQLException e) {
			throw new BoardException(e.getMessage());
		}
		return count;
	}

	@Override
	public boolean add(BoardDto dto) throws BoardException {
		try {
			boardDao.add(dto);
		} catch (SQLException e) {
			throw new BoardException(e.getMessage());
		} catch (DuplicatedIdException e) {
		}
		return true;
	}

}