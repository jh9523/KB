package day_0801.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import day_0801.dto.MemberDTO;
import day_0801.util.JdbcUtil;

public class MembersDaoImpl implements MembersDao {

    @Override
    public void add(MemberDTO m) throws SQLException, DuplicatedIdException {
        //DBMS연결
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = JdbcUtil.connect();
            // 3. SQL 작성
            String sql = "INSERT INTO MEMBERS(id, name, passwd, status)";
            sql += "VALUES( ? , ? , ? , ? )";
            // 4. Statement 생성
            pstmt = con.prepareStatement(sql);
            // 5. 데이터 설정
            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getName());
            pstmt.setString(3, m.getPasswd());
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
    public void update(MemberDTO m) throws SQLException, RecordNotFoundException {
        //DBMS연결
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = JdbcUtil.connect();
            // 3. SQL 작성
            String sql = "UPDATE MEMBERS set name=?, passwd=?, status = ?";
            sql += "WHERE id = ?";
            // 4. Statement 생성
            pstmt = con.prepareStatement(sql);
            // 5. 데이터 설정
            pstmt.setString(1, m.getName());
            pstmt.setString(2, m.getPasswd());
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
        //DBMS연결
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<MemberDTO> list() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO findById(String id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

}