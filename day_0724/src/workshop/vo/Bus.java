package workshop.vo;
/** 버스 */
public class Bus extends Car {
	private int peopleNum;	// 탑승 인원수
	
	public Bus() {
	}

	public Bus(int carnum, int price, String type, int year, int bae ,int peopleNum) {
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
		return "버스";
	}

	@Override
	public String toString() {
		return super.toString()+", peopleNum=" + peopleNum;
	}
	
}
