package cinema.seat.service;

import cinema.util.TheaterException;

import java.util.List;

import cinema.dtos.SeatDto;
import cinema.util.RecordNotFoundException;

public interface SeatService {
	// 등록
	public boolean add(SeatDto dto) throws TheaterException;
	// 빈자리 조회
	public List<SeatDto> check() throws TheaterException;
}
