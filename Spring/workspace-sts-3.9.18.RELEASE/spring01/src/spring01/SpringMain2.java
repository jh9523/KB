package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {
	
	public static void main(String[] args) {
		//xml�������� �б�
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppContext.class);
		//�������Ͽ��� HelloService �˻�
		MyCalc mc = context.getBean(MyCalc.class); //��ü(��)�κ��� ���������� ����
		//���� �޼��� ȣ��
		int result = mc.plus(30,40); // 3+4 ��� ��ȯ
		System.out.println(result);
	}
}
