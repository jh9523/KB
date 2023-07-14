package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb1반_알고리즘3번_김준환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] a = new int[24][24];
		for(int i =0; i<19; i++) {	// 판입력
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<19;j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] dx = {0, 1, 1};	
		int[] dy = {1, 1, 0};	
		
		for(int i =0; i<19;i++) {
			for(int j =0; j<19;j++) {
				for(int k =0; k<3; k++) {
					if(a[i][j]!=0) {
						if(a[i][j]==a[i+dx[k]][j+dy[k]] && a[i][j]==a[i+dx[k]+dx[k]][j+dy[k]+dy[k]]) {
							if(a[i][j]==a[i+dx[k]+dx[k]+dx[k]][j+dy[k]+dy[k]+dy[k]] && a[i][j]==a[i+dx[k]+dx[k]+dx[k]+dx[k]][j+dy[k]+dy[k]+dy[k]+dy[k]] ) {
								System.out.println(a[i][j]);
								System.out.println((i+1)+" "+ (j+1));
								return;
								
							}
						}
					}
				}
			}
		}
		
		System.out.println(0);
		
	}
}
