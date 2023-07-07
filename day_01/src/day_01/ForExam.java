package day_01;

public class ForExam {

	public static void main(String[] args) {
		// 1~5까지 출력
		for(int i = 0; i<5; i++) {
			System.out.println(i+1);
		}
		System.out.println("--------");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		for (int i = 1, j=200; i <= 5; i++,j--) {
			System.out.println(i);
			System.out.println(j);
		}
	}
}
