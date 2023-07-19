package s5521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
	static ArrayList<Integer>[] a;
	static boolean[] visited;
	static int n;
	static int m;
	static List<Integer> list;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		
		for(int i =1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			a = new ArrayList[ n +1 ];
			list = new ArrayList<>();
			for(int j =1; j<=n; j++) {
				a[j] = new ArrayList<Integer>();
			}
			for(int j =0; j<m; j++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				a[s].add(e);
				a[e].add(s);
			}
			
			for(int j =1; j<=n; j++) {
				Collections.sort(a[j]);
			}
			visited = new boolean[n+1];
			if(!a[1].isEmpty()) {
				
				bfs(1);
				int u = list.size(); 
				for(int k=0; k<u; k++) {
					bfs(list.get(k));
				}
				
				Set<Integer> set = new HashSet<Integer>(list);
				if(set.contains(1)) {
					set.remove(1);
				}
				list = new ArrayList<Integer>(set);
				
				System.out.println("#"+i+" "+ (list.size()));
				
			} else {
				System.out.println("#"+i+" "+ 0);
			}
			
		}
		
	}


	private static void bfs(int f) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(f);
		visited[f] =true;
			int now = q.poll();
			for(int i : a[now]) {
				if(visited[i] == false) {
					visited[i] = true;
					q.add(i);
					list.add(i);
				}
			}
		
	}
}
