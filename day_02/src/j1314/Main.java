package j1314;

import java.util.Scanner;

/*
 * 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.

< 처리조건 > 

문자의 진행 순서는 왼쪽 위에서부터 아래쪽으로 ‘A'부터 차례대로 채워나가고 

다시 오른쪽 아래부터 위쪽으로 채워나가는 방법으로 아래 표와 같이 채워 넣는다.

'Z' 다음에는 다시 'A'부터 반복된다.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] a = new char[n+4][n+4];
		int cnt=0;
		int b =0;
		int x=0, y=0;
		
		int[] dx = {0, 1, 0, 1};
		int[] dy = {1, 0, -1, 0};
		System.out.println();
		for(int i = 0; i< n*n; i++) {
			
			a[y][x]=(char) ('A'+i);
			cnt++;
			if(cnt==n) {
				b++;
				cnt =0;
			}
			x += dx[b%4];
			y += dy[b%4];
			
			if(x==(n-1) && y==(n-1)) {
				a[y][x]=(char) ('A'+i);
				break;
			}
			if( b%2==0) {
				i++;
				a[y][x]=(char) ('A'+i);
				b++;
				x += dx[b%4];
				y += dy[b%4];
			}
			
		}
		
		for(int i =0; i<n; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
