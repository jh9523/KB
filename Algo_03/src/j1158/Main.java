package j1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int[] a = new int[t];
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<t; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
	}
}
