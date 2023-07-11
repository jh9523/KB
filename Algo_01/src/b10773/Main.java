package b10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> m = new Stack<Integer>();
		for(int i = 0; i < t; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a>0) {
				m.push(a);
			} else if(a==0) {
				m.pop();
			}
		}
		int sum=0;
		int nn = m.size();
		for(int i =0; i<nn; i++) {
			sum = sum+ m.pop();
		}
		System.out.println(sum);
	}
}
