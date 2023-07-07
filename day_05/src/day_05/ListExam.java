package day_05;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("김길동");
		names.add("박길동");
		System.out.println(names);
		names.add(1, "박길동");
		System.out.println(names);
		String r = names.remove(2);
//		names.remove(2);	remove는 지운값이 반환된다.
		System.out.println(r);
		System.out.println(names);
		names.clear();	// 전체삭제
		System.out.println(names);
	}
}
