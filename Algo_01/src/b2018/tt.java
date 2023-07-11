package b2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int[][] a = new int[3][3];
		
		for(int i =0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0; j<3; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		System.out.println(t);
		System.out.println();
		
	}
}
