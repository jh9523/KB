package day_05;

public class StringExam3 {
	public static void main(String[] args) {
//		StringBuilder : 고속 문자열 처리 객체
		String s = "0123456789";
		String s2 = "";
		// 실행시간
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s2 = s2 + s;	// 새로운 메모리 사용
		}
		System.out.println(s2);
		long end = System.currentTimeMillis();
		System.out.println("실행시간: "+(end-start));
		///////
//		StringBuffer ssb = new StringBuffer();	요즘 잘 안씀
		
		StringBuilder sb = new StringBuilder();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(s);
		}
		sb.toString();
		long end2 = System.currentTimeMillis();
		System.out.println("실행시간2: "+(end2-start2));
		
		
		
		
	}
}




