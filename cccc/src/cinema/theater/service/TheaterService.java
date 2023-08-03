package cinema.theater.service;


import cinema.dtos.TheaterDto;
import cinema.util.RecordNotFoundException;
import cinema.util.TheaterException;

public interface TheaterService {
	// 등록
	public boolean add(TheaterDto dto) throws TheaterException;
	// 확인
	public boolean check(TheaterDto dto) throws TheaterException, RecordNotFoundException;
	
	
}
