package book;

import java.util.ArrayList;
import java.util.Collections;

public class BookStoreService {
	ArrayList<BookDto> bookList = new ArrayList<BookDto>();
	ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
	ArrayList<SaleDto> saleList = new ArrayList<SaleDto>();
	
	public BookStoreService(){
		bookList.add( new BookDto("123", "자바기본", 20000));
		bookList.add( new BookDto("100", "자바응용", 25000));
		bookList.add( new BookDto("200", "자바코딩테스트", 30000));
		memberList.add( new MemberDto(100, "홍길동", "111-222"));
		memberList.add( new MemberDto(200, "김길동", "222-333"));
		saleList.add( new SaleDto(100, "100", 3));
		saleList.add( new SaleDto(100, "200", 1));
		saleList.add( new SaleDto(200, "200", 2));
	}

	public MemberDto getMemberDetail(int mno) {	// 단수형
		for (MemberDto m : memberList) {
			if( mno == m.getMno())
				return m;	// 찾으려는 회원번호의 참조값
		}
		return null;
	}
	/** 특정 회원이 구매한 판매목록 */
	public ArrayList<SaleDto> getSaleList(int memberno){ // 복수형
		ArrayList<SaleDto> result = new ArrayList<SaleDto>();
		for (SaleDto s : saleList) {
			if(memberno == s.getMno()) {
				result.add(s);
			}
		}
		return result;
	}

	public ArrayList<SaleDto> getSaleList() {
		return saleList;
	}

	public ArrayList<BookDto> getBookList() {
		return bookList;
	}
	
	public ArrayList<MemberDto> getMemberList() {
		return memberList;
	}

	public ArrayList<SaleDto> getSaleListSortByQuantity() {
		QuantityCompararator qc = new QuantityCompararator();
		
		Collections.sort(saleList, qc);
		
		
		return saleList;
	}
	
	
}
