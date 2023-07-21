package kb1반_김준환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb1반_알고리즘3번_김준환 {
	static int an;	// 똥크기
	static int w;	// 위치
	static int n;
	static int[] a;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		an = 0;	// 답
		w = 0;	// 위치
		a = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i =1; i<=n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		if(t>=n) {			// 시간이 더 많으면 다 더함
			for(int i = 1; i<=n; i++) {
				an += a[i];
			}
			System.out.println(an);
			return;
		} else {
			while(t != 0 && w!=n) {
				if(thr(w)>=roll(w)) {
					an = thr(w);
					w++;
					w++;
					t--;
				} else {
					an = roll(w);
					w++;
					t--;
				}
			}
		}
		System.out.println(an);
		
		
	}
	
	public static int thr(int w) {
		int wt = w+2;
		if(wt<=n) {
			int result = a[wt] + (an/2);
			return result;	
		}
		
		return 0;
	}
	
	public static int roll(int w) {
		int wr = w+1;
		int result = a[wr] + an;
		return result;
	}
}
