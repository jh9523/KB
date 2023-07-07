package day_04;

public class MyMemberExam {
	public static void main(String[] args) {
		// 회원정보 관리~등록, 검색, 수정, 삭제 (CRUD)
		// 회원: 이름, 나이
		MyMember[] mems = new MyMember[300];
		int count = 0;	// 객체저장 위치
		mems[count++] = new MyMember("홍길동", 33);
		mems[count++] = new MyMember("김길동", 35);
		mems[count++] = new MyMember("박길동", 30);
		System.out.println("count="+count);
		// 목록출력
		System.out.println("*** 목록 ***");
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
		
		
		// 회원검색
		String findName = "김길동2";
		System.out.println("*** 회원검색 ***");
		int targetIndex = -1;	// 찾은 회원의 위치번호
		for (int i = 0; i < count; i++) {
			if(findName == mems[i].getName()) {
				targetIndex = i;
			}
		}
		if(targetIndex == -1) {
			System.out.println("못찾았음");
		} else {
			System.out.println("찾았음: "+mems[targetIndex]);
		}
		
		
		// 수정 - 김길동의 나이를 1증가
		findName = "김길동";
		System.out.println("*** 회원검색 ***");
		targetIndex = -1;	// 찾은 회원의 위치번호
		for (int i = 0; i < count; i++) {
			if(findName == mems[i].getName()) {
				targetIndex = i;
			}
		}
		if(targetIndex == -1) {
			System.out.println("못찾았음");
		} else {
			System.out.println("찾았음: "+mems[targetIndex]);
			int age = mems[targetIndex].getAge();
			mems[targetIndex].setAge(age+1);
			System.out.println("수정후: "+mems[targetIndex]);
		}
		
		
		// 삭제 - 김길동 
		findName = "김길동";
		System.out.println("*** 회원삭제 ***");
		targetIndex = -1;	// 찾은 회원의 위치번호
		for (int i = 0; i < count; i++) {
			if(findName == mems[i].getName()) {
				targetIndex = i;
			}
		}
		if(targetIndex == -1) {
			System.out.println("못찾았음");
		} else {
			mems[targetIndex] = mems[targetIndex+1];
			count--;
		}
		// 삭제 후 목록출력
		System.out.println("*** 목록 ***");
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
				
	}
}
