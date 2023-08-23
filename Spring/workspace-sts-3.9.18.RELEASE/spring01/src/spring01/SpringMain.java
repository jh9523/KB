package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		//xml�������� �б�
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		//�������Ͽ��� HelloService �˻�
		HelloService hs = 
				context.getBean(HelloService.class); //��ü(��)�κ��� ���������� ����
		//���� �޼��� ȣ��		
		String msg = hs.hello();
		System.out.println(msg);
	}

}
