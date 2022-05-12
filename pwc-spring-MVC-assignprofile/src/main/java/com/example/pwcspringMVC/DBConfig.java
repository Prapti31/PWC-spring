package com.example.pwcspringMVC;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@ConfigurationProperties("spring.user")
public class DBConfig {
	private String name;
	private String email;
	private String city;
	private String pincode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	@Bean
	@Profile("fin")
	public String devDBLoad() {
		System.out.println("DB with DEV Profile loaded");
		System.out.println(name);
		System.out.println(email);
		return "DB Dev Environment loaded";
	}
	@Bean
	@Profile("manager")
	public String prodDBLoad() {
		System.out.println("DB with Prod Profile loaded");
		System.out.println(name);
		System.out.println(email);
		return "DB Dev Environment loaded";
	}
	@Bean
	@Profile("qa")
	public String testDBLoad() {
		System.out.println("DB with test Profile loaded");
		System.out.println(name);
		System.out.println(email);
		return "DB Dev Environment loaded";
	}
}
