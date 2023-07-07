package day_05;

public class StringExam {
	public static void main(String[] args) {
		System.out.println( "홍길동".compareTo("박길동")  );
		// String 비교
		String s1 = "abc";
		String s2 = "abc";	// s1과 같다
		String s3 = new String("abc");
		String s4 = new String("abc");	// s3와 주소가 다르다
		System.out.println("s1=s2 " + (s1 == s2));
		System.out.println("s3=s4 " + (s3 == s4));
		// 내부 문자열 비교
		System.out.println("s3.equals(s4) "+ s3.equals(s4));
		System.out.println("s1.equals(s4) "+ s1.equals(s4));
		
		
	}
}
