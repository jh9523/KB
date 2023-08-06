package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.DBManager;
import common.UserSQLException;
import dto.UserDto;

// 아래 각 메소드를 구현하세요.
public class UserDaoImpl implements UserDao{
	static Scanner sc = new Scanner(System.in);

	
	@Override
	public int insertUser(UserDto userDto) throws SQLException, UserSQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			con = DBManager.getConnection();
			// 3. SQL 작성
			String sql = "INSERT INTO US (userseq, name, email, phone,  issleep ) ";
			sql += "VALUES( US_SEQ.NEXTVAL , ? , ? , ? , ? ) ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, userDto.getName());
			pstmt.setString(2, userDto.getEmail());
			pstmt.setString(3, userDto.getPhone());
			pstmt.setBoolean(4, userDto.isSleep());
			
			// 6. SQL 전송, 결과수신
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new UserSQLException();
		} finally {
			DBManager.releaseConnection(pstmt, con);
		}
		return count;
	}
	
	// 고객 수정 코드를 완성하세요.
	@Override
	public int updateUser(UserDto userDto) throws SQLException, UserSQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int cnt =0;
		System.out.println("업데이트할 유저번호 선택: ");
		int na = Integer.parseInt(sc.nextLine());
		try {
			con = DBManager.getConnection();
			// 3. SQL 작성
			String sql = "UPDATE US SET EMAIL=?, PHONE=?, ISSLEEP=? ";
			sql += "WHERE USERSEQ = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, userDto.getEmail());
			pstmt.setString(2, userDto.getPhone());
			pstmt.setBoolean(3, userDto.isSleep());
			pstmt.setInt(4 ,na);
			
			// 6. SQL 전송, 결과수신
			cnt = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			throw new UserSQLException();
		}
		
		
		return cnt;
	}


	@Override
	public int deleteUser(int userSeq) throws SQLException, UserSQLException{
		// 고객 삭제 코드를 완성하세요.
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.getConnection();
			// 3. SQL 작성
			String sql = "DELETE US ";
			sql += "WHERE USERSEQ = ? ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, userSeq);
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch(SQLException e) {
			throw new UserSQLException();
		}
		
		return 0;
	}

	@Override
	public List<UserDto> selectAll() throws SQLException {
		// 고객 전체 목록 조회 코드를 완성하세요
		List<UserDto> result = new ArrayList<UserDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		int cnt =0;
		try {
			con = DBManager.getConnection();
			// 3. SQL 작성
			String sql = "SELECT * FROM US ORDER BY USERSEQ ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			ResultSet rs =  pstmt.executeQuery();
			while(rs.next()) {
				int userSeq = rs.getInt("userSeq");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				boolean isSleep = rs.getBoolean("isSleep");
				UserDto dto = new UserDto(userSeq, name, email, phone, isSleep);
				result.add(dto);
			}
			
		} catch(SQLException e) {
		}
		return result;
	}

	@Override
	public UserDto selectOne(int userSeq) throws SQLException{
		UserDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int cnt =0;
		try {
			con = DBManager.getConnection();
			// 3. SQL 작성
			String sql = "SELECT * FROM US WHERE USERSEQ = ? ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, userSeq);
			// 6. SQL 전송, 결과수신
			ResultSet rs =  pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				boolean isSleep = rs.getBoolean("isSleep");
				dto = new UserDto(userSeq, name, email, phone, isSleep);
			}
			
		} catch(SQLException e) {
		} finally {
			DBManager.releaseConnection(pstmt, con);
		}
		
		return dto;
		
		
	}

	



}
