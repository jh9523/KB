package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ttest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int llong = 0;
		
		for(int i =1; i< n+1; i++) {
			String b = br.readLine();
			String[] bb = b.split("");
			for(int k =1; k<n+1;k++) {
				if(bb[k-1].equals("0")) {
					continue;
				} else {
					char c = bb[k-1].charAt(0);
					int cn = Integer.valueOf(c)-64;
					if(1<=cn && cn<=26) {
//						a[i] = cn+26;
//						q.add(new pe(i, k, cn+26));
						System.out.println((cn+26)+" "+i);
						llong = llong + cn + 26;
					}else {
//						a[i] = cn-32;
//						q.add(new pe(i, k, cn-32));
						llong = llong + cn - 32;
						System.out.println((cn-32)+" "+i);
					}
				}
				
			}
		}	// 입력 끝
		System.out.println(llong);
	}
}
