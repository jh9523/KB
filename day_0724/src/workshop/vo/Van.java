package workshop.vo;
/** 승합차 */
public class Van extends Car {
	private int peopleNum;	// 탑승인원수
	private int jim;		// 적재량
	
	public Van() {
	}

	public Van(int carnum, int price, String type, int year, int bae ,int peopleNum, int jim) {
		super(carnum, price, type, year, bae);
		this.peopleNum = peopleNum;
		this.jim = jim;
	}

	public int getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}

	public int getJim() {
		return jim;
	}

	public void setJim(int jim) {
		this.jim = jim;
	}
	
	@Override
	public String rent() {
		return "승합차";
	}

	@Override
	public String toString() {
		return super.toString()+", peopleNum=" + peopleNum + ", jim=" + jim;
	}
	
	
	
	
	
}
