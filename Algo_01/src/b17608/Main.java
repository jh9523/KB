package b17608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer>stk = new Stack<Integer>();
		int t = Integer.parseInt(br.readLine());
		int max = -1;
		int cnt =0;
		for(int i =0; i<t; i++) {
			stk.push(Integer.parseInt(br.readLine()));
		}
		for(int i =0; i<t; i++) {
			int b = stk.pop();
			if(max<b) {
				cnt++;
				max=b;
			}
		}
		
		System.out.println(cnt);
	}
}
