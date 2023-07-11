package b110659;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Buff {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(st.nextToken());	// 수의 갯수	
		int quizNo = Integer.parseInt(st.nextToken());	// 합의 갯수
		long[] s = new long[suNo + 1];	// 합의 배열
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i<= suNo; i++) {
			s[i] = s[i-1] + Integer.parseInt(st.nextToken());
		}
		for(int q = 0;q < quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(s[j] - s[i-1]);
		}
	}
	
}
