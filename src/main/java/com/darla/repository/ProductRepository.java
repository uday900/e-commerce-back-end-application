package com.darla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darla.modal.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
