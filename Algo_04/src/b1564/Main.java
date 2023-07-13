package b1564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = fac(n);
		int length = (int)(Math.log10(a)+1);
		int[] arr = new int[length];
		String str = Integer.toString(a);
		String[] strs = str.split("");
		for(int i =length; i>0; i--) {
			if(Integer.parseInt(strs[i])!=0) {
				System.out.print(strs[i]+strs[i-1]+strs[i-2]+strs[i-3]+strs[i-4]);
			}
		}
		
	}

	private static int fac(int n) {
		// 종료
		if(n<=1) {
			return n;
		}
		return n*fac(n-1);
	}
}
