package b1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] a;
	static int[] b;
	
	static int binarySearch(int q) {
		int pl=0;
		int pr = n-1;
		
		
		int result = 0;
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		a = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		int f = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i =0; i<f;i++) {
			binarySearch(Integer.parseInt(st.nextToken()));
			
		}
		 
		
		
		
		
	}
}
