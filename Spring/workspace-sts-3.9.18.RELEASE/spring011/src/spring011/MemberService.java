package spring011;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	@Autowired(required = false)
	//����Ÿ���� ���� ������ ��ϵ� ��� ���̸����� ����
	private MemberDao dao;
	
	public boolean login(String id, String passwd) {
		System.out.println("dao = "+ dao);
		return false;
	}
}
