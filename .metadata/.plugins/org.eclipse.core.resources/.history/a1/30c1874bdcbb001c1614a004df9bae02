package com.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

@Service
public class AppService{
	RestTemplate template=new RestTemplate();
	public String callApp() {
		String response=template.exchange("http://localhost:8090/mainapp/loadusers",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
	}
	public String callOrm() {
		String response=template.exchange("http://localhost:8060/mainapp/loadusers",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
	}
}