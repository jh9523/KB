package b1717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] p;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		p = new int[n+1];
		for(int i =0; i<n+1;i++) {
			p[i] = i;
		}
		for(int i =0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			if(c==0) {
				union(n1, n2);
			} else {
				if(checksame(n1, n2)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			
		}
		
	
	
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
