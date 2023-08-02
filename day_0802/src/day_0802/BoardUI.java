package day_0802;

import java.util.List;
import java.util.Scanner;

import day_0802.dao.RecordNotFoundException;
import day_0802.vo.BoardDto;

public class BoardUI {

	public static void main(String[] args) {
		new BoardUI().go();
	}

	private void go() {
		init();//필요 변수 초기화
		while (true) {
			//		list();// 게시물 목록 출력
			mainMenu();// 메인메뉴출력
		}
	}
	private void mainMenu() {
		System.out.println("메인 메뉴: (1)등록 (2)목록 (3)상세 (4)종료 (5)수정 (6)삭제");
		System.out.println("메뉴 선택: ");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu==1) {
			addBoard();
		}else if(menu==2) {
			list();
		}else if(menu==3) {
			readBoard(); //상세보기
		}else if(menu==4) {
			System.exit(0);//VM종료
		}else if(menu==6) {
			deleteBoard();//게시물 삭제
		}else if(menu==5) {
			updateBoard();//게시물 수정
		}
	}
	private void updateBoard() {
		System.out.println("수정하고 싶은 게시물 번호를 입력하세요>> ");
		int no = Integer.parseInt(sc.nextLine());
		try {
			BoardDto dto = brdSvc.read(no);
			System.out.println("** 상세보기 **");
			System.out.println("번호: "+dto.getNo());
			System.out.println("현재제목: "+dto.getTitle());
			System.out.println("바꾸려는 제목입력(안바꾸려면 엔터): ");
			String title = sc.nextLine();
			title = title.length()==0?dto.getTitle():title;
			dto.setTitle(title);
			System.out.println("작성자: "+dto.getWriter());
			System.out.println("작성일: "+dto.getRegdate());
			System.out.println("현재내용: "+dto.getContent());
			System.out.println("바꾸려는 내용입력(안바꾸려면 엔터): "+dto.getContent());
			String content = sc.nextLine();
			content = content.length()==0?dto.getContent():content;
			dto.setContent(content);
			brdSvc.update(dto);
			
		} catch (BoardException e) {
			System.out.println("--- 게시판 서버 오류입니다 ---");
		} catch (RecordNotFoundException e) {
			System.out.println("없는 게시물입니다");
		}

	}

	private void deleteBoard() {
		System.out.println("삭제하고 싶은 게시물 번호를 입력하세요>> ");
		int no = Integer.parseInt(sc.nextLine());
		try {
			brdSvc.delete(no);
		} catch (BoardException e) {
			System.out.println("서버에 오류가 발생했습니다");
		} catch (RecordNotFoundException e) {
			System.out.println("없는 게시물입니다");
		}
	}

	private void readBoard() {//게시물 상세보기
		System.out.println("내용을 보고싶은 게시물 번호를 입력하세요>> ");
		int no = Integer.parseInt(sc.nextLine());
		try {
			BoardDto dto = brdSvc.read(no);
			System.out.println("** 상세보기 **");
			System.out.println("번호: "+dto.getNo());
			System.out.println("제목: "+dto.getTitle());
			System.out.println("작성자: "+dto.getWriter());
			System.out.println("작성일: "+dto.getRegdate());
			System.out.println("내용: "+dto.getContent());
		} catch (BoardException e) {
			System.out.println("--- 게시판 서버 오류입니다 ---");
		} catch (RecordNotFoundException e) {
			System.out.println("없는 게시물입니다");
		}
	}

	private void addBoard() {
		System.out.println("** 게시물 등록 **");
		System.out.println("제목을 입력하세요>> ");
		String title = sc.nextLine();
		System.out.println("작성자를 입력하세요>> ");
		String writer = sc.nextLine();
		System.out.println("내용을 입력하세요>> ");
		String content = sc.nextLine();
		BoardDto dto = new BoardDto(0, title, writer, null, content);
		try {
			brdSvc.add(dto);
		} catch (BoardException e) {
			System.out.println("게시물 등록 오류");
		}
	}
	private BoardService brdSvc;//게시판 서비스
	private Scanner sc;
	private void init() {
		brdSvc = new BoardServiceImpl();
		sc = new Scanner(System.in);
	}

	private void list() {
		System.out.println("[게시물 목록]");
		System.out.println("번호 ---- 작성자 ----- 제목 ----- 작성일 -----");
		List<BoardDto> list;
		try {
			list = brdSvc.list();
			for (BoardDto dto : list) {
				System.out.println(  
							dto.getNo()+"        "+
							dto.getWriter()+"    "+
							dto.getTitle()+"    "+
							dto.getRegdate());
			}
		} catch (BoardException e) {
			System.out.println("*** 서버에 오류가 발생했습니다 ***");
		}
	}
}
