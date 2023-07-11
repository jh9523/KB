package b11660;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i =0; i<n; i++) {
			for(int j =0; j< n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][] d= new int[n+1][n+1];
		
		for(int i =1; i<n+1; i++) {
			for(int j =1; j< n+1; j++) {
				d[i][j] = d[i][j-1] + d[i-1][j] -d[i-1][j-1] + a[i-1][j-1];
			}
		}
		
//		for(int i =1; i<n+1; i++) {
//			for(int j =1; j< n+1; j++) {
//				System.out.print(d[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		for(int i=0; i<m;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			System.out.println(d[x2][y2]-d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1]);
			
		}
		
		
	}
}
