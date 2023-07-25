package day_0725;

import java.util.Random;

public class RandomExam {
	public static void main(String[] args) {
		Random r = new Random(500);	// 값을 입력하면 정해진 난수가 순서대로 나온다.
		int ri = r.nextInt(45)+1;	
		System.out.println(ri);
		ri = r.nextInt(45)+1;	
		System.out.println(ri);
		ri = r.nextInt(45)+1;	
		System.out.println(ri);
	}
}
