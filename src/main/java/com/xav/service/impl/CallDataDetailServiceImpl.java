package com.xav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xav.bean.drillDown.DrillDown;
import com.xav.chart.callDataDetail;
import com.xav.repository.CallDataDetailRepository;
import com.xav.repository.DrillDownRepository;
import com.xav.service.CallDataDetailService;

@Component
public class CallDataDetailServiceImpl implements CallDataDetailService{
	
	@Autowired
	CallDataDetailRepository callDataDetailRepository;
	@Autowired
	DrillDownRepository drillDownRepository;
	
	public List<callDataDetail> getCallDetail()
	{
		return callDataDetailRepository.findAll();
		
	}

	public List<callDataDetail> getCallDetailByLocation(String location)
	{
		return callDataDetailRepository.findByLocation(location);
	}

	@Override
	public List<DrillDown> getDrillDownDetailForALocation(String location) {
		// TODO Auto-generated method stub
		return drillDownRepository.findAll();
	}

}
