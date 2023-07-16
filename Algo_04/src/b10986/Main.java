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
			if(b[i+1] == 0) {									// 0으로 나누어 떨어지는 구간의 갯수는 cnt에 +
				cnt++;										
			}
			idx[(int) b[i+1]]++;								// 나머지값에 따라 카운트해 배열에 저장
		}	
		
		for(int i =0; i<m; i++) {					// 나머지 1인 수 - 나머지 1인 수는 0이기 때문에 같은 나머지를 가진 합 배열의 수를 구한다.
			if(idx[i] > 1) {						// 0이 아닌 배열 ( 0은 이미 카운트함)
				cnt += (idx[i] * (idx[i]-1) / 2);	// nC2 f
			}
		}
		System.out.println(cnt);	// 답 출력
	}
}
