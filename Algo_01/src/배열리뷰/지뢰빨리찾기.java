package 배열리뷰;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 지뢰빨리찾기 {
	public static void main(String[] args) {
		/* 10X10 좌표에 10개 임의의 위치에 지뢰를 매설
		 * 사용자는 행,열 좌표를 입력, (1~10, 1~10)
		 * 해당 좌표가 지뢰이면 X표시. 아니면 주위 8칸내 지뢰갯수 표시
		 * 열지 않은 좌표는 "+" 표시 
		 * 
		 * 1. 12X12 정수배열생성
		 * 2. 중복되지 않는 10개 좌표 생성
		 * 3. 각좌표에 9저장. 주위 8개에 1씩 증가
		 * 4. (반복)
		 * 5. 사용자로부터 좌표입력(행, 열)
		 * 6. 해당좌표의 값이 9이상이면 "지뢰찾음" 출력
		 * 7. 해당좌표가 9미만이면 "지뢰아님" 출력
		 * 8. 전체배열 출력(+: 오픈 안한 좌표, 숫자: 지뢰아닌곳, X: 지뢰)
		 * 9. 지뢰 10개를 다 찾으면 종료. 아니면 5번부터 반복
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[12][12];
		boolean[][] opens = new boolean[12][12];	// 좌표오픈 여부
		String[][] open = new String[12][12];	// 좌표오픈 여부
		int remainMines = 10;	// 남은 지뢰 갯수
		List<Integer> bb = new ArrayList<Integer>();
		for(int i = 10; i<110; i++) {
			bb.add(i);
		}
		
		for(int i =0; i<10; i++) {
			int b = (int) (Math.random()*(111-i));
			int r = bb.get(b);
			bb.remove(b);
			int t = r/10;
			int o = r%10 +1;
			a[t][o] = 9;
			a[t-1][o-1]++;	
			a[t][o-1]++;	
			a[t+1][o-1]++;	
			a[t-1][o]++; 	
			a[t+1][o]++;	
			a[t-1][o+1]++;	
			a[t][o+1]++;	
			a[t+1][o+1]++;	
			System.out.println(b);
		}
		
		for(int i=0; i<12;i++) {
			for(int j = 0; j<12; j++) {
				open[i][j] = "+";
			}
		}
		
		while(remainMines != 0) {
			System.out.println("행 열을 입력하시오(1~10) 띄어쓰기로 구분: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(a[x][y] >= 9) {
				if(opens[x][y]=false) {
					open[x][y] = "X";
					remainMines--;
					opens[x][y] = true;
				}
				else {
					System.out.println("이미 열었습니다.");
					continue;
				}
			} else {
				open[x][y] = Integer.toString(a[x][y]);
			}
			for(int j =1; j<11; j++) {
				for(int k =1; k<11; k++) {
					System.out.print(open[j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("남은 지뢰: "+ remainMines);
		}
	}
}
