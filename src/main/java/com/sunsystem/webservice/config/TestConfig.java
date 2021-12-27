package com.sunsystem.webservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sunsystem.webservice.entity.User;
import com.sunsystem.webservice.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User("Jackson ALmeida", "jacksonnalmeida123@gmail.com", "(92)99999-9999", "123456");
		User u2 = new User("Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u3 = new User("Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
	}
}
