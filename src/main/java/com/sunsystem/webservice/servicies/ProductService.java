package com.sunsystem.webservice.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsystem.webservice.entity.Product;
import com.sunsystem.webservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository userRepository;

	public List<Product> findAll(){
		return userRepository.findAll();
	}

	public Product findById(long id) {
		Optional<Product> obj = userRepository.findById(id);
		return obj.get();
	}
}
