package com.example.pwcspring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.service.CalculatorService;

public class Client {
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	GreetingImpl gi=(GreetingImpl)ctx.getBean("gi");
	gi.sayGreeting("Prapti ");
	gi.sayHello("Prapti","Sahibganj");
}
}
