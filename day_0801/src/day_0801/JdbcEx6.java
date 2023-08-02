package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day_0801.dto.LoginDTO;
import day_0801.dto.MemberDTO;

public class JdbcEx6 {
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
		String sql = "SELECT l.member_id, l.login_date, l.login_time, l.logout_date,l.logout_time, m.name\r\n"
				+ "from login l JOIN members m ON(l.member_id = m.id)";	// 띄워써야 함
		// 4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 5. 데이터 설정
		// 6. SQL 전송, 결과수신
		//		DML 전송: executeUpdate() : int
		//		SELECT전송: executeQuery() : ResultSet
		ResultSet rs = pstmt.executeQuery();
		LoginDTO dto = null;
		ArrayList<LoginDTO> logList = new ArrayList<LoginDTO>();
		if(rs.next()) {	// 조회결과가 있다.
			String member_id = rs.getString("member_id");
			String login_date = rs.getString("login_date");
			String login_time = rs.getString("login_time");
			String logout_date = rs.getString("logout_date");
			String logout_time = rs.getString("logout_time");
			String name = rs.getString("name");
//			logList.add(new LoginDTO(member_id, login_date, login_time, logout_date, logout_time, name));
		}
		// 7. 자원반환
		pstmt.close();
		con.close();
		if( logList.isEmpty()) {
			System.out.println("검색실패");
		} else {
			System.out.println("검색성공: "+logList);
		}
	}
}
