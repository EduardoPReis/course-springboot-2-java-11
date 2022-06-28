package com.meuaprendizado.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuaprendizado.course.entities.Product;
import com.meuaprendizado.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product FindById(Long id) {
		Optional<Product>obj = repository.findById(id);
		return obj.get();
	}
}
 