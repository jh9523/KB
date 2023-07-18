package 리뷰;

public class AnonymousExam {
	public static void main(String[] args) {
		// 일회용 임시 자식 클래스 만드는 법
		new A() { };	// {}에 자식 클래스 정의 A를 상속한 이름없는 클래스
		A a = new A() {
			int j =100;
			@Override
			public void p() {
				System.out.println("B "+j);
			};
		};
		a.p();
		System.out.println(a.getClass().getName());
		////////////////
		MySwim ms = new MySwim() {
			@Override
			public void swimming() {
				System.out.println("자유형 수영~");
			}
		};
		System.out.println(ms.getClass().getName());
	}
}// end AnonymousExam

class A{
	public void p() {
		System.out.println("A");
	}
}
 
interface MySwim{
	void swimming();
}

class MySwimImp1 implements MySwim{
	@Override
	public void swimming() {
	}
}