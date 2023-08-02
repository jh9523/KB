package day_0801.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day_0801.dto.LoginDTO;
import day_0801.dto.MemberDTO;
import day_0801.util.JdbcUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public void add(LoginDTO l) throws SQLException, DuplicatedIdException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 등록여부검사
			if (findById(l.getMember_id()) != null) {
				throw new DuplicatedIdException(l.getMember_id() + "는 이미 사용중입니다");
			}

			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "INSERT INTO LOGIN(member_id, login_date , login_time , logout_date , logout_time )";
			sql += "VALUES( ? , ? , ? , ?, ? )";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, l.getMember_id());
			pstmt.setString(2, l.getLogin_date());
			pstmt.setString(3, l.getLogin_time());
			pstmt.setString(4, l.getLogout_date());
			pstmt.setString(5, l.getLogout_time());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
	}

	@Override
	public void update(LoginDTO l) throws SQLException, RecordNotFoundException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 등록여부검사
			if (findById(l.getMember_id()) == null) {
				throw new RecordNotFoundException(l.getMember_id() + "는 없습니다");
			}

			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "UPDATE LOGIN set login_date=?, login_time = ?, logout_date = ?, logout_time = ?";
			sql += "WHERE member_id = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, l.getLogin_date());
			pstmt.setString(2, l.getLogin_time());
			pstmt.setString(3, l.getLogout_date());
			pstmt.setString(4, l.getLogout_time());
			pstmt.setString(5, l.getMember_id());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
	}

	@Override
	public void delete(String member_id ) throws SQLException, RecordNotFoundException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			// 등록여부검사
			if (findById(member_id) == null) {
				throw new RecordNotFoundException(member_id + "는 없습니다");
			}
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "DELETE LOGIN ";
			sql += "WHERE member_id = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, member_id);
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}

	}

	@Override
	public int count() throws SQLException {
		int count = 0;
		// DBMS 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT count(*) FROM LOGIN "; // 띄워써야 함
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			// DML 전송: executeUpdate() : int
			// SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			count = rs.getInt(1);

		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return count;
	}

	@Override
	public List<LoginDTO> list() throws SQLException {
		List<LoginDTO> result = new ArrayList<LoginDTO>();
		// DBMS 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM LOGIN order by member_id "; // 띄워써야 함
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			// DML 전송: executeUpdate() : int
			// SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { // 조회결과가 있다.
				String member_id = rs.getString("member_id");
				String login_date = rs.getString("login_date");
				String login_time = rs.getString("login_time");
				String logout_date = rs.getString("logout_date");
				String logout_time = rs.getString("logout_time");
				LoginDTO dto = new LoginDTO(member_id, login_date, login_time, logout_date, logout_time);
				result.add(dto);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return result;
	}

	@Override
	public LoginDTO findById(String member_id) throws SQLException {
		LoginDTO dto = null;
		// DBMS 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM LOGIN WHERE member_id = ? "; // 띄워써야 함
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, member_id);
			// 6. SQL 전송, 결과수신
			// DML 전송: executeUpdate() : int
			// SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) { // 조회결과가 있다.
				// name은 PK이기때문에 있으면 한개라 IF
				String login_date = rs.getString("login_date");
				String login_time = rs.getString("login_time");
				String logout_date = rs.getString("logout_date");
				String logout_time = rs.getString("logout_time");
				dto = new LoginDTO(member_id, login_date, login_time, logout_date, logout_time);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}

		return dto;
	}

}