package workshop.vo;

public class Car {
	private int carnum;	// 차번호
	private int price;	// 대여비
	private String type;	// 차종
	private int year;	// 연식
	private int bae;	// 배기량
	
	public Car() {
	}

	public Car(int carnum, int price, String type, int year, int bae) {
		super();
		this.carnum = carnum;
		this.price = price;
		this.type = type;
		this.year = year;
		this.bae = bae;
	}

	public int getCarnum() {
		return carnum;
	}

	public void setCarnum(int carnum) {
		this.carnum = carnum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getBae() {
		return bae;
	}

	public void setBae(int bae) {
		this.bae = bae;
	}
	
	public String rent() {
		return "";
	}

	@Override
	public String toString() {
		return "[carnum=" + carnum + ", price=" + price + ", type=" + type + ", year=" + year + ", bae=" + bae
				+ "]";
	}
	
	
	
}
