package com.client;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
@Aspect
@Component
public class AopAdvice {
	@Around(value="execution(* com.service.CalculatorService.*(..))")
	public double callAround(ProceedingJoinPoint pj) throws Throwable{
		System.out.println("Calling Around");
		return (double) (pj.proceed());
		//System.out.println("calling after");
	}
}
