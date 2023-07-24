package day_0724;

public class PainterExam2 {
	public static void main(String[] args) {
		MyLine[] lines = new MyLine[100];
		MyCircle[] circles = new MyCircle[100];
		
		MyLine ml = new MyLine(0, 0, 0, 0);
		lines[0] = ml;
//		circles[0] = ml;	// 시험
		MyShape[] msarr = new MyShape[100];
		msarr[0] = ml;
		msarr[1] = new MyCircle(0, 0, 10);
		
		MyShape ms = new MyCircle(0, 0, 10);
		// 오버라이딩한 자식의 메서드가 호출함
		System.out.println(ms.draw());
	}
	
}
