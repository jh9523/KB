package day_0725;

import java.util.HashSet;

public class SetExam {
	public static void main(String[] args) {
		// Set은 중복저장 안됨, 순서 없음
		HashSet<String> hs = new HashSet<String>();
		hs.add("홍");
		hs.add("김");
		hs.add("박");
		hs.add("홍");	// 중복저장
		System.out.println(hs);
		hs.remove("김");
		System.out.println(hs);
		
	}
}
