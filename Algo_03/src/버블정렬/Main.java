package 버블정렬;

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
		
		for(int i = 0; i< t; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i =0; i<t-1; i++) {
			for(int j =t-1; j>0; j--) {
				if(a[j]<a[j-1]) {
					int tmp = a[j-1];
					a[j-1] = a[j];
					a[j] = tmp;
				}
			}
			for(int j =0; j<t; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
	}
}
