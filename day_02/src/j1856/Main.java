package j1856;

import java.util.Scanner;

/*
 * 사각형의 높이 n과 너비 m을 입력받은 후 

사각형 내부에 지그재그 형태로 1부터 n*m번까지 숫자가 차례대로 출력되는 프로그램을 작성하시오. 

< 처리조건 > 

숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 m만큼 진행 한 후 방향을 바꾸어서 이를 반복한다. 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int cnt = 1;
		
		int[][] a = new int[n][m];
		
		for(int i =0; i<n; i++) {
			if(i%2 == 0) {
				for(int j =0; j<m; j++) {
					a[i][j] = cnt++;
				}
			} else if(i%2 == 1) {
				for(int j = m-1; j>=0;j--) {
					a[i][j] = cnt++;
				}
			}
		}
		
		for(int i =0; i<n;i++) {
			for(int j = 0; j<m; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
