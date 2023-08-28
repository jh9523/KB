package spring02aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Around("execution(* factorial(..) )")
	public Object printAround(ProceedingJoinPoint pjp ) throws Throwable {				// Ÿ�� �޼��� ��, ��
		System.out.println("around ��");
		long start = System.nanoTime();
		Object result = pjp.proceed();	// Ÿ�ٸ޼��� ����, �������
		long end = System.nanoTime();
		System.out.println("�ɸ��ð�: "+(end-start)+"ns");
		System.out.println("around ��");
		return result;	// ��� ��ȯ
	}
	
	
//	@Before("execution(* factorial(..) )")
//	public void printBefore() {
//		System.out.println("ȣ����");
//	}
	
	
	
	
}