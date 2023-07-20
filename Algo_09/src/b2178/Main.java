package b2178;
// 틀림 수정 필요
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] a;
	static boolean[][] visitied;
	static int[] dx = { 0 , 1, 0, -1} ;
	static int[] dy = { 1 , 0, -1, 0};
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new int[n][m];
		visitied = new boolean[n][m];
		for(int i =0; i<n;i++) {
			String s = br.readLine();
			String[] ss = s.split("");
			for(int j =0; j<m; j++) {
				a[i][j] = Integer.parseInt(ss[j]);
			}
		}
		
		bfs(0,0);
		System.out.println(a[n-1][m-1]);
	}


	private static void bfs(int c, int d) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { c, d});
		visitied[c][d] = true;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			for(int i =0; i<4; i++) {
				int x = now[0] + dx[i];
				int y = now[1] + dy[i];
				if(x >=0 && y>= 0 && x <n && y<n) {	// 좌표가 범위안이면
					if(a[x][y] != 0 && !visitied[x][y]) {
						visitied[x][y] = true;
						a[x][y] = a[now[0]][now[1]] +1;
						q.add(new int[] {x,y});
					}
				}
				
				
			}
			
			
			
			
		}
		
		
	}
}
