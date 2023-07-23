import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class HW2_b1414_김준환 {
	static int[] p;						// 대표 노드 배열
	static PriorityQueue<pe> q;			// 우선순위 큐
	static int llong;					// 선의 길이 총합
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 문자 입력을 받기 위한 BufferedReader
		StringTokenizer st;							// 한줄에 여러 문자 입력 받을때 필요한 StringTokenizer
		int n = Integer.parseInt(br.readLine());	// 컴퓨터 개수 입력
		p = new int[n+1];					// 대표 노드 배열 선언
		q = new PriorityQueue<>();			// 짧은 선부터 입력하기 위한 우선순위 큐		
		llong = 0;							// 총합
		for(int i =0; i<n; i++) {			// 대표 노드를 자기 자신으로 초기화
			p[i] = i;						
		}
		
		for(int i =1; i< n+1; i++) {
			String b = br.readLine();		// 케이블들을 문자열로 입력 받기
			String[] bb = b.split("");		// 띄어쓰기가 없어 split으로 구분
			for(int k =1; k<n+1;k++) {		
				if(bb[k-1].equals("0")) {	// 0이 입력되면 넘기기
					continue;
				} else {
					char c = bb[k-1].charAt(0);		// 문자이면 문자c에 저장
					int cn = Integer.valueOf(c)-64;	// 아스키코드를 참고해 해당 문자에 대한 아스키코드값 추출
					if(1<=cn && cn<=26) {			// 대문자일 경우
						llong = llong + cn + 26;	// 
						if(i!=k) {					// 자기 자신을 가르키는 경우는 큐에 추가 하지 않는다.
						q.add(new pe(i, k, cn+26));	// 큐에 추가
						}
					}else {							// 소문자일 경우
						llong = llong + cn - 32;
						if(i!=k) {					// 자기 자신을 가르키는 경우는 큐에 추가 하지 않는다.
						q.add(new pe(i, k, cn-32));	// 큐에 추가
						}
					}
				}
				
			}
		}	// 입력 끝
		int usedEdge = 0;	// 사용한 엣지 수
		int cnt =0;			// 무한 루프돌면 탈출시킬 용도
		while(usedEdge < n-1) {	// 모든 컴퓨터가 연결되면 끝
			pe now = q.poll();
			if(now == null) {				// 각 컴퓨터를 연결하기 전에 큐에 비면 -1 출력
				System.out.println(-1);
				return;
			}
			if(find(now.s) != find(now.e)) {	// 컴퓨터가 서로 연결 되있지 않으면 연결
				union(now.s, now.e);
				llong -= now.v;					// 연결에 사용된 선의 길이는 -
				usedEdge++;						// 엣지수 +
			}
			cnt++;
			if(cnt>200) {			// 무한 루프를 돌면 강제 종료
				System.out.println(-1);
				return;
			}
		}
		
		if(llong>=0) {
			System.out.println(llong);	// 남은 선의 길의 출력
		} else {
			System.out.println(-1);
		}
		
		
		
	}
	
	private static void union(int n1, int n2) {		// union 연산 : 대표 노드끼리 연결하기
		int a = find(n1);
		int b = find(n2);
		if(a != b) {
			if(a>b) {			// 작은 값을 가진 대표값으로 연결
				p[a] = b;
			} else {
				p[b] = a;
			}
		}
	}

	private static int find(int a) {		// find 연산
		if(a == p[a]) {
			return a;
		} else {
			return p[a] = find(p[a]);
		}
	}
	
}


class pe implements Comparable<pe>{			//  길이가 작은 큐부터
	int s;
	int e;
	int v;
	pe(int s, int e, int v){
		this.s = s;
		this.e = e;
		this.v = v;
	}
	@Override
	public int compareTo(pe o) {
		return this.v - o.v;
	}
}