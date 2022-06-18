package com.sunsystem.webservice.dto;

import java.io.Serializable;

import com.sunsystem.webservice.entity.User;

public class UserLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	private String token;

	public UserLogin(User user, String token) {
		user.setEmail(email);
		;
		user.setPassword(password);
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
