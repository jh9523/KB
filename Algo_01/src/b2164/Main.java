package b2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i =1; i<=t;i++) {
			q.add(i);
		}
		while(q.size()>1) {
			q.poll();
			q.add(q.poll());
			
		}
		System.out.println(q.poll());
		
	}
}
