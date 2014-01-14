package com.xiao.dbtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xiao.dbtest.domain.Product;
import com.xiao.dbtest.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository rep;
	
	@Override
	public Page<Product> findAll(Pageable page) {
		return rep.findAll(page);
	}

	@Override
	public void deleteAll() {
		rep.deleteAll();
	}

	@Override
	public Page<Product> findByNameStartingWith(String name, Pageable page) {
		return rep.findByNameStartingWith(name,page);
	}

	@Override
	public void save(Product p) {
		rep.save(p);
	}

}
