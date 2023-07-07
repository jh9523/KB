package day_05;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[4];
		int count = 0;	// 객체저장 위치 -> 저장 개수
		mems[count++] = new MyMember("홍길동", 33);
		mems[count++] = new MyMember("김길동", 35);
		mems[count++] = new MyMember("박길동", 30);
		mems[count++] = new MyMember("홍길동", 33);
		// 배열 정렬은 Arrays.sort(배열)
		Arrays.sort(mems, new NameCompararator());
		
		System.out.println("** 정렬후 **");
		for(int i =0; i<count; i++) {
			System.out.println(mems[i]);
		}
		///
		System.out.println( "mems[2] == mems[3] " + (mems[2] == mems[3]));
		System.out.println( "mems[2].equals(mems[3]) " + (mems[2].equals(mems[3])));
		
		
	}
}
