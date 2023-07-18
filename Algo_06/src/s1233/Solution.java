package s1233;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i =0; i<10; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int ans = 0;
			boolean check = true;
			for(int j =0; j<t;j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();		// 번호 skip
				String a = st.nextToken();
				if(a.equals("*") || a.equals("+") || a.equals("-") || a.equals("/")) {
					if(!st.hasMoreTokens()) {
						check = false;
						break;
					}
					int b = Integer.parseInt(st.nextToken());
					if(1<=b && b <=200) {
						int c = Integer.parseInt(st.nextToken());
						if(1<=c && c <=200) {
							check = true;
							continue;
						} else {
							check = false;
							for(int k=j+1; k<t;k++) {
								st = new StringTokenizer(br.readLine());
							}
							break;
						}
					}
					else {
						check = false;
						for(int k=j+1; k<t;k++) {
							st = new StringTokenizer(br.readLine());
						}
						break;
					}
				}
				if(1<=Integer.parseInt(a) && Integer.parseInt(a) <=200) {
					if(!st.hasMoreTokens()) {
						check =  true;
						continue;
					} else {
						check = false;
						for(int k=j+1; k<t;k++) {
							st = new StringTokenizer(br.readLine());
						}
						break;
					}
				}
			}
			if(check) {
				System.out.println("#"+(i+1)+" "+ 1);
			} else {
				System.out.println("#"+(i+1)+" "+ 0);
			}
			
		}
		
		
	}
}
