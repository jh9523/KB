package s1251;

import java.util.Scanner;

public class Solution {
	static int[][] a;
	static int[] p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int r = 0; r<t; r++) {
			int n = sc.nextInt();
			a = new int[n][2];
			p = new int[n+1];
			for(int i =0; i<n; i++) {
				p[i]=i;
			}
			
			for(int i =0; i<n; i++) {
				a[i][0] = sc.nextInt();
			}
			for(int i =0; i<n; i++) {
				a[i][1] = sc.nextInt();
			}
			double e = sc.nextDouble();
			
			
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
	
	
	public static int dis(int n1, int n2) {
		
		int result = (int)Math.sqrt(Math.pow(a[n1][0]-a[n2][0], 2) + Math.pow(a[n1][1]-a[n2][1], 2));
		result = (int)Math.pow(result, 2);
		return result;	// 제곱해서 전송
	}
}
