package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day_0801.dto.MemberDTO;

public class JdbcSelectExam4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Jdbc Driver 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Jdbc Driver 로딩 성공");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
		String user = "hr";
		String password = "HR";
		// 2. DBMS 연결
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("DBMS 로그인 성공");
		// 3. SQL 작성
		String sql = "SELECT * FROM MEMBERS ";
		// 4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 5. 데이터 설정
		// 6. SQL 전송, 결과수신
		//		DML 전송: executeUpdate() : int
		//		SELECT전송: executeQuery() : ResultSet
		ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			String passwd = rs.getString("passwd");
			String status = rs.getString("status");
			MemberDTO md = new MemberDTO(id, name, passwd, status);
			memList.add(md);
		}
		// 7. 자원반환
		pstmt.close();
		con.close();
		System.out.println(memList);
	}
}
