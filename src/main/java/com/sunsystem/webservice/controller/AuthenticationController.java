package com.sunsystem.webservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystem.webservice.dto.UserLogin;

@RestController
@RequestMapping(value = "/auth/login")
public class AuthenticationController {

	@PostMapping
	public ResponseEntity<?> authentication(@RequestBody UserLogin user){
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return ResponseEntity.ok().build();
	}
	
}
