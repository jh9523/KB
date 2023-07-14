package b2961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int t;	// 음식 갯수
	static int[] s;	// 신맛
	static int[] b;	// 쓴맛
	static int ca = 1000000000;	// 답
	static boolean[] visited;	// 사용여부
	static int sx;	// 신맛 곱
	static int bh;	// 쓴맛 합
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		s = new int[t];
		b = new int[t];
		visited = new boolean[t];
		for(int i =0; i< t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			s[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
		}
		powerSet(0);
		System.out.println(ca);
		
	}

	private static void powerSet(int depth) {
		if(depth == t) {
			printResult();
			return;
		}
		visited[depth] = false;
		powerSet(depth +1);
		
		visited[depth] = true;
		powerSet(depth +1);
	}

	private static void printResult() {
		List<Integer> aa = new ArrayList<Integer>();
		sx=1;
		bh=0;
		for(int i = 0; i<t; i++) {
			if(visited[i] == true) {
				aa.add(i);
			}
		}	// for문 끝
		for(int j=0; j<aa.size();j++) {
//			System.out.print(aa.get(j));
			sx *= s[aa.get(j)];
			bh += b[aa.get(j)];
			System.out.print(b[aa.get(j)]);
		}
		System.out.println();
		if(Math.abs(sx-bh)<ca) {
			ca = Math.abs(sx-bh);
		}
//		System.out.println(ca);
	}
}
