package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kb1반_알고리즘1번_김준환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] a = new int[t];
		for(int i =0; i<t; i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		for(int i=t-1; i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
