package com.xav.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xav.bean.drillDown.DrillDown;

public interface DrillDownRepository extends MongoRepository<DrillDown, Long>{

}
