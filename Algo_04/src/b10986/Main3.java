package b10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		long[] b = new long[n+1];
		int cnt=0;
		st = new StringTokenizer(br.readLine());
		long sum2 =0;
		for(int i =0; i<n;i++) {
			a[i] = (Integer.parseInt(st.nextToken())) %m;
			sum2 += a[i];
			b[i+1] = sum2;
			if(a[i]%m == 0) cnt++;
		}
		long sum=0;
		for(int i =0; i<n-1; i++) {
			for(int j =1+i; j<n+1;j++) {
				sum = b[j]-b[i];
				if(sum%3 == 0) {
					cnt++;
				}
			}
		}
				
		System.out.println(cnt-1);
		
		
		
		
		
	}
}
