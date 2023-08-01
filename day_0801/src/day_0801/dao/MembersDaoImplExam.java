package day_0801.dao;

import java.sql.SQLException;

import day_0801.dto.MemberDTO;

public class MembersDaoImplExam {
	public static void main(String[] args) {
		MembersDaoImpl members = new MembersDaoImpl();
		try {
			members.add(new MemberDTO("user08", "유저8", "888", "Y"));
		} catch (SQLException | DuplicatedIdException e) {
			e.printStackTrace();
		}
		
		
	}
}
