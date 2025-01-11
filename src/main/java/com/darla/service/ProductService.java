package com.darla.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darla.modal.Product;
import com.darla.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Add a product
    public Product addProduct(Product product) {
    	
        return productRepository.save(product);
    }

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
}
