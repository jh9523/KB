package b1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int cnt =1;
		int[][] arr = new int[n][2];
		for(int i =0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);	// 람다식
		
		int end = arr[0][1];
		for(int i =1; i<n; i++) {
			if(end<=arr[i][0]) {
				end = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
