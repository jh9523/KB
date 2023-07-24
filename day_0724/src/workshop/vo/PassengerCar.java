package workshop.vo;
/** 승용차 */
public class PassengerCar extends Car {
	
	private int peopleNum;
	
	public PassengerCar() {
	}

	public PassengerCar(int carnum, int price, String type, int year, int bae ,int peopleNum) {
		super(carnum, price, type, year, bae);
		this.peopleNum = peopleNum;
	}

	public int getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	
	@Override
	public String rent() {
		return "승용차";
	}

	@Override
	public String toString() {
		return super.toString()+", peopleNum=" + peopleNum;
	}
	
	
	
	
	
}
