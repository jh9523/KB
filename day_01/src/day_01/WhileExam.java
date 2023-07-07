package day_01;

public class WhileExam {

	public static void main(String[] args) {
		// 1~5까지
		int count = 0;
		while (count<=5) {
			count++;
			if(count==2)
				continue;
			if(count==3) {
				break;
			}
			System.out.println(count);
		}
		System.out.println("End");
	}
	
	
	/*	자바 3가지 영역
	 *  Method(Static, Class) Area
	 *  Heap
	 *  Stack
	 * */
}
