package com.sunsystem.webservice.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.sunsystem.webservice.servicies.TokenService;

public class AuthenticationTokenFilter extends OncePerRequestFilter {

	private TokenService tokenService;

	public AuthenticationTokenFilter(TokenService tokenService) {
		this.tokenService = tokenService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String token = findToken(request);

		boolean valid = tokenService.isTokenValid(token);
		System.out.println(valid);

		filterChain.doFilter(request, response);

	}

	private String findToken(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if (token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
			return null;
		}
		return token.substring(7, token.length());
	}

}
