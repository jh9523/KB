package day_03;

public class Person {

	private String name;
	private int age;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int age, String name) {
		this(name, age);
		System.out.println();
	}
	/** 내부 변수 값을 출력*/
	public int printInfo() {
		System.out.println("name: "+this.name+", age:"+age);
		return 50;
		// this 생략가능
	}

}
