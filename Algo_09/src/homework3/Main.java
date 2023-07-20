package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	static int[] p;
	static PriorityQueue<pe> q;
	static int llong;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());	// 컴퓨터 개수 입력
		p = new int[n+1];
		q = new PriorityQueue<>();
		llong = 0;
		for(int i =0; i<n; i++) {
			p[i] = i;
		}
		
		for(int i =1; i< n+1; i++) {
			String b = br.readLine();
			String[] bb = b.split("");
			for(int k =1; k<n+1;k++) {
				if(bb[k-1].equals("0")) {
					continue;
				} else {
					char c = bb[k-1].charAt(0);
					int cn = Integer.valueOf(c)-64;
					if(1<=cn && cn<=26) {
						llong = llong + cn + 26;
						if(i!=k) {
							q.add(new pe(i, k, cn+26));
						}
					}else {
						llong = llong + cn - 32;
						if(i!=k) {
							q.add(new pe(i, k, cn-32));
						}
					}
				}
				
			}
		}	// 입력 끝
		int usedEdge = 0;
		int aaaa = llong;
		int cnt =0;
		while(usedEdge < n-1 || !q.isEmpty()) {
			pe now = q.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				llong -= now.v;
				usedEdge++;
			}
			cnt++;
			if(cnt>100) {
				System.out.println(-1);
				return;
			}
		}
		
		if(llong>=0) {
			System.out.println(llong);
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
