package com.xav.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.xav.chart.ChartData;
@Component
public interface CallDetailRepository extends MongoRepository<ChartData,Long>{
	
	//List<ChartData> findAll();
	ChartData findByMap(String mapName);

}
