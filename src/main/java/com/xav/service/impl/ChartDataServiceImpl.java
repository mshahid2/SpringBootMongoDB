package com.xav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xav.chart.ChartData;
import com.xav.repository.CallDetailRepository;
import com.xav.service.ChartDataService;

@Component
public class ChartDataServiceImpl implements ChartDataService {
	
	@Autowired
	CallDetailRepository callDetailRepository;

	@Override
	public List<ChartData> getAllCallDatailsWithLocation() {
		// TODO Auto-generated method stub
		return callDetailRepository.findAll();
	}

	@Override
	public ChartData getDatByMap(String mapData) {
		// TODO Auto-generated method stub
		return callDetailRepository.findByMap(mapData);
	}

}
