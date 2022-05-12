package com.example.pwcspring;

import org.springframework.stereotype.Component;

@Component("gi")
public class GreetingImpl implements Welcome{

	@Override
	public void sayGreeting(String name) {
		System.out.println(name+"welcome to Spring AOP");
		
	}
	public void sayHello(String name,String city) {
		System.out.println(name+" this is the name and city "+city);
	}

}
