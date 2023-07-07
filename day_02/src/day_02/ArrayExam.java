package day_02;

public class ArrayExam {

	public static void main(String[] args) {
		int[] arr; // 선언
		arr = new int[3]; // 대입
		System.out.println(arr);	// [I@3d012ddd	[ = 배열, I = int형
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr);
		// 변수 선언할떄 배열 대입
		int[] arr2 = {100, 200, 300};	// 선언, 대입을 한번에
//		arr2 = {100, 200, 300};		// 오류 발생
		System.out.println(arr2[2]);
		int[] arr3 = new int[] {100, 200, 300};	// 선언, 대입을 한번에
		arr3 = new int[] {100, 200, 300};	// 주소 바뀜
		/////
		String s = "kim";	// new String("kim"); 원래는 이렇게 만들어야함
		int i = 50;
		System.out.println(arr3.length);
		
	}
}
