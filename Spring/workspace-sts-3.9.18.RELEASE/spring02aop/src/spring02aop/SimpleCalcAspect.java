package spring02aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleCalcAspect {

	@Before("execution( * SimpleCalc.*(..) )")
	public void printBefore() {
		System.out.println("°è»ê Àü");
	}
}