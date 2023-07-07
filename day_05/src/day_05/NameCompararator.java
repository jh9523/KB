package day_05;

import java.util.Comparator;
/** 이름기준 정렬기 */
public class NameCompararator implements Comparator<MyMember> {

	@Override
	public int compare(MyMember o1, MyMember o2) {
		
//		return o2.getAge() - o1.getAge();   // <-- 나이 기준   앞에꺼 - 뒤에꺼
		return o1.getName().compareTo( o2.getName() );	// 이름 기준 오름차순 정렬
		
	}
	

}
