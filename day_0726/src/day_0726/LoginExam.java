package day_0726;

public class LoginExam {
	public static void main(String[] args) {
		String id = "user100";
		String passwd = "1111";
		try {
			// id 존재검사
			// 비번검사
			// 잠김검사
			login(id, passwd);
			System.out.println("로그인 성공");
		} catch (미등록아이디Exception e) {
			e.printStackTrace();
			System.out.println("메시지: "+ e.getMessage());
		} catch (비밀번호틀림Exception e) {
			e.printStackTrace();
		}
	}

	private static void login(String id, String passwd) throws 비밀번호틀림Exception ,미등록아이디Exception {
		if( id != "user100") {
			throw new 미등록아이디Exception(id+"는 없는 아이디입니다.");
		}
		if( passwd != "1111") {
			throw new 비밀번호틀림Exception("비밀번호가 틀립니다");
		}
	}
}
