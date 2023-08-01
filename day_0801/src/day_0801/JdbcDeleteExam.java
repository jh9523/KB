package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteExam {
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
		String sql = "DELETE FROM MEMBERS ";	// 띄워써야 함
		sql += "WHERE id = ?";
		// 4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 5. 데이터 설정
		pstmt.setString(1, "user03");
		// 6. SQL 전송, 결과수신
		//		DML 전송: executeUpdate() : int
		//		SELECT전송: executeQuery() : ResultSet
		int count = pstmt.executeUpdate();
		System.out.println(count+"행 삭제완료");
		// 7. 자원반환
		pstmt.close();
		con.close();
	}
}
