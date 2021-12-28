package com.sunsystem.webservice.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsystem.webservice.entity.Category;
import com.sunsystem.webservice.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository userRepository;

	public List<Category> findAll(){
		return userRepository.findAll();
	}

	public Category findById(long id) {
		Optional<Category> obj = userRepository.findById(id);
		return obj.get();
	}
}
