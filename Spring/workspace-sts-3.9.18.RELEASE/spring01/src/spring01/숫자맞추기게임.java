package spring01;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ���ڸ��߱���� {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(GameContext.class);
		
		//��������, �����޼���
		NumberGuess ng = context.getBean(NumberGuess.class);
		Scanner sc = new Scanner(System.in);
		while(true) { //���� ���⶧���� ���ѹݺ�
			System.out.println("1~100���� ���ڸ� �Է� : ");
			int num = sc.nextInt();
			String result = ng.checkNumber(num);
			System.out.println(result);
			if(result.equals("����")) break;
		}//end while
	}//end main
}//end class
