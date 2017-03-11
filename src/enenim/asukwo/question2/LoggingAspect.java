package enenim.asukwo.question2;

import org.junit.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* enenim.asukwo.question2.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}