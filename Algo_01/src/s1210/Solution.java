package s1210;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] ladder = new int[100][100];
		
		for(int i =0; i< 10; i++) {
			
			int t= sc.nextInt();
			for(int j =0; j<100; j++) {
				for(int k =0; k<100; k++) {
					ladder[j][k] = sc.nextInt();
				}
			}
			// 여기서부터
			
			for(int j = 0; j<100;j++) {
				int x = 98;
				int y =0;
				if(ladder[99][j] == 2) {
					y = j;
					while(x==0) {
						if(ladder[x][y-1] == 1) {
							while(true) {
								y--;
								if(ladder[x-1][y]==1) {
									x--;
									break;
								}
							}
							continue;
						}
						if(ladder[x][y+1] == 1	) {
							while(true) {
								y++;
								if(ladder[x-1][y]==1) {
									x--;
									break;
								}
							}
							continue;
						}
						x--;
					}
					System.out.println("답은: "+y);
					break;
				}
				
			}
			
			
			
//			for(int j =0; j<100; j++) {
//				int k =0;
//				int x=1;
//				int y =1;
//				if(ladder[j][0] ==1 ) {
//					x= j;
//					while(x != 99) {
//						
//						if(ladder[x][y+1]==1) {
//							y++;
//							while(ladder[x+1][y]!=1) {
//								y++;
//							}
//							x++;
//						}
//						
//						if(ladder[x][y-1]==1) {
//							while(ladder[x+1][y]!=1) {
//								y--;
//							}
//							x++;
//						}
//						x++;
//					}
//					if(ladder[x][y] == 2) {
//						System.out.println("답은: "+j);
//						break;
//					}
//					
//				}
//			}
//			int a = Integer.parseInt(st.nextToken());
			
			
			
			
			
		}
		
	}
}
