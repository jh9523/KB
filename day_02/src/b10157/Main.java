package b10157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int r = sc.nextInt();
		int x = c;
		int y = 1;
		int cnt =1;
		int go = 0;
		int[][] a = new int[c+2][r+2];
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		
		for(int i =0; i< c+2; i++) {
			a[i][0] = -1;
			a[i][r+1] = -1;
		}
		
		for(int i =0; i< r+2; i++) {
			a[0][i] = -1;
			a[c+1][i] = -1;
		}
		
		a[x][y] =1;
		while(cnt != c*r+1) {
			a[x][y] = cnt++;
			x += dx[go%4];
			y += dy[go%4];
			if(a[x][y] !=0 ) {
				x -= dx[go%4];
				y -= dy[go%4];
				go++;
				x += dx[go%4];
				y += dy[go%4];
			}
			
			
		}
		
		int f = sc.nextInt();
		
		int[][] b = new int[c][r];
		for(int i =0 ; i< c; i++) {
			for(int j =0; j<r; j++) {
				b[i][j] = a[i+1][j+1];
			}
		}
		
		for(int i =0; i< c; i++) {
			for(int j = 0; j< r; j++) {
				if(f==b[i][j]) {
//					System.out.println((j)+" "+(i));
					System.out.println((j+1)+" "+(r-i));
					return;
				}
			}
			
		}
		System.out.println(0);
		
		
//		for(int i =0; i< c; i++) {
//			for(int j = 0; j< r; j++) {
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	}
}
