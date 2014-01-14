package com.xiao.dbtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xiao.dbtest.domain.Crime;
import com.xiao.dbtest.repository.CrimeRepository;

@Service("crimeService")
public class CrimeServiceImpl implements CrimeService {

	@Autowired
	private CrimeRepository rep;
	
	@Override
	public Page<Crime> findAll(Pageable page) {
		return rep.findAll(page);
	}

	@Override
	public void save(Iterable<Crime> collection) {
		rep.save(collection);
	}

	@Override
	public void deleteAll() {
		rep.deleteAll();
	}

}
