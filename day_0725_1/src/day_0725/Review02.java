package day_0725;

public class Review02 {
	int i;	// 멤버변수, 필드
	String str;	// 멤버는 자동 초기화
	public static void main(String[] args) {
		int i = 0;	// 지역변수	초기화 안한 선언 -> 초기화 후 사용
		System.out.println(i);
		String str;
		str = null;
		System.out.println(str);
	}
}
