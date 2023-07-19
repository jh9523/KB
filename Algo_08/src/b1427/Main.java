package b1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] b = a.split("");
		int[] n = new int[b.length];
		
		for(int i =0; i<b.length; i++) {
			n[i] = Integer.parseInt(b[i]);
		}
		Arrays.sort(n);
		for(int i =n.length-1; i>=0; i--) {
			System.out.print(n[i]);
		}
	}
}
