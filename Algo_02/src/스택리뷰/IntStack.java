package 스택리뷰;

import 스택리뷰.IntStack.EmptyIntStackException;
import 스택리뷰.IntStack.OverflowIntStackException;

public class IntStack {
	public class OverflowIntStackException extends RuntimeException {
	}

	public class EmptyIntStackException extends RuntimeException {
	}

	private int[] stk;
	private int capacity;	// 최대저장갯수
	private int ptr = 0;		// 현재저장 할 위치(현재저장갯수)

	public IntStack(int len) {
		stk = new int[len];
		capacity = len;
	}

	public IntStack() {
		this(64);	// 객체 초기화 목적(기능)
	}

	public boolean push(int i) {
		if(ptr == capacity) 
			throw new OverflowIntStackException();
		stk[ptr++] = i;
		return true;
		
	}

	public int pop() throws EmptyIntStackException {
		if(ptr == 0)
			throw new EmptyIntStackException();
		
		return stk[--ptr];
	}
}
