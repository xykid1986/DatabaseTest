package com.xiao.dbtest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xiao.dbtest.domain.Crime;

public interface CrimeRepository extends PagingAndSortingRepository<Crime, Integer> {

}
