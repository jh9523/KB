package dao;

import java.sql.SQLException;
import java.util.List;

import common.UserSQLException;
import dto.UserDto;

public interface UserDao {
	// 고객 등록
	int insertUser(UserDto userDto) throws SQLException, UserSQLException;
	
	// 고객 수정
	int updateUser(UserDto userDto) throws SQLException, UserSQLException;
	
	// 고객 삭제
	int deleteUser(int userSeq) throws SQLException, UserSQLException;
	
	// 고객 전체 조회
	List<UserDto> selectAll() throws SQLException;
	
	// 고객 1건 조회
	UserDto selectOne(int userSeq) throws SQLException;
}
