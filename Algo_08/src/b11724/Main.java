package b11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//todo
public class Main {
	static ArrayList<Integer>[] a;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		a = new ArrayList[n+1];
		visited = new boolean [n+1];
		for(int i =0; i<=n;i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i =0; i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			a[s].add(e);
			a[e].add(s);
		}
		
		
		
	}
}
