package com.sunsystem.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystem.webservice.entity.Product;
import com.sunsystem.webservice.servicies.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService userService;

	@GetMapping(value = "/")
	public ResponseEntity<List<Product>> findAlll() {
		List<Product> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable long id){
		Product obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}