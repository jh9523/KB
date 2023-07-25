package workshop.run;

import workshop.service.RentService;
import workshop.vo.Bus;
import workshop.vo.Car;
import workshop.vo.CorporateMember;
import workshop.vo.IndividualMember;
import workshop.vo.Member;
import workshop.vo.PassengerCar;
import workshop.vo.Truck;
import workshop.vo.Van;

public class RentExam {
	public static void main(String[] args) {
		RentService rs = new RentService();
		Car car = new PassengerCar(7492, 10, "승용차", 2018, 2500, 3);
		rs.add( car );
		car = new Van(3265, 15, "승합차", 2015, 3500, 5, 3);
		rs.add( car );
		car = new Truck(4521, 20, "트럭", 2023, 5000, 10);
		rs.add( car );
		car = new Bus(7032, 30, "버스", 2009, 8000, 25);
		rs.add( car );
		
		
		Member mem = new IndividualMember(100, "개인", "010-3453-2424", "홍길동");
		rs.add( mem );
		mem = new CorporateMember(2000, "법인", "02-3433-3321", "(주)멀캠", 3232);
		rs.add(mem);

		rs.rent(100, 7492,10, "2023-07-01",7,"2023-07-07",17 );
	
	}
}
