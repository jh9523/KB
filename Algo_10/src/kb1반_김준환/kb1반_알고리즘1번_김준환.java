package kb1반_김준환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb1반_알고리즘1번_김준환 {
	static int[] p;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());// 마을 사람 수
		int m = Integer.parseInt(br.readLine());// 관계 수
		p = new int[n+1];
		for(int i =0; i<n+1;i++) {
			p[i] = i;	// 배열 초기화
		}
		for(int i =0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			union(n1, n2);
		}
		int cnt =0;
		for(int i = 2; i<=n; i++) {
			if(checksame(1, i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	
	private static boolean checksame(int n1, int n2) {
		int a = find(n1);
		int b = find(n2);
		if( a == b) {
			return true;
		} else {
			return false;
		}
	}
	
	private static void union(int n1, int n2) {
		int a = find(n1);
		int b = find(n2);
		if(a != b) {
			if(a>b) {
				p[a] = b;
			} else {
				p[b] = a;
			}
		}
	}
	
	private static int find(int a) {
		if(a == p[a]) {
			return a;
		} else {
			return p[a] = find(p[a]);
		}
	}
}
