package com.sunsystem.webservice.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsystem.webservice.entity.Order;
import com.sunsystem.webservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository userRepository;

	public List<Order> findAll() {
		return userRepository.findAll();
	}

	public Order findById(long id) {
		Optional<Order> obj = userRepository.findById(id);
		return obj.get();
	}
}
