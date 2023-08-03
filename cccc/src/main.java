import java.sql.SQLException;

import cinema.seat.dao.SeatDaoImpl;
import cinema.seat.service.SeatService;
import cinema.seat.service.SeatServiceImpl;
import cinema.util.TheaterException;

public class main {
	
	private SeatService seatSvc;
	
	
	public static void main(String[] args) {
		new main().go();
	}
	
	
	private void go() {
		init();
		try {
			seatSvc.check();
		} catch (TheaterException e) {
			e.printStackTrace();
		}
		
		
	}
	private void init() {
		seatSvc = new SeatServiceImpl();
	}
	
}
