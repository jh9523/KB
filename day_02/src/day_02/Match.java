
package day_02;

import java.util.Scanner;

public class Match {
	public static void main(String[] args) {
		int ran = (int)(Math.random()*100 + 1);
		int a = 1000;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1~100 사이 숫자를 입력하세요");
			a = sc.nextInt();
			if(ran == a) {
				System.out.println("정답");
				break;
			} else if (ran>a) {
				System.out.println("올려주세요");
			} else if (ran<a) {
				System.out.println("내려주세요");
			}
			
			
		}
		
	}

}
