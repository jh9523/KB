import java.util.List;

import cinema.dtos.SeatDto;
import cinema.seat.service.SeatService;
import cinema.seat.service.SeatServiceImpl;
import cinema.util.TheaterException;

public class run {
	private SeatService seatSvc;
	
	
	public static void main(String[] args) {
		new run().go();
	}
	
	
	private void go() {
		init();
		List<SeatDto> list = null;
		try {
			list = seatSvc.check();
			System.out.println("예약 가능 좌석은");
			for(SeatDto dto : list) {
				System.out.println(
						dto.getSeatnum()+"    "+
						dto.getThnum()
						);
			}
		} catch (TheaterException e) {
			e.printStackTrace();
		}
		
		
		
	}
	private void init() {
		seatSvc = new SeatServiceImpl();
	}
	
}
