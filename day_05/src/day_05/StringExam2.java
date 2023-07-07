package day_05;

public class StringExam2 {
	public static void main(String[] args) {
		String s = "홍길동";
		String s2 = "멀티캠퍼스";
		System.out.println(s.length());	// 문자열 길이
		System.out.println(s.charAt(1));	// 문자 추출
		System.out.println(s2.indexOf("캠퍼스"));	// 검색
		System.out.println(s.startsWith("김"));	// 시작하는 글자
		System.out.println(s.startsWith("홍"));	// 시작하는 글자
		System.out.println(s.endsWith("동"));	// 끝나는 글자, 확장자 찾을때 많이 씀
		System.out.println(s.endsWith("동"));	// 끝나는 글자, 확장자 찾을때 많이 씀
		String s3 = "10,20,30";
		String[] split = s3.split(",");
		String s4 = "abcd";
		String s5 = s4.toUpperCase();
		System.out.println(s4 == s5);
		// String은 불변객체. 한번 만들어진 후 내부값 변경 불가
		// 문자열 변경 메소드 실행 결과로 새로운 문자열을 반환한다.
		
		
	}
}
