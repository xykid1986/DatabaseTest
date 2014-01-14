package com.xiao.dbtest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.xiao.dbtest.domain.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, String> {
	Page<Product> findByNameStartingWith(String name, Pageable page);
}
