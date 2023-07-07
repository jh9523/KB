package day_05;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		박태환 bt = new 박태환();
		bt.swimming();
		bt.공던지기();
		수영선수 s1;
		s1 = bt;
		
		야구선수 b1;
		b1 = bt;
	}
}


interface 수영선수{
	public void swimming();
}
interface 야구선수{
	public void 공던지기();
}

class 박태환 implements 수영선수, 야구선수{
	public void swimming() {
		System.out.println("수영하기");
	}
	public void 공던지기() {
		System.out.println("공던지기");
	}
}