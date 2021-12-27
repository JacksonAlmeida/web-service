package com.sunsystem.webservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystem.webservice.entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAlll() {
		User u = new User(1, "Maia","maria@gmail.com", "(92) 99999-9999","123456");
		return ResponseEntity.ok().body(u);
	}
}