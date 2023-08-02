package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.LoginDTO;




public interface LoginDao{
	  //등록
	  public void add(LoginDTO l) throws SQLException, DuplicatedIdException;
	  //수정
	  public void update(LoginDTO l) throws SQLException, RecordNotFoundException;
	  //삭제
	  public void delete(String member_id) throws SQLException, RecordNotFoundException;
	  //갯수
	  public int count() throws SQLException;
	  //목록
	  public List<LoginDTO> list() throws SQLException;
	  //검색
	  public LoginDTO findById(String member_id) throws SQLException;
	}