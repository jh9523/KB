import java.util.List;
import java.util.Scanner;

import cinema.dtos.SeatDto;
import cinema.seat.service.SeatService;
import cinema.seat.service.SeatServiceImpl;
import cinema.theater.service.TheaterService;
import cinema.theater.service.TheaterServiceImpl;
import cinema.util.RecordNotFoundException;
import cinema.util.TheaterException;

public class rrun {
	private SeatService seatSvc;
	private TheaterService theaterSvc; 
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		new rrun().go();
	}
	
	
	private void go() {
		init();
		List<SeatDto> list = null;
		System.out.println("상영관번호를 입력해주세요.>> ");
		int thnum = Integer.parseInt(sc.nextLine());
		try {
			list = seatSvc.check(thnum);
			System.out.println("예약 가능 좌석은");
			System.out.println("상영관 | 좌석");
			for(SeatDto dto : list) {
				System.out.println(" "+
						dto.getThnum()+"       "+
						dto.getSeatnum()
						);
			}
		} catch (TheaterException e) {
			e.printStackTrace();
		}
		
		try {
			boolean  aaa = theaterSvc.check(3);				// 딴데서 받음
			if(aaa) {
				System.out.println("있다");
			} else {
				System.out.println("없");
			}
			
			
		} catch (TheaterException e) {
			e.printStackTrace();
		} catch (RecordNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	private void init() {
		seatSvc = new SeatServiceImpl();
		theaterSvc = new TheaterServiceImpl();
	}
	
}