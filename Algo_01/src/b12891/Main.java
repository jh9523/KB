package b12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st= new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		String dna = br.readLine();
		st= new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		
		
		
//		int cnt = 0;
//		for(int i =0; i<s-w+1;i++) {
//			int a1 = 0, c1=0, g1=0, t1=0;
//			for(int j =0; j<w;j++) {
//				if(dna.charAt(i+j)=='A') a1++;
//				if(dna.charAt(i+j)=='C') c1++;
//				if(dna.charAt(i+j)=='G') g1++;
//				if(dna.charAt(i+j)=='T') t1++;
//			}
//			if(a1>= a && c1>= c && g1>=g1 && t1>=t) {
//				cnt++;
//			}
//			
//			
//		}
//	
//		System.out.println(cnt);
	}
}
