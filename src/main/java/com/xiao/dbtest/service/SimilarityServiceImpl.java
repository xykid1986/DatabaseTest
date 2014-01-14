package com.xiao.dbtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xiao.dbtest.domain.Similarity;
import com.xiao.dbtest.repository.SimilarityRepository;


@Service("similarityService")
public class SimilarityServiceImpl implements SimilarityService {

	@Autowired
	private SimilarityRepository rep;
	
	@Override
	public Page<Similarity> findAll(Pageable page) {
		return rep.findAll(page);
	}

	@Override
	public void save(Iterable<Similarity> collection) {
		rep.save(collection);
	}

	@Override
	public Page<Similarity> findByRequestIdStartingWith(String requestId, Pageable page) {
		return rep.findByRequestIdStartingWith(requestId, page);
	}

	@Override
	public Similarity findById(Integer id) {
		return rep.findOne(id);
	}

	@Override
	public Page<Similarity> findByRequestId(String requestId, Pageable page) {
		return rep.findByRequestId(requestId, page);
	}

}
