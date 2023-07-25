package day_0725;

import java.util.HashMap;

public class MapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("홍", 70);
		hm.put("김", 80);
		hm.put("강", 80);
		HashMap<String, HashMap<String, Integer>> h = new HashMap<String, HashMap<String, Integer>>();
		// HashMap에 홍길동의 수학점수 90, 영어점수 80을 저장
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		scoreMap.put("수학", 90);
		scoreMap.put("영어", 80);
		HashMap<String, HashMap<String,Integer>> mainMap = 
				new HashMap<String, HashMap<String,Integer>>();
		mainMap.put("홍: ", scoreMap);
		System.out.println(mainMap);
		
		
	}
}
