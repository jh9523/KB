package b10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		int cnt=0;
		st = new StringTokenizer(br.readLine());
		
		for(int i =0; i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if(a[i]%m == 0) cnt++;
		}
		long sum=0;
		for(int i =0; i<n-1; i++) {
			sum=a[i];
			for(int j =1+i; j<n;j++) {
				sum += a[j];
				if(sum%m==0) {
					cnt++;
				}
			}
			
		}
				
		System.out.println(cnt);
		
		
		
		
		
	}
}
