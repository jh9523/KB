package day_02;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		System.out.println("이름을 입력하세요>> ");
		Scanner sc = new Scanner(System.in);
//		sc.next(); // 글자 한개 단어씩 추출
//		sc.nextInt(); // 숫자 한개씩 추출
//		sc.nextLine(); // 한줄씩 추출
		String name = sc.next();
		System.out.println("이름은 "+ name);
		System.out.println("태어난 해를 4자리로 입력하세요>>> ");
		int y = sc.nextInt();
		System.out.println("태어난 해는 "+ y);
		int age = 2023 - y;
		System.out.println("나이는" + age);
	}
}
