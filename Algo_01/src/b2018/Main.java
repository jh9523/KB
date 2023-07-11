package b2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum =1;
		while(end_index != n) {
			if(sum == n) {
				count++;
				end_index++;
				sum += end_index;
			} else if( sum > n) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		
		System.out.println(count);
		
	}
}
