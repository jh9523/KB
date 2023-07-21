package b14502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 벽 1, 빈칸 0, 바이러스 2
public class Main {
	static int[][] y;

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		y = new int[n][m];
		for(int i =0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0;j<m;j++) {
				y[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		
		
		
	}
}
