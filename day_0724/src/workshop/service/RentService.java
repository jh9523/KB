package workshop.service;

import java.util.ArrayList;

import workshop.vo.Car;
import workshop.vo.Member;
import workshop.vo.Rent;

public class RentService {
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Member> mems = new ArrayList<Member>();
	private ArrayList<Rent> rents =  new ArrayList<Rent>();
	
	
	public void add(Car car) {
		cars.add(car);
	}


	public void add(Member mem) {
		mems.add(mem);
	}

	private int rentalSeq = 1;	// 대여 일련번호

	public void rent(int i, int carnum, int price, String rentDate, int l, String string2, int m) {
//		rents.add(new Rent(rentalSeq++, carnum, price,rentDate ));
		
	}
	
	
	
}
