package b10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n  = Integer.parseInt(st.nextToken());
		int x  = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			int k = Integer.parseInt(st.nextToken());
			if(k<x) {
				System.out.print(k+" ");
			}
		}
		
		
	}
}
