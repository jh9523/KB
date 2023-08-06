import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import common.UserSQLException;
import dao.UserDao;
import dao.UserDaoImpl;
import dto.UserDto;

public class Test {

	static Scanner sc = new Scanner(System.in);
	static UserDao userDao = new UserDaoImpl();
	public static void main(String[] args) {
		
		
		
		new Test().go();
		
	}
	
	public void go() {
		init();
		while(true) {
			mainMenu();
			
		}
		
	}

	private void mainMenu() {
		System.out.println("(1) 추가 (2) 수정 (3) 전체조회 (4) 한건조회 (5) 삭제");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			UserDto userDto = new UserDto(666, "육길동", "yook@gildong@com", "010-7777-7777", false);
//			 등록
			int retadd;
			try {
				retadd = userDao.insertUser(userDto);
				System.out.println(retadd);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (UserSQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("추가 완료");
		}
		
		if(menu == 2) {
			// 수정
			UserDto userDto = new UserDto(666, "육길동", "yook@gildong@com", "010-7777-7777", false);
			userDto.setEmail("yook@gildong@com");
			userDto.setPhone("010-7777-7777");
			userDto.setSleep(true);
			
			int ret;
			try {
				ret = userDao.updateUser(userDto);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UserSQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(userDto);
			// 테이블에서 수정 건을 확인한다.
		}
		
		if(menu == 3) {
			System.out.println("전체 조회");
			// 전체 조회
			List<UserDto> list=null;
			try {
				list = userDao.selectAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (UserDto dto : list) {
				System.out.println(dto);
			}
//			// 테이블의 전체 조회 건과 비교 확인한다.
			
			
		}
		
		if(menu == 4) {
			// 1건 조회
			UserDto dto = null;
			System.out.println("조회 하고 싶은 유저 번호 입력: ");
			int nn = Integer.parseInt(sc.nextLine());
			try {
				dto = userDao.selectOne(nn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(dto);
//			 테이블의 1건 조회 건과 비교 확인한다.
		}
		
		
		if(menu == 5) {
			UserDto dto = null;
			System.out.println("삭제 하고 싶은 유저 번호 입력: ");
			int nn = Integer.parseInt(sc.nextLine());
			int ret =  0;
			try {
				ret = userDao.deleteUser(nn);
				System.out.println(ret);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (UserSQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void init() {
		UserDao userDao = new UserDaoImpl();	
	}
	
	

}
