package 재귀호출;

public class 경우의수 {
	static int[] arr;
	static int[] result;
	static int n;
	public static void main(String[] args) {
		// 주어진 원소를 이용한 생성가능한 모든 경우의 수
		// {1, 2, 3} -> 123, 132, 111, 112, 113,...
		// {1, 2, 3} -> 123, 132, 213, 231, 312, 321
		// {1, 2} 중복 사용 가능: 경우의 수: 11, 12, 21, 22
		// {1, 2} 중복 사용 불허: 경우의 수: 12, 21
		arr = new int[] {1, 2, 3}; // 원소 저장
		result = new int[arr.length]; // 답 저장
		n = 3;	// 추출의 갯수
		recur(0);
	}

	private static void recur(int depth) {
		if( depth == n) {	// 종료조건
			print();
			return;
		}
		// 처리코드(깊이의 숫자위치에 i값을 저장)
		for (int i = 0; i < arr.length; i++) {
			result[depth] = arr[i];
			recur(depth+1);
		}
	}

	private static void print() {
		for (int i : result) {
			System.out.print(i);	// 가로로 붙여서 출력
		}
		System.out.println();
	}
}
