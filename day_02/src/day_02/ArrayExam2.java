package day_02;

public class ArrayExam2 {
	public static void main(String[] args) {
		int i = 5;
		int[] arr = {10, 20, 30};
		int[][] arr2 = { {2, 3}, {4, 5}, {8, 9}};
		int[][] arr3 = { {80, 90, 96} , {76, 88}};
//		자바는 255차원까지 지원
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[0].length);
		System.out.println(arr3[1].length);
		System.out.println(arr3[0][0]);
		int[][] arr4 = new int[][] {
			new int[] { 80, 90, 96},
			new int[] {76, 88}
		};
		// 처음부분만 확정, 뒷부분은 나중에
		int[][] arr5 = new int[2][];	
		arr4[0] = new int[3];
		arr4[1] = new int[2];
		arr4[0][0] = 80;
		arr4[0][1] = 90;
		arr4[0][2] = 96;
		arr4[1][0] = 76;
		arr4[1][1] = 88;
		
	}
}
