package b9742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int num;	// 출력할 번호
	private static int tcnt;	// 순열의 갯수
	private static char[] chars;	// 값을 담을 배열
	private static boolean[] visited;	// 중복방지용
	private static String answer;	// 정답
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null) {	// 추가 입력 없을시 종료
			StringTokenizer st = new StringTokenizer(line);
			String str = st.nextToken();
			num = Integer.parseInt(st.nextToken());
			
			tcnt = 0;
			chars = new char[str.length()];
			visited = new boolean[str.length()];
			
			recur(str, 0);
			
			if(tcnt<num) answer = "No permutation";
			System.out.println(str + " " + num+" = "+ answer);
		}
		return;
	}

	private static void recur(String str, int cnt) {
		if(cnt == str.length()) {
			tcnt++;
			if(tcnt == num) answer = new String(chars);
			return;
		}
		
		for(int i=0; i<str.length();i++) {
			if(!visited[i]) {
				visited[i]=true;
				chars[cnt] = str.charAt(i);
				recur(str, cnt+1);
				visited[i] = false;
			}
		}
	}
	


}