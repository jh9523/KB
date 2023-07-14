package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class aa {
	static int t;		// 숫자의 갯수
	static boolean[] visited;	// 사용여부
	static int max;		// 최대값
	static int[] a;		// 숫자 배열
	static int n = 3;	// 답의 길이
	static int[] result;	// 합 저장 배열
	static int[] result2;	// 합 저장 배열
	static int sum;	
	static int answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		t = Integer.parseInt(st.nextToken());	
		max = Integer.parseInt(st.nextToken());	
		visited = new boolean[t];
		result = new int[n];
		a = new int[t];	
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<t; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		recur(0,0);
		System.out.println(answer);
	}

	private static void recur(int depth, int start) {
		if(depth == n) {	// 깊이와 답길이가 동일하면 답출력
			printResult();
			return;
		}
		
		for(int i =start; i<t;i++) {
			if(!visited[i]) {
				result[depth] = a[i];
				visited[i] = true;
				recur(depth+1, i+1);
				visited[i] = false;
			}
		}
		
	}

	private static void printResult() {
		sum =0;
		for(int i : result) {
			sum += i;
			System.out.print(i+" ");
		}
		System.out.println();
		if(sum>answer && max>=answer) {
			answer = sum;
		}
	}
}
