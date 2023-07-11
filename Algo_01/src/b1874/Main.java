package b1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Stack<Integer> a = new Stack<Integer>();
		ArrayList<Character> b = new ArrayList<Character>();
		int[] num = new int[t];
		for(int i = 0; i<t;i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int n =0;
		int i = 1;
		while(i<t+2) {
			if(a.size() == 0) {
				a.push(i++);
				b.add('+');
				continue;
			}
			if(num[n]==a.peek()) {
				b.add('-');
				a.pop();
				n++;
			} else {
				b.add('+');
				a.push(i++);
			}
			if(n==t) {
				for(int j=0; j<b.size();j++) {
					System.out.println(b.get(j));
				}
				return;
			}
		}
		System.out.println("NO");
		
	}
}
