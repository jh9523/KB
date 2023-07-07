package day_03;

/** 상품 기본 정보 정의용 클래스 */

public class Product {
	String code;	// 상품코드
	String name;	// 상품이름
	String company;	// 제조사
	int price;		// 상품가격
	static int count = 0;	// static은 클래스 소속
	
	static public void prn() { 
		Product p1 = new Product("11", "11", "11", 100);
		p1.price = 200;
	}
	
	public Product(String code, String name, String company, int price) {
		super();	
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		count++;
	}
	public void printInfo() {
		System.out.println("code="+code+", "
				+ "name="+name+", company="+company+", price="+price);
	}
	
	
	
	
	
	
}
