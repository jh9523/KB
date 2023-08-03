package cccc.vo;

import cinema.util.TheaterException;
import cinema.util.RecordNotFoundException;

public interface SeatService {
	// 등록
	public boolean add(SeatDto dto) throws TheaterException;
	// 수정
	public boolean update(SeatDto dto) throws TheaterException, RecordNotFoundException;

}
