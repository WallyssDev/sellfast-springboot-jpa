package com.wallysousa.sellfast.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallysousa.sellfast.entities.Product;
import com.wallysousa.sellfast.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	@Transactional
	public Product findById(Long id) {
	    Product product = repository.findById(id).orElseThrow();
	    
	    // 🔥 ESSA LINHA É O SEGREDO
	    product.getItems().size();
	    
	    return product;
	}
}
