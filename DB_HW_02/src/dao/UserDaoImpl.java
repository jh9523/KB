package dao;

import java.util.List;

import dto.UserDto;

// 아래 각 메소드를 구현하세요.
public class UserDaoImpl implements UserDao{

	@Override
	public int insertUser(UserDto userDto) {
		// 고객 등록 코드를 완성하세요.
		return 0;
	}

	@Override
	public int updateUser(UserDto userDto) {
		// 고객 수정 코드를 완성하세요.
		return 0;
	}

	@Override
	public int deleteUser(int userSeq) {
		// 고객 삭제 코드를 완성하세요.
		return 0;
	}

	@Override
	public List<UserDto> selectAll() {
		// 고객 전체 목록 조회 코드를 완성하세요
		return null;
	}

	@Override
	public UserDto selectOne(int userSeq) {
		// 고객 1건 조회 코드를 완성하세요.
		return null;
	}

}
