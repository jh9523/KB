package day_0725;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExam {
	public static void main(String[] args) {
		try {
			readFile2();
			System.out.println("파일처리성공");
		} catch (FileNotFoundException e) {
			System.err.println("파일 처리 실패");
		}
//		readFile();	
	}	// end main

	private static void readFile() {
		// 파일에서 문자를 읽기
		try {	// 정상 실행 블럭
			FileReader fr = new FileReader("poem.txt");	// 현재폴더 --> 프로젝트 폴더
			System.out.println("파일 열기 성공");
		} catch (FileNotFoundException e) {	// 오류 발생 블럭
			System.out.println("파일 없음");	// 정상적인 상황에서의 메세지 출력
			System.err.println("파일 없");	// 오류 상황에서의 메세지 출력 (빨간색)
			e.printStackTrace();
		}
	}
	
	private static void readFile2() throws FileNotFoundException {
		// 파일에서 문자를 읽기
			
			FileReader fr = new FileReader("poem.txt");	// 현재폴더 --> 프로젝트 폴더
			System.out.println("파일 열기 성공");
		
	}
}
