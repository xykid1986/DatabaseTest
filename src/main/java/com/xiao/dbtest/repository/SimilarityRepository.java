package com.xiao.dbtest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.xiao.dbtest.domain.Similarity;

public interface SimilarityRepository extends PagingAndSortingRepository<Similarity, Integer>{
	Page<Similarity> findByRequestIdStartingWith(String request_id, Pageable page);

	Page<Similarity> findByRequestId(String requestId, Pageable page);
}
