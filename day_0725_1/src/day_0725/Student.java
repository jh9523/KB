package day_0725;

public class Student implements MyDrawable {
	private String name, jeongong;
	
	public Student() {
	}

	public Student(String name, String jeongong) {
		super();
		this.name = name;
		this.jeongong = jeongong;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJeongong() {
		return jeongong;
	}

	public void setJeongong(String jeongong) {
		this.jeongong = jeongong;
	}

	@Override
	public String toString() {
		return "name=" + name + ", jeongong=" + jeongong ;
	}

	@Override
	public void draw() {
		System.out.println("draw 학생");
	}
	
	
	
}
