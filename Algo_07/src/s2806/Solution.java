package s2806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int[] arr;
	static int sum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i =0 ; i<t;i++) {
			sum=0;
			int n = Integer.parseInt(br.readLine());
			arr = new int[n];
			queen(0,n);
			int ans = 0;
			if(sum!=0) {
				ans=sum;
			}
			System.out.println("#"+(i+1)+" "+ ans);
		}
		
		
		
		
	}
	private static void queen(int start, int n) {
		if(start == n) {
			sum++;
			return;
		} 
		
		for(int j =0; j<n; j++) {
			boolean check = true;
			for(int k =0; k<start; k++) {
				if(arr[k] == j || arr[k]+(start-k) == j || arr[k]-(start-k) == j) {
					check = false;
					break;
				}
			}
			if(check) {
				arr[start]= j;
				queen(start+1,n);
			} 
			
		}
		
		
		
	}
}
