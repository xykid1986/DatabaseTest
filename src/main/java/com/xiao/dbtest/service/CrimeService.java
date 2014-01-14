package com.xiao.dbtest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xiao.dbtest.domain.Crime;

public interface CrimeService {
	Page<Crime> findAll(Pageable page);
	void save(Iterable<Crime> collection);
	void deleteAll();
}
