package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx4 {
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
		String sql = "UPDATE LOGIN set logout_date = ?, logout_time=? ";
		sql += "WHERE member_id = ?";
		// 4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 5. 데이터 설정
		pstmt.setString(1, "2023-07-31");
		pstmt.setString(2, "17-20");
		pstmt.setString(3, "user04");
		// 6. SQL 전송, 결과수신
		//		DML 전송: executeUpdate() : int
		//		SELECT전송: executeQuery() : ResultSet
		int count = pstmt.executeUpdate();
		System.out.println(count+"행 수정완료");
		// 7. 자원반환
		pstmt.close();
		con.close();
	}
}
