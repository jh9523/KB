package day_03;

public class PersonExam {
	public static void main(String[] args) {
//		Person p1 = new Person();	// 변수 선언( 변수 생성) 지역변수 local 변수  stack에 생성 메서드코드 샐행할때 메서드 종료하면 삭제됨
//		p1.name = "김길동";
//		p1.age = 33;
		Person p1 = new Person();
		p1.printInfo();
		
		
		
		Person p2 = new Person("박길동", 35);
		p2.printInfo();
		
		Person p3 = new Person(35, "강길동");
		p3.printInfo();
	}
}
