package b10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 숫자 갯수 입력
		int m = Integer.parseInt(st.nextToken());	// 나눌값 입력
		long[] b = new long[n+1];	// 합배열
		long cnt=0;					// 나누어 떨어지는 갯수
		long[] idx = new long[m];	// 나머지 0~m-1저장
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<n;i++) {
			b[i+1] = (b[i]+Long.parseLong(st.nextToken())) % m;	// 합을 나누어 나머지값으로 저장
			if(b[i+1] == 0) {									// 
				cnt++;										
			}
			idx[(int) b[i+1]]++;
		}
		
		for(int i =0; i<m; i++) {
			if(idx[i] > 1) {
				cnt += (idx[i] * (idx[i]-1) / 2);
			}
		}
		System.out.println(cnt);	// 답 출력
	}
}
