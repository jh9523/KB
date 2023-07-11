package b110659;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int b,c =0;
		int sum =0;
		int[] s =new int[n+1];
		int[] a = new int[n];
		for(int i =0; i<n;i++) {
			a[i]= sc.nextInt();
			sum += a[i];
			s[i+1] = sum;
		}
		for(int i =0; i<m; i++) {
			b=sc.nextInt();
			c=sc.nextInt();
			System.out.println(s[c]-s[b-1]);
		}
	}
	
}
