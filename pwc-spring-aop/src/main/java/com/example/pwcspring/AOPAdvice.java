package com.example.pwcspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AOPAdvice {
	/*@Before(value="execution(* com.example.pwcspring.GreetingImpl.*(..))")
	public void callBefore() {
		System.out.println("Calling Before");
	}
	@After(value="execution(* com.example.pwcspring.GreetingImpl.sayHello(..))")
	public void callAfter() {
		System.out.println("Calling After");
	}*/
	@Around(value="execution(* com.example.pwcspring.GreetingImpl.*(..))")
	public void callAround(ProceedingJoinPoint pj) throws Throwable{
		System.out.println("Calling Before");
		pj.proceed();
		System.out.println("calling after");
	}
}
