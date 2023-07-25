package day_0725;

public class Review01 {
	public static void main(String[] args) {
		int i = 100;
		long l = 200;
		float f = l;
		long l2 = (long)f;
//		boolean b = (boolean)i;		// 불린 타입으로는 강제형변환 ㄴㄴ
//		String s = (String)i;		// 숫자<->객체 ㄴㄴ
//		큰타입 = 큰타입 - 작은타입;
//		int j = 1.0 + 2;			// 안됨
		
		
		System.out.println(f);
	}
}
