package b1976;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	static int[] p;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		
		int[][] a = new int[n][n];
		
		for(int i = 0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0; j<t; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		
		
	}
}
