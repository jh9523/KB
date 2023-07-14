package 재귀리뷰;

// 중복배제
public class 경우의수2_순열{
	static int[] arr;	// 원소
	static boolean[] visited;	// 사용여부
	static int n;		// 답의 길이
	static int[] result;	// 답 저장 배열
	public static void main(String[] args) {
		// 원소 {1, 2, 3}에 대한 모든 숫자 조합
		arr = new int[] {1, 2, 3};	// 반복할 숫자
		visited = new boolean[arr.length];	// 원소길이만큼 
		n = 3;	// 출력할 숫자 조합 길이
		result = new int[n];	// 정답 저장할 배열
		
		recur(0);	// 깊이 0 전달
	}
	
	private static void recur(int depth) {
		// 종료조건
		if(depth == n) {	// 깊이와 답길이가 동일하면 답출력
			printResult();
			return;
		}
		// 처리코드(result에 숫자 누적)
		for (int i = 0; i < arr.length; i++) {
			// arr[i] 숫자가 미사용인경우에만 사용
			if(!visited[i]) {
				result[depth] = arr[i];		// 깊이 자리에 i번째 숫자저장
				visited[i] = true;
				recur(depth+1);				// 깊이증가후 재귀호출
				visited[i] = false;
			}
		}
		
	}
	// 답 출력
	private static void printResult() {
		for (int i : result) {	// result에서 순서대로 추출
			System.out.print(i);	// 붙여서 출력
		}
		System.out.println();		// 줄바꿈
	}	
	
}