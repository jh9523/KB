package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		int[] a = new int[9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		String[] bb = b.split("");
		int llong = 0;
		for(int i =0; i<9;i++) {
			if(bb[i].equals("0")) {
				a[i] =0;
			} else {
				char c = bb[i].charAt(0);
				int cn = Integer.valueOf(c)-64;
				if(1<=cn && cn<=26) {
					a[i] = cn+26;
					llong = llong+ cn+26;
				}else {
					a[i] = cn-32;
					llong = llong+ cn-32;
				}
			}
			
		}
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(llong);
		
		
		
	}
}
