package spring01;

public class MyCalc {
	
	//����ϳ����
	private MyLog log = null;
	
	public MyCalc() {
	}
	public MyCalc(MyLog log) {
		this.log = log;
	}
	
	public int plus(int i, int j) {
		log.log(i+"+"+j+"="+(i+j));
		return i+j;
	}
	public void setMyLog(MyLog log) {
		this.log = log;
	}
	
	
	
}
