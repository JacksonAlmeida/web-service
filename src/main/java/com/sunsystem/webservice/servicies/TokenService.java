package com.sunsystem.webservice.servicies;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.sunsystem.webservice.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

	@Value("${jwt.expiration}")
	private Long expirationTime;

	@Value("${jwt.secret}")
	private String key;

	public String generateToken(Authentication authentication) {
		User user = (User) authentication.getPrincipal();
		return Jwts.builder().setIssuer("Api whorkshop").setSubject(Long.toString(user.getId()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + expirationTime))
				.signWith(SignatureAlgorithm.HS512, key).compact();
	}

	public boolean isTokenValid(String token) {

		try {
			Jwts.parser().setSigningKey(this.key).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Long getIdUser(String token) {
		Claims body = Jwts.parser().setSigningKey(this.key).parseClaimsJws(token).getBody();
		return Long.parseLong(body.getSubject());
	}

}

/*
 * Jwts.builder().setIssuedAt(new
 * Date(System.currentTimeMillis())).setSubject("Api whorkshop")
 * .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
 * .signWith(SignatureAlgorithm.HS512, key).compact();
 */