package 스택리뷰;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		IntStack st = new IntStack();
		st.push(100);
		st.push(500);
		st.push(300);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		/// 
		Stack<Integer> a = new Stack<Integer>();
		a.push(2);
		a.push(3);
		a.push(5);
		a.push(1);
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		
	}
}
