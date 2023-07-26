package library.run;

import java.util.ArrayList;

import library.service.LibraryService;
import library.service.회원아이디중복Exception;
import library.vo.Book;
import library.vo.Cd;
import library.vo.Member;
import library.vo.Thing;
import library.vo.Video;

public class LibraryExam {
	public static void main(String[] args) throws 회원아이디중복Exception {
		LibraryService ls = new LibraryService();
		// 회원등록
		Member mb = new Member("user01", "홍", "1111", "010-111"	);
		ls.add( mb);
		ls.add(new Member("user02", "김", "2222", "010-222"));
		ls.add(new Member("user01", "박", "3333", "010-333"));	// 예외발생
		
		// 물건등록
		Thing t = new Book(100, "자바기본", 20000, 3, "한빛출판사");
		ls.add( t);
		ls.add(new Video(200, "자바강좌", 15000, 3, "명랑출판사"));
		ls.add(new Cd(300, "자바실습", 15000, 3, "자바출판사"));
		ls.add(new Book(100, "자바기본", 20000, 3, "한빛출판사"));
		// TODO    
		// 회원검색
		ArrayList<Member> findArr = ls.findMemberByName("홍");
		System.out.println(findArr);
		
		// 물건검색
		ArrayList<Thing> findItem = ls.findItemByTitle("자바기본");
		System.out.println(findItem);
		
		// 대여
		
	}
	
}
