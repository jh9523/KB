package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectExam {
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
		String sql = "SELECT * FROM MEMBERS WHERE id = ? ";	// 띄워써야 함
		// 4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 5. 데이터 설정
		pstmt.setString(1, "user03");
		// 6. SQL 전송, 결과수신
		//		DML 전송: executeUpdate() : int
		//		SELECT전송: executeQuery() : ResultSet
		ResultSet rs = pstmt.executeQuery();
		String name = null;
		if(rs.next()) {	// 조회결과가 있다.
			// name은 PK이기때문에 있으면 한개라 IF
			name = rs.getString("name");
		}
		// 7. 자원반환
		pstmt.close();
		con.close();
		System.out.println("name = "+ name );
	}
}
