package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.MemberDTO;

public class MembersDaoImplExam {
	public static void main(String[] args) {
//		count();
//		add();
//		update();
//		delete();
//		find();
//		count();
		list();
		
		
	}
	
	private static void list() {
		MembersDaoImpl membersDao = new MembersDaoImpl();
		try {
			List<MemberDTO> list = membersDao.list();
			System.out.println("** 전체 조회 **");
			for(MemberDTO dto : list) {
				System.out.println(dto);
			}
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} 
	}
	
	private static void count() {
		MembersDaoImpl membersDao = new MembersDaoImpl();
		try {
			int count = membersDao.count();
			System.out.println("등록갯수: "+ count);
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} 
		
	}
	
	private static void add() {
		MembersDaoImpl membersDao = new MembersDaoImpl();
		try {
			membersDao.add(new MemberDTO("user07", "유저7", "777", "Y"));
			System.out.println("등록성공");
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} catch (DuplicatedIdException e) {
			System.out.println("ID가 중복됩니다");
		}
		
	}
	
	private static void update() {
		MembersDaoImpl membersDao = new MembersDaoImpl();
		try {
			membersDao.update(new MemberDTO("user07", "유저7", "777", "N"));
			System.out.println("수정성공");
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다");
		}
		
	}
	
	private static void delete() {
		MembersDaoImpl membersDao = new MembersDaoImpl();
		try {
			membersDao.delete("user07");
			System.out.println("삭제성공");
		} catch (SQLException  e) {
			System.out.println("SQL오류 발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다");
		}
		
	}
	
}
