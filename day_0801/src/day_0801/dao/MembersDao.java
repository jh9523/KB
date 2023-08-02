package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.MemberDTO;




public interface MembersDao{
	  //등록
	  public void add(MemberDTO m) throws SQLException, DuplicatedIdException;
	  //수정
	  public void update(MemberDTO m) throws SQLException, RecordNotFoundException;
	  //삭제
	  public void delete(String id) throws SQLException, RecordNotFoundException;
	  //갯수
	  public int count() throws SQLException;
	  //목록
	  public List<MemberDTO> list() throws SQLException;
	  //검색
	  public MemberDTO findById(String id) throws SQLException;
	}