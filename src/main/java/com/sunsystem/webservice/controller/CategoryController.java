package com.sunsystem.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystem.webservice.entity.Category;
import com.sunsystem.webservice.servicies.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService userService;

	@GetMapping(value = "/")
	public ResponseEntity<List<Category>> findAlll() {
		List<Category> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable long id){
		Category obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}