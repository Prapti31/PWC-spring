package com.example.pwcspringMVC;

import java.util.Base64;

import com.security.JWTUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTTest {
	private static String secret_key="abc@123";
	
	public static void main(String[] args) {
		String token=JWTUtil.generateToken("Token1", secret_key);
		System.out.println("----------------Token---------------");
		System.out.println(token);
		System.out.println();
		System.out.println("Claims");
		Claims claims=Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(secret_key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
		System.out.println("Token_id"+claims.getId());
		System.out.println("Token_subject"+claims.getSubject());
		System.out.println("Token_ISSuer"+claims.getIssuer());
		System.out.println("Token_Aud"+claims.getAudience());
	}
}
