package com.sunsystem.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunsystem.webservice.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
