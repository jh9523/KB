package day_0725;
/** 도형들의 공통속성정의 */
public class MyShape {
	private int x, y;	// 도형기준좌표
	
	public MyShape() {
	}

	public MyShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	
}
