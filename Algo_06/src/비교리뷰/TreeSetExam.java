package 비교리뷰;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();	// TreeSet은 들어가면서 정렬
		ts.add(30);
		ts.add(200);
		ts.add(100);
		ArrayList<Integer> arr = new ArrayList<Integer>(ts);
		System.out.println(arr);
		///////////////
		HashSet<Integer> hs = new HashSet<Integer>();	// HashSet은 앞자리 기준으로 정렬
		hs.add(30);
		hs.add(100);
		hs.add(200);
		arr = new ArrayList<Integer>(hs);
		System.out.println(arr);
	}
}
