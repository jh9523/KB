package kb1반_김준환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class kb1반_알고리즘2번_김준환 {
	static int[] dx = {-1, 0, 1, 0};	// 상, 우, 아, 좌
	static int[] dy = {0, 1, 0, -1};
	static boolean visited[][];
	static int[][] a;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new int[m][n];
		for(int i =0; i<m; i++) {
			String s = br.readLine();
			String[] ss = s.split("");
			for(int j=0; j<n; j++) {
				a[i][j] = Integer.parseInt(ss[j]); 
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		x--;
		y--;
		visited= new boolean[m][n];
		a[x][y] = 2;
		bfs(x,y);
		int cnt =0;
		int max = -1;
		for(int i =0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] == 1) {
					cnt++;
				}
				if(max<a[i][j]) {
					max = a[i][j];
				}
			}
		}
		System.out.println(++max);
		System.out.println(cnt);
	}
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {x,y});
		visited[x][y] = true;
		while(!q.isEmpty()) {
			int now[] = q.poll();
			for(int k =0; k<4; k++) {
				int hx = now[0] + dx[k];
				int hy = now[1] + dy[k];
				if(hx >= 0 && hy>=00 && hx <m && hy < n) {	// 좌표 유효성 검사
					if(a[hx][hy] != 0 && !visited[hx][hy]) {
						visited[hx][hy] = true;
						a[hx][hy] = a[now[0]][now[1]] +1;
						q.add(new int[] {hx, hy});
					}
				}
			}
			
			
			
			
		}
		
	}
}
