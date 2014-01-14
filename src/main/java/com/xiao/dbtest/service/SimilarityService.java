package com.xiao.dbtest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xiao.dbtest.domain.Similarity;

public interface SimilarityService {

	Page<Similarity> findAll(Pageable page);
	void save(Iterable<Similarity> collection);
	Page<Similarity> findByRequestIdStartingWith(String requestId, Pageable page);
	Similarity findById(Integer id);
	Page<Similarity> findByRequestId(String requestId, Pageable page);
}
