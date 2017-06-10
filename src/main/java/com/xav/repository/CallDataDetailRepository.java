package com.xav.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xav.chart.callDataDetail;

public interface CallDataDetailRepository extends MongoRepository<callDataDetail, Long>{
	
	List<callDataDetail> findByLocation(String location);

}
