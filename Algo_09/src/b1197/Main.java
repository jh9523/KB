package b1197;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[] p;
	static PriorityQueue<pe> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		q = new PriorityQueue<>();
		p = new int[n+1];
		for(int i =0; i<n; i++) {
			p[i]=i;
		}
		
		for(int i =0; i<m; i++) {
			st= new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			q.add(new pe(s, e, v));
		}
		int useEdge = 0;
		int result = 0;
		while(useEdge < n -1) {
			pe now = q.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result = result + now.v;
				useEdge++;
			}
		}
		System.out.println(result);
		
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
	
	
} // Main 끝
class pe implements Comparable<pe>{
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
