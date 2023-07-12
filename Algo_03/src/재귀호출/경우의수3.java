package 재귀호출;

public class 경우의수3 {	// 숫자는 1번씩 사용됨. 2개 숫자만 추출
	static int[] arr;
	static int[] result;
	static int n;
	static boolean[] visited;	// 사용 여부 저장
	public static void main(String[] args) {
		n = 2;	// 추출의 갯수
		arr = new int[] {1, 2, 3}; // 원소 저장
		result = new int[n]; // 답 저장
		visited = new boolean[arr.length];
		recur(0);
	}

	private static void recur(int depth) {
		if( depth == n) {	// 종료조건
			print();
			return;
		}
		// 처리코드(깊이의 숫자위치에 i값을 저장)
		for (int i = 0; i < arr.length; i++) {
			if(visited[i] == false) {	// i번째 숫자가 미사용
				result[depth] = arr[i];
				visited[i] = true;
				recur(depth+1);
				visited[i] = false;	// 되돌려줌
			}
		}
	}

	private static void print() {
		for (int i : result) {
			System.out.print(i);	// 가로로 붙여서 출력
		}
		System.out.println();
	}
}
