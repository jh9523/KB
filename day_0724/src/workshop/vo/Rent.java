package workshop.vo;

public class Rent {
	private int rentNum;	// 대여번호
	private int carnum;		// 차번호
	private int membnum;	// 대여자 회원번호
	private int price;		// 대여비
	private String rentDate;	// 대여일
	private String rentTime;	// 대여시간
	private String returnDate; 	// 반납일
	private String returnTime;	// 반납시간
	
	public Rent() {
	}

	public int getRentNum() {
		return rentNum;
	}

	public void setRentNum(int rentNum) {
		this.rentNum = rentNum;
	}

	public int getCarnum() {
		return carnum;
	}

	public void setCarnum(int carnum) {
		this.carnum = carnum;
	}

	public int getMembnum() {
		return membnum;
	}

	public void setMembnum(int membnum) {
		this.membnum = membnum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getRentTime() {
		return rentTime;
	}

	public void setRentTime(String rentTime) {
		this.rentTime = rentTime;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	@Override
	public String toString() {
		return "rentNum=" + rentNum + ", carnum=" + carnum + ", membnum=" + membnum + ", price=" + price
				+ ", rentDate=" + rentDate + ", rentTime=" + rentTime + ", returnDate=" + returnDate + ", returnTime="
				+ returnTime;
	}
	
	
	
}
