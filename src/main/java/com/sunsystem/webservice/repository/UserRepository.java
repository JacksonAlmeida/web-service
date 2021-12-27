package com.sunsystem.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunsystem.webservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
