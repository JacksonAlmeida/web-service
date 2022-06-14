package com.sunsystem.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystem.webservice.entity.User;
import com.sunsystem.webservice.servicies.TokenService;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private TokenService tokenService;

	@PostMapping(value = "/login")
	public ResponseEntity<?> authentication(@RequestBody User user) {
		UsernamePasswordAuthenticationToken dadosLogin = user.converter();

		try {
			Authentication authentication = authenticationManager.authenticate(dadosLogin);
			String token = tokenService.generateToken(authentication);
			System.out.println("Token: "+ token);
			return ResponseEntity.ok().build();
		} catch (AuthenticationException e) {
			return ResponseEntity.badRequest().build();
		}
	}

}
