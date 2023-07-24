package day_0724.service;
/** MyShape 파생객체를 저장 */

import day_0724.MyCircle;
import day_0724.MyLine;
import day_0724.MyShape;

public class MyShapeService {
	private MyShape[] lines = new MyShape[100];
	private int count = 0; // 저장할 위치, 저장갯수
	
//	public void add(MyLine ml) {
//		lines[count++] = ml;
//	}
//	
//	public void add(MyCircle ml) {
//		lines[count++] = ml;
//	}
	
	
	public void add(MyShape ml) {
		lines[count++] = ml;
	}
	public int getCount() {
		return count;
	}
	public MyShape findByPosition(int startx, int starty) {
		// 0~count까지만( 실제저장 마지막위치)
		for(int i =0; i<count;i++) {
			MyShape myShape = lines[i];
			if(myShape.getX() == startx && myShape.getY() == starty) {
				return myShape;
			}
		}
		
		return null;	// 못찾으면 null 반환
	}
	public boolean remove(MyShape findShape) {
		for(int i =0; i<count; i++) {
			MyShape myShape= lines[i];
			if(myShape.equals(findShape)) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	/** i번째 객체 삭제 */
	private void remove(int i) {
		// n -> i ~ < n
		for(int j =i; j<count; j++) {
			lines[j] = lines[j+1];
		}	// end for
		count--;
	}
	public void printAll() {
		// TODO Auto-generated method stub
		System.out.println("** 전체 출력 **");
		for(int i =0; i< count; i++) {
			MyShape myShape = lines[i];
			System.out.println(myShape);
		}
	}
}
