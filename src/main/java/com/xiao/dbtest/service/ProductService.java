package com.xiao.dbtest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xiao.dbtest.domain.Product;

public interface ProductService {

	Page<Product> findAll(Pageable page);
	void deleteAll();
	Page<Product> findByNameStartingWith(String name, Pageable page);
	void save(Product p);
}
