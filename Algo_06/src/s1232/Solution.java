package s1232;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static class Node{
		int value;	// 노드값
		char opr;	// 노드 연산자
		int left, right;	// 자식노드번호
		public Node(int value, char opr, int left, int right) {
			super();
			this.value = value;
			this.opr = opr;
			this.left = left;
			this.right = right;
		}
		public Node(int value) {
			this(value, '\0', 0, 0);
		}
		
		
		
	}
	static int N;		// 노드갯수
	static int result;	// 계산 결과
	static Node[] nodes;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int t =0; t<1;t++) {
			N = Integer.parseInt(br.readLine());
			nodes = new Node[ N+1 ];
			for(int i =0; i<N;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				String b = st.nextToken(); 
				if(st.hasMoreTokens()) {
					char op = b.charAt(0);
					int d = Integer.parseInt(st.nextToken());
					int e = Integer.parseInt(st.nextToken());
					nodes[a] = new Node( 0, op,d, e );
				} else {
					int c = Integer.parseInt(b);
					nodes[a] = new Node(c);
				}
			}
			
			int answer = calc( nodes[1] );
			System.out.println(answer);
		}
		
		
//		N = 5;
//		nodes = new Node[ N+1 ];
//		nodes[1] = new Node( 0, '-', 2, 3 );
//		nodes[2] = new Node( 0, '-', 4, 5 );
//		nodes[3] = new Node( 10 );
//		nodes[4] = new Node( 88 );
//		nodes[5] = new Node( 65 );
		
		
	}
	private static int calc(Node node) {
		// 연산자 추출
		char opr = node.opr;
		if(opr == '-') {
			return  calc(nodes[ node.left]) - calc(nodes[ node.right]);
		} else if(opr == '+') {
			return  calc(nodes[ node.left]) + calc(nodes[ node.right]);
		} else{
			return  node.value;
		}
	}
	
	
}
