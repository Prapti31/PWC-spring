package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class Client {
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	CalculatorService cs=(CalculatorService) ctx.getBean("service");
	//System.out.println(cs.hashCode());
//	CalculatorService cs2=(CalculatorService) ctx.getBean("service");
//	System.out.println(cs2.hashCode());
	System.out.println(cs.service(2000));
	ctx.close();
}
}
