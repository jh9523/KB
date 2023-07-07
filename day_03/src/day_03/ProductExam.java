package day_03;

public class ProductExam {
	public static void main(String[] args) {
		Product p1 = new Product("a100","냉장고","삼성", 100);
		p1.printInfo();
//		p1.count++;	// 비추 클래스.count 추천
		Product p2 = new Product("a100","냉장고","삼성", 100);
		
//		Product p2 = null;
//		p2.price = 100;
		System.out.println(Product.count);
		System.out.println("End");
	}
}
