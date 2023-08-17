package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import member.dto.MemberDto;
import member.exception.DuplicatedIdException;
import member.exception.RecordNotFoundException;
import util.JdbcUtil;

public class MemberdDaoImpl implements MemberDao {

	@Override
	public void add(MemberDto m) throws SQLException, DuplicatedIdException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 등록여부검사
			if (findById(m.getId()) != null) {
				throw new DuplicatedIdException(m.getId() + "는 이미 사용중입니다");
			}

			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "INSERT INTO MEMBERS(id, name, passwd, status) ";
			sql += "VALUES( ? , ? , ? , ? )";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getPwd());
			pstmt.setString(4, m.getStatus());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
	}

	@Override
	public void update(MemberDto m) throws SQLException, RecordNotFoundException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 등록여부검사
			if (findById(m.getId()) == null) {
				System.out.println("나..?");
				throw new RecordNotFoundException(m.getId() + "는 없습니다");
			}

			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "UPDATE MEMBERS set name=?, passwd=?, status = ? ";
			sql += "WHERE id = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getStatus());
			pstmt.setString(4, m.getId());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
	}

	@Override
	public void delete(String id) throws SQLException, RecordNotFoundException {
		// DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			// 등록여부검사
			if (findById(id) == null) {
				throw new RecordNotFoundException(id + "는 없습니다");
			}
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "DELETE MEMBERS ";
			sql += "WHERE id = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, id);
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
			String sql = "SELECT count(*) FROM MEMBERS "; // 띄워써야 함
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
	public List<MemberDto> list() throws SQLException {
		List<MemberDto> result = new ArrayList<MemberDto>();
		// DBMS 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM MEMBERS order by id "; // 띄워써야 함
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			// DML 전송: executeUpdate() : int
			// SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { // 조회결과가 있다.
				String id = rs.getString("id");
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				String status = rs.getString("status");
				MemberDto dto = new MemberDto(id, name, passwd, status);
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
	public MemberDto findById(String id) throws SQLException {
		MemberDto dto = null;
		// DBMS 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM MEMBERS WHERE id = ? "; // 띄워써야 함
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, id);
			// 6. SQL 전송, 결과수신
			// DML 전송: executeUpdate() : int
			// SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) { // 조회결과가 있다.
				// name은 PK이기때문에 있으면 한개라 IF
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				String status = rs.getString("status");
				dto = new MemberDto(id, name, passwd, status);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}

		System.out.println(dto);
		return dto;
	}

}