package b1325;
/// bfs BFS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] a;
	static boolean[] visited;
	static int[] b;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		a = new ArrayList[n+1];
		for(int i =1; i<=n;i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i =0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			a[e].add(s);
		}
		b = new int[n+1];
		for(int i =1; i<=n; i++) {
			visited = new boolean[n+1];
			bfs(i);
		}
		int max = -1;
		for(int i =1; i<b.length; i++) {
//			if(b[i]> max) {
//				max = b[i];
//			}
			max = Math.max(max, b[i]);
		}
		for(int i =0; i<b.length; i++) {
			if(b[i]== max) {
				System.out.print((i)+" ");
			}
		}
	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(i);
		visited[i] = true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			for(int j : a[now]) {
				if(!visited[j]) {
					visited[j] = true;
					b[i]++;
					q.add(j);
				}
			}
		}
	}
}
