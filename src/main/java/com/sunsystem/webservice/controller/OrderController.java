package com.sunsystem.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsystem.webservice.entity.Order;
import com.sunsystem.webservice.servicies.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService userService;

	@GetMapping(value = "/")
	public ResponseEntity<List<Order>> findAlll() {
		List<Order> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable long id){
		Order obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}