package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.LoginDTO;
import day_0801.dto.MemberDTO;

public class LoginDaoImplExam {
	public static void main(String[] args) {
//		count();
//		add();
//		update();
//		delete();
//		find();
//		count();
		list();
		
		
	}
	
	private static void add() {
		LoginDaoImpl loginsDao = new LoginDaoImpl();
		try {
			loginsDao.add(new LoginDTO("user05", "2023-05-30", "12-30", "2023-05-30", "10-24"));
			System.out.println("등록성공");
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
			e.printStackTrace();
		} catch (DuplicatedIdException e) {
			System.out.println("ID가 중복됩니다");
		}
		
	}
	
	private static void list() {
		LoginDaoImpl loginsDao = new LoginDaoImpl();
		try {
			List<LoginDTO> list = loginsDao.list();
			System.out.println("** 전체 조회 **");
			for(LoginDTO dto : list) {
				System.out.println(dto);
			}
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} 
	}
	
	private static void count() {
		LoginDaoImpl loginsDao = new LoginDaoImpl();
		try {
			int count = loginsDao.count();
			System.out.println("등록갯수: "+ count);
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} 
		
	}
	
	
	
	private static void update() {
		LoginDaoImpl loginsDao = new LoginDaoImpl();
		try {
			loginsDao.update(new LoginDTO("user05", "2023-05-29", "12-30", "2023-05-30", "10-20"));
			System.out.println("수정성공");
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다");
		}
		
	}
	
	private static void delete() {
		LoginDaoImpl loginsDao = new LoginDaoImpl();
		try {
			loginsDao.delete("user05");
			System.out.println("삭제성공");
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다");
		}
	
	}
}
