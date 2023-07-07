package day_01;

public class Varibies_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v ; // 선언 
		v = 30; // 대입
		int x = 50;
		/////
		int g = 65;
		System.out.println(Integer.toBinaryString(g));	// 2진수
		System.out.println(g);
		
		int i2 = 0100;	// 8진수
		System.out.println(i2);
		
		int i3 = 0xabcde;	// 16진수
		System.out.println(i3);
		
		char c1 ='가';
		char c2 = '나';
		System.out.println( c1 < c2 );
		System.out.println(c1);
		int ci1 = c1;
		System.out.println(ci1); // 44032
		ci1++;
		System.out.println(ci1); // 44032
		System.out.println((char) ci1);
		ci1++;
		System.out.println((char) ci1);
		ci1++;
		System.out.println((char) ci1);
		ci1++;
		System.out.println((char) ci1);
		ci1++;
		System.out.println((char) ci1);
		
		boolean b1 = true; 	// false;
		String s1 = "abc";
		byte bt1 = 100;
		int it1 = bt1;
		
//		bt1 = it1    역으로는 ㄴㄴ
		bt1 = (byte)it1;	// 강제 형변환
		
		// 타입명의 첫자가 대문자인것과 기본타입간의 형변환 불가능하다.
		
		byte b22 = 10 + 20;
		b22 = (byte) (b22 + 1);
		
	}

}
