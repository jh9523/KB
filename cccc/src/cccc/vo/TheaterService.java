package cccc.vo;


import cinema.util.RecordNotFoundException;
import cinema.util.TheaterException;

public interface TheaterService {
	// 등록
	public boolean add(TheaterDto dto) throws TheaterException;
	// 수정
	public boolean update(TheaterDto dto) throws TheaterException, RecordNotFoundException;
	
	
	
}
