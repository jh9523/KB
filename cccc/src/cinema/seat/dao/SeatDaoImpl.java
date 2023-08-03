package cinema.seat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import cinema.dtos.SeatDto;
import cinema.util.DuplicatedIdException;
import cinema.util.JdbcUtil;


public class SeatDaoImpl implements SeatDao {
	
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void add(SeatDto dto) throws SQLException, DuplicatedIdException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "INSERT INTO SEAT(seatnum, tnumber, seatsstatus ) ";
			sql += "VALUES( xxx_SEQ.NEXTVAL , ? , ?  ) ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, dto.getTnumber());
			pstmt.setInt(2, dto.getSeatstatus());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
	}

	@Override
	public List<SeatDto> list() throws SQLException {
		List<SeatDto> result = new ArrayList<SeatDto>();
		//DBMS연결
		System.out.println("조회하고 싶은 상영관은?");
		int thhnum = sc.nextInt();	// 상영관 받기
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM SEAT WHERE THNUM = ? AND SEATSTATUS = '0' order by seatnum ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, thhnum);
			// 6. SQL 전송, 결과수신
			//   DML전송: executeUpdate() : int 
			//   SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {//조회결과가 있다
				int no = rs.getInt("no");
				String title = rs.getString("title");
				int seatnum = rs.getInt("seatnum");
				int seatstatus = 0;
				SeatDto dto = new SeatDto(seatnum, thhnum, seatstatus);
				result.add(dto);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return result;

	}

}
